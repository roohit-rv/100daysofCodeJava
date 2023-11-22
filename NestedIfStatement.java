import java.util.Scanner;
public class NestedIfStatement{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age=scn.nextInt();
        if(age<18){
            if(age<12){
                if(age<5){
                    System.out.println("You are a toddler");
                }
                else{
                    System.out.println("You are a children");
                }
            }
            else{
                System.out.println("You are a teenager");
            }
        }
        else{
            System.out.println("you are an adult");
        }
    }
}