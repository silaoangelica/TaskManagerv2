/*
* acts as the presentation / UI / controller‑equivalent for a console (CLI) application: it handles user input, prints menu, calls TaskManager for operations, shows output*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        System.out.println("Task manager start");
        System.out.println("------------------");

        while(true){
            System.out.println("Press an action");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Update a task");
            System.out.println("4. Mark task as completed");
            System.out.println("5. List all tasks");
            System.out.println("6. Exit");
            System.out.println("Enter choice: ");

            String input = scanner.nextLine();

           if(input.isBlank()){
               break;
           }

           if(input.equals("1")){
                //create a task
               System.out.println("Enter task description");
               String newTask = scanner.nextLine();
               taskManager.createTask(newTask);
               System.out.println("Added : " + newTask);
           } else if(input.equals("2")){
               //remove a task
               System.out.println("Select id of the task to remove");
               String id = scanner.nextLine();
               taskManager.removeTask(Integer.parseInt(id));
               System.out.println("Removed : " + id);
           } else if(input.equals("3")){
               //update a task
               System.out.println("Select id of task to remove");
               String id = scanner.nextLine();
               String description = scanner.nextLine();

               taskManager.updateTask(Integer.parseInt(id), description);
               System.out.println("Updated task : " + id);
               System.out.println("New value: " + description);
           } else if(input.equals("4")){
               //mark task as completed
               System.out.println("Insert id of task completed");
               String id = scanner.nextLine();
               taskManager.setCompleted(Integer.parseInt(id));
               System.out.println("Marked task " + id + " as completed");
           } else if(input.equals("5")){
               if(taskManager.allTasks().isEmpty()){
                   System.out.println("Task is empty, please create a task");
               } else {
                   for(Task t : taskManager.allTasks()){
                       System.out.println(t);
                   }
               }

           } else if(input.equals("6")){
               break;
           } else{
               break;
           }

        }


    }
}