import java.util.Scanner;
public class IfElseStatement{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num = scn.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}