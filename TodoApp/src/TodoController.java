import java.util.*;

class TodoUpdateParams {
    public String title;
    public String startDate;
    public String endDate;
    public UUID id;
}

class TodoController{
    public Todo createTodo(String title, String startDate, String endDate){

        return new Todo(
                title,
                startDate,
                endDate,
                UUID.randomUUID()
        );
    }

    public void updateTodo(TodoUpdateParams params, Todo todo){
        if (params.title != null){
            todo.setTitle(params.title);
        }

        if (params.endDate != null){
            todo.setEndDate(params.startDate);
        }

        if (params.startDate != null){
            todo.setStartDate(params.endDate);
        }

    }

    public Todo getTodoByIdFromList(List<Todo> todoList, String todoId){
        Optional<Todo> foundItem = todoList.stream()
                .filter(item -> Objects.equals(item.getId().toString(), todoId))
                .findFirst();

        return foundItem.orElse(null);
    }

    public void listTodosFromList(List<Todo> todoList){
        for(Todo currentTodo : todoList){
            System.out.println(currentTodo);
        }
    }

    public void listDetailsFromTodo(Todo todo) {
        System.out.println(todo);
    }
}
