import java.util.Scanner;

public class Fibonacci {
    // print all fibonacci upto n

    public static void fibonacciUptoN(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        
        for(int i=2;i<n;i++){
            int c = a + b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }

    //recursion method
    public static int fib(int n){
        if(n <= 1)return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        fibonacciUptoN(n);
        sc.close();
    }
}
