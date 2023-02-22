package Todo_finalProject;
import java.util.Scanner; 


public class App  extends TaskManager  {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        try (Scanner input = new Scanner(System.in)) {
            boolean cond = true ;  
            System.out.println("-------- Welcom to Todo App ---------");

            while (cond==true) { 
                System.out.println("\n --------- To do Task menu ----------");
                System.out.println("1. Add Task");
                System.out.println("2. Modify Task");
                System.out.println("3. Print Tasks");
                System.out.println("4. Delete Task");
                System.out.println("5. Mark as Done ");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();  

                switch (choice) {  // switch statement for run to do functions
                    case 1: 
                        // read from user task name 
                        System.out.println("--------- Add nwe  Task----------"); 
                        System.out.print("Enter your task : ");
                        input.nextLine();
                        String taskName = input.nextLine(); 
                        //read from user to do status 
                        System.out.print("Enetrt task status: "); 
                        String taskState = input.nextLine();
                        System.out.println("");
                        // add to arry list 
                        Task task1 = new Task(taskName, taskState);
                        taskManager.addTask(task1);
                        
                        break;

                    case 2 : 
                        System.out.println("--------- Modify Task----------");
                        // read from user task id 
                        System.out.print("enter your task id: ");
                        int ind = input.nextInt();

                        System.out.print("Enter your new task: ");
                        String e1 = input.nextLine();
                        String taskName1 = input.nextLine();
                        
                        System.out.print("enter new task state: ");
                        String taskStat = input.nextLine(); 
        
                        Task task = new Task(taskName1, taskStat); 
                        // add to arry list 
                        taskManager.modifyTask(ind , task);
                    case 3:
                    System.out.println("--------- dsply  Task----------");

                        taskManager.printTasks();

                        break;  

                    case 4 : 
                        System.out.println("--------- delet  Task----------");

                        System.out.print("Enter Task inedx: ");
                        int inde = input.nextInt();
                        taskManager.deleteTask(inde);
                        
                        break ; 
                     case 5 : 
                       System.out.println("--------- Mark  Task as done ----------");

                        System.out.print("Enter index of Task: ");
                        int indd = input.nextInt();
                        taskManager.markAsDone(indd);
                        break ;  
                    

                    case 6 : 
                     System.out.println("");
                     System.out.println("-------------- thank You for using Todo App --------------");
                     System.out.println("");
                     cond = false ;  
                     break;

                    default:

                        System.out.println("invalid choice ");
                        break ;

                }
                

            }  
        }












    /*Task task1 = new Task("Task 1", "Pending");
     Task task2 = new Task("Task 2", "In Progress");
     Task task3 = new Task("Task 3", "Pending");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        taskManager.printTasks();

        taskManager.modifyTask(1, new Task("Modified Task 2", "In Progress"));
        taskManager.printTasks();*/

            
            
    }
}
