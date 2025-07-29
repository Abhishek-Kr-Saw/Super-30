import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int num) { //153 = 1^3 + 5^3 + 3^3 = 153
        int n = num;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += (digit*digit*digit);
            n /= 10;
        }
        return sum==num; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
