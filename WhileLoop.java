import java.util.Scanner;
public class WhileLoop{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,i=1;
        System.out.println("ENter any natural number");
        n=scn.nextInt();
        System.out.println("Printing natural number from 1 to " + n);
        while(i<=n){
            System.out.println(i);
            i++;
        }

    }
}