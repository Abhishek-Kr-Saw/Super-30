import java.util.*;

public class MissingNumber {
    
    //Brute force approach -> use an arr (initialise with zero).
    //      mark the index as 1 which is in the array.
    //      In second iteration just check which arrat index is marked as zero , just return that.
    
    public static int findMissingNumberBrute(int[] arr, int n) {
        int[] temp = new int[n + 1]; // array initialized with 0

        // First pass: mark the numbers present in arr
        for (int num : arr) {
            temp[num] = 1;
        }

        // Second pass: find the index which is still 0 (i.e., missing)
        for (int i = 0; i <= n; i++) {
            if (temp[i] == 0) {
                return i;
            }
        }

        return -1; // Should never reach here if one number is missing

        // Time  : O(n)
        // Space : O(n) (extra array)
    }

    public static int findMissingNumber(int[] arr, int n) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Compare each index with its value
        for(int i=0;i<n;i++){
            if(i != arr[i]) return i;
        }

        // Step 3: If all matched, then missing number is n
        return n; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size (should be n-1 if range is 0 to n)
        System.out.print("Enter the value of n (range is from 0 to n): ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // size is n because one number is missing in 0 to n range

        System.out.print("Enter " + (n) + " numbers from the range 0 to " + n + " (excluding one missing number): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Function call
        int missing = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}
