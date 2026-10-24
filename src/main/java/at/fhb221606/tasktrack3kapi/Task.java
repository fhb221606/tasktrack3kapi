package at.fhb221606.tasktrack3kapi;

public class Task {

    private int id = 0;
    private String title;
    private boolean completed;

    public Task() {

    }

    public int getId() {
        return id;
    }
    public void setid(int id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getCompleted(){
        return completed;
    }

    public void setCompleted(boolean compelted){
        this.completed = completed;
    }

    public Task(int id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

}
