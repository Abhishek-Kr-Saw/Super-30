import java.util.Scanner;

public class MergeTwoSortedArray {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n+m];

        int i=0,j=0;
        int idx = 0;

        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                result[idx++] = arr1[i++];
            }else{
                result[idx++] = arr2[j++];
            }
        }

        while(i<n){
            result[idx++] = arr1[i++];
        }

        while(j<m){
            result[idx++] = arr2[j++];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Call merge function
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print merged array
        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
