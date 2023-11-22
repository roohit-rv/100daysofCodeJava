import java.util.Scanner;
public class ForLoop{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("enter any natural number");
        n = scn.nextInt();
        System.out.println("printing natural number from 1 to " + n);
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}