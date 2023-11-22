import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        float p, r, t, simpleInterest;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter principle ");
        p=scn.nextFloat();
        System.out.println("Enter rate of interest ");
        r=scn.nextFloat();
        System.out.println("Enter time ");
        t=scn.nextFloat();
        simpleInterest=(p*r*t)/100;
        System.out.println("the simple interest according to the given data - " + simpleInterest);
    }

}