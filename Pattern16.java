import java.util.Scanner;
public class Pattern16{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r,num=3;
        System.out.println("Enter the number of rows");
        r=scn.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.print("2");
            }
            else{
                for(int k=1;k<=i;k++){
                    System.out.print(num + " ");
                    num+=2;
                }
            }
            System.out.println();
        }
    }
}