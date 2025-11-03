public class RecursionBasics {
    public static void namePrinter(String name, int num){
        if(num<=0) return;
        System.out.println(name);
        num=num-1;
        namePrinter(name,num);
    }
    public static void main(String[] args) {
        namePrinter("Adarsh",5);
    }
}
