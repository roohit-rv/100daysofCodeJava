import java.util.Scanner;
public class SumOfNNaturalNumbers{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,i=1,sum=0;
        System.out.println("Enter any natural number");
        n=scn.nextInt();
        System.out.println("Printing the sum of natural numbers from 1 to " + n);
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}