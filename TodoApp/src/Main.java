import java.util.*;

public class Main {
    public static void main(String[] args) {
        TodoController todoController = new TodoController();
        InputTodoController inputTodoController = new InputTodoController();
        List<Todo> todoList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean system_on = true;
        Todo todo;

        while (system_on){
            System.out.println("""
            [0] - Sair
            [1] - Criar tarefa
            [2] - Atualizar tarefa
            [3] - Deletar tarefa
            [4] - Listar tarefas
            [5] - Detalhar uma tarefa
        """);
            System.out.println("Escolha uma opção acima: ");
            int option = scanner.nextInt();

            switch (option) {
                case 0 -> {
                    System.out.println("Finishing...");
                    system_on = false;
                }

                case 1 -> {
                    TodoUpdateParams params = new TodoUpdateParams();

                    params = inputTodoController.populateTodoParamsFromInputs(scanner, params);

                    todo = todoController.createTodo(params.title, params.startDate, params.endDate);
                    todoList.add(todo);
                }

                case 2 -> {
                    todoController.listTodosFromList(todoList);

                    String taskId = inputTodoController.getTodoIdFromInput(scanner);
                    Todo foundItem = todoController.getTodoByIdFromList(todoList, taskId);

                    TodoUpdateParams params = new TodoUpdateParams();
                    params.id = foundItem.id;

                    params = inputTodoController.populateTodoParamsFromInputs(scanner, params);
                    todoController.updateTodo(params, foundItem);
                }

                case 3 -> {
                    todoController.listTodosFromList(todoList);
                    String taskId = inputTodoController.getTodoIdFromInput(scanner);
                    Todo foundItem = todoController.getTodoByIdFromList(todoList, taskId);
                    todoList.remove(foundItem);

                    System.out.println("Deletando...\nRestaram:\n");
                    todoController.listTodosFromList(todoList);
                }


                case 4 -> {
                    todoController.listTodosFromList(todoList);
                }

                case 5 -> {
                    todoController.listTodosFromList(todoList);
                    String taskId = inputTodoController.getTodoIdFromInput(scanner);
                    todo = todoController.getTodoByIdFromList(todoList, taskId);
                    todoController.listDetailsFromTodo(todo);
                }

                default -> {
                    System.out.println("Not implemented.");
                }
            }
        }
    }
}
