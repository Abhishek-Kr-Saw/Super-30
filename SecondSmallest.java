import java.util.*;

public class SecondSmallest {

    // Brute force approach -> just sort and iterate  and check the second smallest element`.
    public static int secondLargestInArrayBrute(int[] arr, int n){
        int smallest = arr[0];
        int ssmallest = -1;

        Arrays.sort(arr);
        smallest = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] != smallest){
                ssmallest = arr[i];
                break;
            }
        }
        return ssmallest;

        // TC -> 0(nlogn + n).
        // sc -> 0(1)
        // but we changed the array.
    }

    // Better approach -> a two pass solution.
    public static int secondLargestInArrayBetter(int[] arr, int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        // First pass to get the smallest element.
        for(int i=1;i<n;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        // Second pass to get thessmallest
        for(int i=0;i<n;i++){
            if(arr[i] < ssmallest && arr[i] != smallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;

        // TC -> 0(2n)
        // SC -> 0(n)
    }

    // A one pass solution.
    public static int secondLargestInArrayOptimal(int[] arr,int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            if(arr[i] < smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] > smallest && arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;

        // TC -> 0(n)
        // SC -> 0(n)
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

        int ssmallest = secondLargestInArrayOptimal(arr,n);
        System.out.println("Second Smallest : "+ssmallest);
        sc.close();
    }
}
