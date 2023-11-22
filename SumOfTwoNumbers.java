import java.util.Scanner;
public class SumOfTwoNumbers{
    public static void main(String[] args){
    int num1, num2;
    Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
    num1=scn.nextInt();
        System.out.println("Enter second number");
    num2=scn.nextInt();
    int sum=num1+num2;
        System.out.println("the sum of two numbers is - " + sum);
    }

}