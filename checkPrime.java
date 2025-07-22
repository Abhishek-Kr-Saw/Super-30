import java.util.Scanner;
public class checkPrime {
    //check if a number is prime or not.

    public static boolean isPrime(int n){
        if(n <= 1)return false;
        if(n <= 3)return true;
        if(n%2 == 0 || n%3 == 0) return false;

        for(int i=5;i*i<=n;i+=6){
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if(isPrime(number)){
            System.out.println("Yes it is Prime!!");
        }else{
            System.out.println("No its not Prime!!");
        }
        sc.close();
    }
}
