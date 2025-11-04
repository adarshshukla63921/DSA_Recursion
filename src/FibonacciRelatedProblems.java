public class FibonacciRelatedProblems {
    public static int printNthFibonacciNumber(int n){
        if(n<=1) return n;
        return printNthFibonacciNumber(n-1)+printNthFibonacciNumber(n-2);
    }
    public static void main(String[] args) {
        System.out.println(printNthFibonacciNumber(2));
    }
}
