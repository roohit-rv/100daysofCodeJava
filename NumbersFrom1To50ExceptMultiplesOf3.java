public class NumbersFrom1To50ExceptMultiplesOf3{
    public static void main(String[] args){
        int num=0;
        System.out.println("Using while loop");
        while(num<=50){
            num++;
            if(num%3==0){
                continue;
            }
            System.out.println(num);
        }
        System.out.println("using while loop");
        for(int i=1;i<=50;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}