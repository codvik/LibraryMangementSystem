package todolist;

import java.util.List;
import java.util.Scanner;

public class Controller {
    public void startapplication(){
        Task task = new Task();
        TaskList task_list = new TaskList();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("okay so do you want to add data to your list or see the list");
            int choice = sc.nextInt();
            if (choice == 1){
                String created_task = task.create_task();
                task_list.add_task(created_task);
            }
            else if (choice ==2){
                List<String> my_task_list =task_list.get_list();
                System.out.println(my_task_list);
            }
            else{
                sc.close();
                break;

            }
        }

    }
}
