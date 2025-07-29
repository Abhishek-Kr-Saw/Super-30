import java.util.Scanner;

public class RotateArray {

    public static void rotate(int[] arr,int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    // Function to left rotate the array by k steps
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;       
        rotate(arr,0,k-1);
        rotate(arr,k, n-1);
        rotate(arr,0,n-1);
    }

    // Function to right rotate the array by k steps
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;       
        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k, n-1);
    }

    //Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number of rotations
        System.out.print("Enter number of left rotations (k): ");
        int k = sc.nextInt();

        // Call left rotate function
        leftRotate(arr, k);

        // Print rotated array
        System.out.println("Array after left rotation:");
        printArray(arr);

        sc.close();
    }
}
