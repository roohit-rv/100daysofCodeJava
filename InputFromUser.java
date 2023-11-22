import java.util.Scanner;
public class InputFromUser{
    public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
       System.out.println("Enter any number ");
       int num_1 = scn.nextInt();
       System.out.println("entered number is " + num_1);
       String name;
       System.out.println("Enter your name");
       name=scn.next();
       System.out.println("Your name is " + name);
       scn.nextLine();
       String full_name;
       System.out.println("Enter your full name");
       full_name=scn.nextLine();
       System.out.println("Your full name is " + full_name);


    }
}
