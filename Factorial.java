import java.util.*;

public class Factorial {

    //Iterative method
    public static long factorial(int n){
        if(n == 0 || n == 1) return 1;
        long fact = 1;
        for(int i=2;i<=n;i++){
            fact *= i;
        }
        return fact;

        //TC -> 0(n) : effiecient for smalle number
    }

    //Recursive method
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);     // missing multiplication by n

        //TC -> 0(n) : the function makes n recursive calls.
        //SC -> 0(n) : due to the call stack from recursion.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        // Handle negative input by taking absolute value
        long sum = factorial(n);
        System.out.println("Factroial of "+n+" : "+sum);

        sc.close();
    }
}

