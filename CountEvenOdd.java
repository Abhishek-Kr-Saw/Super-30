import java.util.Scanner;

public class CountEvenOdd {
    /**
     * Counts and prints the number of even and odd numbers in the given array.
     * @param nums the array of integers to analyze
     */

    public static void countEvenOdd(int[] nums){
        int n = nums.length;

        int evenCount = 0;
        int oddCount = 0;
        for(int num : nums){
            if(num   % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Number of Even : "+evenCount);
        System.out.println("Number of Odd : "+oddCount);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        countEvenOdd(arr);

        sc.close();
    }
}
