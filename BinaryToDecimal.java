import java.util.Scanner;
public class BinaryToDecimal{
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int binary,decimal=0,power=1;
       System.out.println("Enter any binary number");
       binary=scn.nextInt();
       while(binary>0){
           int parity=binary%10;
           decimal+=parity*power;
           power*=2;
           binary/=10;
       }
       System.out.println("The decimal number of the given binary number is " + decimal);
        }
        }