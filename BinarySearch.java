import java.util.*;

public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int l = 0 , r = n-1;
        while(l <= r){
            int mid =l + (r - l) / 2;
    
            if(arr[mid] == target) return mid+1;
            else if(arr[mid] > target){
                r = mid-1;
            }else{
                l = mid + 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements (sorted)
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the target element to search
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        // Call binary search function
        int result = binarySearch(arr, target);

        // Output result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
