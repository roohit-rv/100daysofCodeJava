import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r;
        System.out.println("Enter the number of rows");
        r=scn.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}