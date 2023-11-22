public class BreakKeyword{
    public static void main(String[] args){
        int i=1,n=5;
        for(; ;){
            if(i>n){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}