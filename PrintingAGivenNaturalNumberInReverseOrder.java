import java.util.Scanner;
public class PrintingAGivenNaturalNumberInReverseOrder{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter any natural number");
        n = scn.nextInt();
        System.out.println("printing reverse natural number from  " + n + " 1");
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}