import java.util.*;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input rotation steps
        System.out.print("Enter number of steps to rotate left (K): ");
        int k = sc.nextInt();

        if(k > n){
            k = k%n;
            
        }

        // Call rotate function
        rotateLeft(arr, k);

        // Output result
        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;

        // Implement rotation logic here
        rotateArray(arr,0,k-1);
        rotateArray(arr,k,n-1);
        rotateArray(arr,0,n-1);
    }

    public static void rotateArray(int[] arr, int l , int r) {
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            r--;
            l++;
        }
    }
}
