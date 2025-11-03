public class RecursionBasics {
    public static void namePrinter(String name, int num){
        if(num<=0) return;
        System.out.println(name);
        num=num-1;
        namePrinter(name,num);
    }
    public static int n_sum(int n, int sum){
        if(n<=0) return sum;
        sum+=n;
        n=n-1;
        return n_sum(n,sum);
    }
    public static void main(String[] args) {
        namePrinter("Adarsh",1);
        System.out.println(n_sum(5,0));
    }
}
