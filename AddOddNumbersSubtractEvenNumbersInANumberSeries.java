import java.util.Scanner;
public class AddOddNumbersSubtractEvenNumbersInANumberSeries{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter any number");
        n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0) {
                sum += i;
            }
                else{
                    sum-=i;
                }

        }
        System.out.println("Adding all the odd numbers and subtracting all the even numbers till "+ n +" is "+ sum);

    }

}