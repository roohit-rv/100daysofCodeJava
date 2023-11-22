import java.util.Scanner;
public class CountTheDigitsOfAGiveNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,t,digits=0;
        System.out.println("enter any number");
        n=scn.nextInt();
        while(n!=0){
          t=n%10;
          digits++;
          n=n/10;
        }
        System.out.println("There are "+ digits +" in the given number");
    }
}