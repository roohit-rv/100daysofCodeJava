public class LogicalOperator{
    public static void main(String[] args){
        int p=5, q=10, r=2;
        System.out.println(p<q && p<r);
        System.out.println(p<q && q>r && r>p);
        System.out.println(p<q && p>r && q>r);
        System.out.println(p<q || p<r);
        System.out.println(p<q || q>r || r>p);
        System.out.println(p<q || p>r || q>r);
        System.out.println(!(p>r));
        System.out.println(!(p>q));

    }

}