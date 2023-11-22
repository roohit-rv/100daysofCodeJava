import java.util.Scanner;
public class PrintingNumbersUsingDoWhileLoop{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,i=1;
        System.out.println("enter any natural number");
        n=scn.nextInt();
        System.out.println("printing natural numbers from 1 to " + n);
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}