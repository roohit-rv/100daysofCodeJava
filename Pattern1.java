import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows");
        r=scn.nextInt();
        System.out.println("Enter the number of columns");
        c=scn.nextInt();
        for (int i = 1;i<=r;i++) {
            for (int j=1;j<=c;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}