/* this file is the database, the model file. defines the data being used by the system
*/

public class Task {

    private int id;
    private String description;
    private boolean completed;

    public Task(int id, String description){
        this.id = id; //changeable? no, so setter not needed
        this.description = description; //changeable? yes, setter needed
        this.completed = false; // changeable? yes, setter needed. no need to declare on Task parameters because we are setting the default value to false so we can change it later
    }

    //setter
    public void setDescription(String description){
        this.description = description;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    //getter
    public int getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public boolean getCompleted(){
        return completed;
    }

    //use string
    //expected format: [x] 1: TestDescription
    public String toString(){
        return String.format("[%s], %d : %s ", completed ? "x" : " ", id, description);
    }


}
