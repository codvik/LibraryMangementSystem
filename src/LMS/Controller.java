package LMS;

import java.util.Scanner;
public class Controller {
    Account account = new Account();
    private void sign_in(int choice){
        Scanner sc = new Scanner(System.in);
        while(choice ==1){
            System.out.println("Please enter your username");
            sc.nextLine();
            String user_name = sc.nextLine();
            boolean exist = account.use_exist(user_name);
            if(exist){
                System.out.println("Okay now enter the password");
                String password = sc.nextLine();
                boolean authenticated =account.password_match(user_name,password);
                if(authenticated)System.out.println("Authenticated");
                else System.out.println("Not authenticate want to try again");
            }
            else{
                System.out.println("don't exist");
                System.out.println("want to retry");
            }
            choice = sc.nextInt();
        }
    }
    public void startApplication(){
        System.out.println("Please enter 1 to login or 2 signup");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice ==1)
            sign_in(choice);
        if(choice ==2){
            account.signup();
            System.out.println("Please enter 1 to login");
            choice = sc.nextInt();
            if (choice ==1)
                sign_in(choice);
            else{
                System.out.println("Thanks for spending some time with us");
            }
        }
    }
}
