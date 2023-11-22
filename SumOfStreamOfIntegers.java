import java.util.Scanner;
public class SumOfStreamOfIntegers{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter any integer to add AND enter 0 to stop");
        n=scn.nextInt();
        sum=sum+n;
        while(n!=0){
            System.out.println("Enter any integer to add AND enter 0 to stop");
            n=scn.nextInt();
            sum=sum+n;
        }
        System.out.println("The sum of all the given integers = " + sum);
    }
}