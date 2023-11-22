import java.util.Scanner;
public class TernaryOperator{
    public static void main(String[] arga){
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num = scn.nextInt();
        String ans;
        ans = (num%2==0) ? "even" : "odd";
        System.out.println(ans);
    }
}