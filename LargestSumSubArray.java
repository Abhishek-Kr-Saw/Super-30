import java.util.Scanner;

public class LargestSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call Kadane's algorithm
        int maxSum = largsetSum(arr);

        // Output the result
        System.out.println("Maximum subarray sum is: " + maxSum);

        sc.close();
    }

    
    public static int largestSumSubArray(int[] arr) {
        int n = arr.length;

        int result = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                result = Math.max(sum , result);
            }
        }
        return result; // Placeholder return
    }

    // Kadane's Algorithm
    public static int largsetSum(int[] arr){
        int n = arr.length;
        int maxSum = arr[0];
        int currSum = arr[0];

        for(int i=1;i<n;i++){
            currSum = Math.max(arr[i] , currSum+arr[i]);

            maxSum = Math.max(currSum , maxSum);
        }
        return maxSum;
    }
}
