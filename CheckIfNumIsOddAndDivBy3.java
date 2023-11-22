import java.util.Scanner;
public class CheckIfNumIsOddAndDivBy3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num = scn.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("correct number");
        }
        else{
            System.out.println("wrong number");
        }
    }
}