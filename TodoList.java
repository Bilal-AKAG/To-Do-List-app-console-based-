import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;
    public  TodoList() {
        tasks = new ArrayList<>();
    }
   public void addTask(String discription ){
      tasks.add(new Task(discription));
      System.out.println("Task added successfully");
    
   }
   public void viewTasks(){
    if (tasks.isEmpty()) {
        System.out.println("No tasks available.");
   }
   else {
      for (int i =0;i<tasks.size();i++){
         System.out.println((i+1)+"."+tasks.get(i));
      }

   }

} 
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
