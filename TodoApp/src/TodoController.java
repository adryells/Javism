import java.util.*;

class TodoUpdateParams {
    public String title;
    public String startDate;
    public String endDate;
    public UUID id;
}

class TodoController{
    public Todo createTodo(String title, String startDate, String endDate){
        Todo newTodo = new Todo();

        UUID uuid = UUID.randomUUID();

        newTodo.setTitle(title);
        newTodo.setStartDate(startDate);
        newTodo.setEndDate(endDate);
        newTodo.setId(uuid);

        return newTodo;
    }

    public Todo updateTodo(TodoUpdateParams params, Todo todo){
        if (params.title != null){
            todo.setTitle(params.title);
        }

        if (params.endDate != null){
            todo.setEndDate(params.startDate);
        }

        if (params.startDate != null){
            todo.setStartDate(params.endDate);
        }

        return todo;
    }

    public Todo getTodoByIdFromList(List<Todo> todoList, String todoId){
        Optional<Todo> foundItem = todoList.stream()
                .filter(item -> Objects.equals(item.getId().toString(), todoId))
                .findFirst();

        return foundItem.orElse(null);
    }

    public void listTodosFromList(List<Todo> todoList){
        for (int i = 0; i < todoList.toArray().length; i++) {
            Todo currentTodo = (Todo) todoList.toArray()[i];

            System.out.println("Task Id: " + currentTodo.id);
            System.out.println(currentTodo.title);
            System.out.println("\n");
        }
    }

    public void listDetailsFromTodo(Todo todo) {
        System.out.println("Title: " + todo.title);
        System.out.println("Start date: " + todo.startDate.toString());
        System.out.println("End Date: " + todo.endDate.toString());
        System.out.println("ID: " + todo.id);
    }
}
