import java.util.*;

public class PerfectSquare {

    // Function to check if a number is a perfect square (Brute force).
    public static boolean isPerfectsquare(int num) {
        if (num < 0) return false; // Negative numbers can't be perfect squares

        int sqrt = (int)Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    //Better approach
    public static boolean isPerfectSquare(int num){
        if(num < 0) return false;
        int l = 1;
        int r = num/2;

        while(l <= r){
            int mid = l + (r - l)/2;
            long square = (long)mid * mid;

            if(square == num) return true;
            else if(square < num){
                l = mid+1;
            }else{
                r = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        scanner.close();
    }
}
