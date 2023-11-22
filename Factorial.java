import java.sql.SQLOutput;
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,f=1,num=1;
        System.out.println("Enter any number");
        n=scn.nextInt();
       if(n!=0){
           while(n!=0){
               f*=num;
               System.out.println("Factorial of " + num + " is " + f);
               n--;
               num++;
           }
       }
       else{
           System.out.println("Factorial of 0 is 0");
       }
    }
}