import java.util.Scanner;
public class Pattern5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r;
        System.out.println("Enter the number of rows");
        r=scn.nextInt();
        for(int i=1;i<=r;i++){
           for(int j=i;j<r;j++){
               System.out.print(" ");
           }
           for(int k=1;k<=(2*i-1);k++){
               System.out.print("*");
           }
            System.out.println();
        }
    }

}