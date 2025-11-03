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

    public static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }

     public static int sumOfArray(int[] arr, int N, int idx){
        if(N<idx) return 0;
        return  arr[idx]+sumOfArray(arr,N,idx+1);
     }
     public static boolean checkPalindrome(String s){
        return checkPalindromeHelper(s, 0, s.length()-1);
     }

     public static boolean checkPalindromeHelper(String s, int start, int end){
        if(start>end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return checkPalindromeHelper(s,start+1,end-1);
     }
    public static void main(String[] args) {
       String str ="ab";
       System.out.println(checkPalindrome(str));
    }
}
