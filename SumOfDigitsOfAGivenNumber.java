import java.util.Scanner;
public class SumOfDigitsOfAGivenNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,t,sum=0;
        System.out.println("enter any number");
        n=scn.nextInt();
        while(n!=0){
            t=n%10;
            sum+=t;
            n=n/10;
        }
        System.out.println("The sum of all the digits in the given number is "+ sum);
    }
}