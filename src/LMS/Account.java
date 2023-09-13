package LMS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Account {
    private List<String> users;
    private List<String> user_password;

   public Account(){
       System.out.println("Account");
       this.users = new ArrayList<>();
       this.user_password = new ArrayList<>();
       this.users.addAll(Arrays.asList("Seema","codevik","Naman","Jitender","jitender"));
       this.user_password.addAll(Arrays.asList("543211","543211","543211","543211","543211"));
    }
    public boolean use_exist(String user_name){
           return users.contains(user_name);
    }
    public void signup(){
       System.out.println("Please enter your user name");
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       users.add(input);
       System.out.println("Please enter you password");
       input = sc.nextLine();
       user_password.add(input);
    }
    public boolean password_match(String user_name, String password){
       int index = users.indexOf(user_name);
       return (user_password.get(index).equals(password));
    }
}
