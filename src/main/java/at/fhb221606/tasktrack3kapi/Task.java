package at.fhb221606.tasktrack3kapi;

public class Task {

    private Integer id = 0;
    private String title;
    private boolean completed;

    public Task() {

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
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

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Task(Integer id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

}
