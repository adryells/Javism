import java.util.Scanner;

public class InputTodoController {
    public String getTodoIdFromInput(Scanner scanner){
        System.out.println("Type the task Id you want update: ");

        return scanner.next();
    }

    public TodoUpdateParams populateTodoParamsFromInputs(Scanner scanner, TodoUpdateParams params){
        System.out.println("Title: (empty if you don't want change) \n");
        scanner.nextLine();
        params.title = scanner.nextLine();

        System.out.println("Data de inicio: (formato: 2023-10-02)");
        params.startDate = scanner.nextLine();

        System.out.println("Data final: (formato: 2023-10-02)");
        params.endDate = scanner.nextLine();

        return params;
    }
}
