import java.util.Scanner;
class Sum{
    int x, y;
    Sum(int a, int b){
        x=a;
        y=b;
    }
    int add(){
        return (x+y);
    }
    int sub(){
        return (x-y);
    }
    int mul(){
        return(x*y);
    }
}
public class ParameterisedConstructor{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Sum answer = new Sum(5, 4);
        int ans = answer.add();
        System.out.println(ans);
        System.out.println(answer.sub());
        System.out.println(answer.mul());
        Sum answer2 = new Sum(9, 6);
        int ans2 = answer2.add();
        System.out.println(ans2);
        System.out.println(answer2.sub());
        System.out.println(answer2.mul());
    }
}