import java.util.Scanner;
class Sum{
    int add(int x, int y){
        return (x+y);
    }
}
public class SumByMethodCalling{
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a,b;
    System.out.println("Enter 1st number");
    a=scn.nextInt();
    System.out.println("Enter 2nd number");
    b=scn.nextInt();
    Sum addition = new Sum();
    int ans = addition.add(a, b);
    System.out.println(ans);
}
}