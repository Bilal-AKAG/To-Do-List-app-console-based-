
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TodoList toDoList = new TodoList();
            while (true) {
                System.out.println("\nTo-Do List Menu:");
                System.out.println("1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Remove Task");
                System.out.println("4. Mark Task as Completed");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        toDoList.addTask(description);
                        break;
                    case 2:
                        toDoList.viewTasks();
                        break;
                    case 3:
                        System.out.print("Enter task number to remove: ");
                        int removeIndex = scanner.nextInt() - 1;
                        toDoList.removeTask(removeIndex);
                        break;
                    case 4:
                        System.out.print("Enter task number to mark as completed: ");
                        int completeIndex = scanner.nextInt() - 1;
                        toDoList.markTaskAsCompleted(completeIndex);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
   }
        }
    


    }
}