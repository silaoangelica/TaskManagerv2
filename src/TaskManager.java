/*This is the repository file
* Handles CRUD management
* FOR NOW - FOR SIMPLICITY
* this acts as a service / repository‑combined class: it handles creation, update, removal, listing tasks (i.e. “business logic + data storage” in memory)
* */

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;

    //need to add because we are creating a new id for every new description
    private int id = 1;

    public TaskManager(){
        this.tasks = new ArrayList<>();
    }

    /**
     * Creates a new Task with a unique ID and the given description,
     * adds it to the task list, and returns the created Task.
     *
     * @param description  non-null, non-blank description for the new task
     * @return             the newly created Task object
     * @throws IllegalArgumentException if description is null or blank
     */

    public Task createTask(String description){
        if(description == null || description.isBlank()){
            throw new IllegalArgumentException("Description is empty.");
        }
        Task newTask = new Task(id++, description);
        tasks.add(newTask);
        return newTask;
    }

    //remove task based on Id
    public boolean removeTask(int id){
        for(Task task : tasks){
            if(task.getId() == id){
                tasks.remove(id);
                return true;
            }
        }
        return false;
    }

    //update the task based on id
    public boolean updateTask(int id, String newDescription){
        for(Task task : tasks){
            if(task.getId() == id){
                task.setDescription(newDescription);
                return true;
            }
        }
        return  false;
    }

  //read
    public List<Task> allTasks(){
        return new ArrayList<>(tasks);
    }

    //mark as completed
    public boolean setCompleted(int id){
        for(Task task : tasks){
            if(task.getId() == id){
                task.setCompleted(true);
                return true;
            }
        }
        return false;
    }
}
