import java.util.Scanner;

public class GCD {

    //Brute force
    public static int GCD(int a, int b){
        int gcd = 1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        return gcd;

        // TC -> 0(min(a,b))
    }

    // Euclidean distance
    public static int gcd(int a, int b) {
        while(a > 0 && b > 0){
            if(a>b) a = a%b;
            else{
                b = b%a;
            }
        }

        if(a==0) return b;
        return a;

        // TC -> 0(logΦ min(a,b))
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = gcd(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
        }
    }
}
