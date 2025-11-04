public class ChallengeProblem {
    /*
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
    example ->
    529 = 5+2+9 = 16
    16= 1+6 = 7
    ans = 7
    */

    public static int solve(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(sum<10) return sum;
        return solve(sum);
    }
    public static void main(String[] args) {
        System.out.println(solve(529));
    }
}
