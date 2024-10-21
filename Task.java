public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void markAsCompleted(){
        isCompleted = true;
    }
    
    public String toString(){
        return (isCompleted?"[✔]":"[❌]")+description;
}
}

