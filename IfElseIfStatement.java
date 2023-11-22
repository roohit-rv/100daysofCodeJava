import java.util.Scanner;
public class IfElseIfStatement{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age=scn.nextInt();
        if(age<=12){
            System.out.println("you are a children");
        }
        else if(age>12 && age<18){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are an Adult");
        }
    }

}