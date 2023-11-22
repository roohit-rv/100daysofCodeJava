import java.util.Scanner;
public class ReverseTheGivenNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,t,reverseNum=0;
        System.out.println("enter any number");
        n=scn.nextInt();
        while(n!=0){
            t=n%10;
            reverseNum=(reverseNum+t)*10;
            n=n/10;
        }
        reverseNum/=10;
        System.out.println("The reverse of the given number is "+ reverseNum);
    }
}