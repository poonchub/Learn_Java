package week10.test.test1;

import java.util.Scanner;

public class User implements UserToolBox{

    private String firstName, middleName, lastName, password;
    private Email email;

    public User(){

    }
    public User(String name, Email email, String password){
        setName(name);
        this.email = email;
        this.password = password;
    }

    public void setName(String name){
        String [] str = name.split(" ");
        this.firstName = str[0];
        this.middleName = str[1];
        this.lastName = str[2];
    }

    public void getInfo(){
        System.out.print("Enter the password of "+"\""+email.getEmailAddress()+"\": ");
        Scanner sc = new Scanner(System.in);
        String checkPassword = sc.next();

        if (checkPassword.equals(password)){
            System.out.println("First name: "+firstName);
            System.out.println("Middle name: "+middleName);
            System.out.println("Last name: "+lastName);
            email.getInfo();
        }
        else {
            System.out.println("You don't have permission to access this information!");
        }
    }
}
