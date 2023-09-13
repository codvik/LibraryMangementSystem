package todolist;

import java.util.Scanner;

public class Task {
    public String create_task(){
        System.out.println("Enter the task");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }
}
