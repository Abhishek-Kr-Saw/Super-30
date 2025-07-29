import java.util.Scanner;

public class MoveZeros {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // Function to move all zeros to the end
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int i=0, j=-1;

        while(i<n && arr[i] != 0){
            i++;
        }
        j = i;

        for(i=j+1;i<n;i++){
            if(arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
        }
    }

    // Function to print the array
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

        // Call function to move zeros
        moveZerosToEnd(arr);

        // Print result
        System.out.println("Array after moving zeros to the end:");
        printArray(arr);

        sc.close();
    }
}
