import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int decimal,binary=0,power=1;
        System.out.println("Enter any Decimal Number");
        decimal=scn.nextInt();
        while(decimal>0){
            int parity=decimal%2;
            binary+=parity*power;
            power*=10;
            decimal/=2;
        }
        System.out.println("The binary number for the given decimal number is " + binary);
    }

}