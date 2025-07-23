import java.util.Scanner;

public class BubbleSort {
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // TC -> 0(N^2) : Since there is no early return therefore always 0(N^2).
        // SC -> 0(1).
    }

    public static void modifiedBubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            //If no swapping means array is already sorted.
            if(!swapped) break;
        }

        // TC -> 0(N^2) -> in best case (already sorted) because of early return  : 0(N).
        // SC -> 0(1).
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the element of array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        modifiedBubbleSort(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
