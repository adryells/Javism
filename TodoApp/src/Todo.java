import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

class Todo{
    public String title;
    public Date startDate;
    public Date endDate;
    public UUID id;

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
}
