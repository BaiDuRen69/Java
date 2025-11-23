import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(add(n));
    }
    public static int add(int n){
        if(n<=1) return n;
        return add(n-1)+add(n-2);
    }
}
