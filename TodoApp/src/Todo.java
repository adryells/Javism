import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

class Todo{
    public String title;
    public Date startDate;
    public Date endDate;

    public UUID id;

    public Todo(String title, String startDate, String endDate, UUID id){
        this.title = title;
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.id = id;
    }

    String formatPattern = "yyyy-MM-dd";
    SimpleDateFormat dateFormat = new SimpleDateFormat(formatPattern);


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Date getStartDate(){
        return this.startDate;
    }

    public void setStartDate(String startDate){
        try {
            this.startDate = dateFormat.parse(startDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getEndDate(){
        return this.endDate;
    }

    public void setEndDate(String endDate){
        try {
            this.endDate = dateFormat.parse(endDate);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Id: %s%nTitle: %s%nStart Date: %s%nEnd Date: %s", id.toString(), title, startDate, endDate);
    }
}
