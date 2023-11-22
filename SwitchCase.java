import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int day;
        System.out.println("Enter any day between 1 and 7");
        day = scn.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Input valid number from 1 to 7");
                break;
        }

    }


}