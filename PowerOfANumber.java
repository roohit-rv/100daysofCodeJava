import java.sql.SQLOutput;
import java.util.Scanner;
public class PowerOfANumber{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,p,ans=1;
        System.out.println("Enter any number and it's power");
        n=scn.nextInt();
        p=scn.nextInt();
        for(int i=0;i<p;i++){
            ans*=n;
        }
        System.out.println(n + "^" + p + "=" + ans);
    }
}