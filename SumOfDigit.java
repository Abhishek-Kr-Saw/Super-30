import java.util.Scanner;
public class SumOfDigit {

    // Method to calculate the sum of digits of a number
    public static int sumOfDigit(int num){
        int sum = 0;
        int temp = num;

        // Extract digits one by one and add to sum
        while(temp > 0){
            sum += (temp%10);   // Get last digit
            temp /= 10;         // Remove last digit
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        // Handle negative input by taking absolute value
        int sum = sumOfDigit(Math.abs(n));
        System.out.println("Sum of digits is : "+sum);

        sc.close();
    }
}
