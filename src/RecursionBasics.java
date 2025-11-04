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


    public static boolean checkPrimeNumberHelper(int num, int i){
        if (num <= 2)
            return (num == 2);
        if (num % i == 0)
            return false;
        if (i * i > num)
            return true;
        return checkPrimeNumberHelper(num, i + 1);
    }
    public static boolean checkPrimeNumber(int num){
        return checkPrimeNumberHelper(num,2);
    }

    public static void reverseArrayHelper(int[] arr, int start, int end){
        if(start>end) return;
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArrayHelper(arr,start+1,end-1);
    }
    public static void reverseArray(int[] arr){
        reverseArrayHelper(arr,0,arr.length-1);
    }
    public static boolean checkSortedHelper(int[] arr, int i, int n){
        if(!(arr[i-1]<=arr[i])) return false;
        if(i==n) return true;
        i=i+1;
        return checkSortedHelper(arr,i,n);
    }
    public static boolean checkSorted(int[] arr){
        return checkSortedHelper(arr,1,arr.length-1);
    }

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       System.out.println(checkSorted(arr));
       reverseArray(arr);
       for(int num : arr){
           System.out.print(num+" ");
       }
       System.out.println();
       System.out.println(checkSorted(arr));
    }
}
