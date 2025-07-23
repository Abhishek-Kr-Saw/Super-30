import java.util.*;

public class SecondLargest {

    // Brute force approach -> just sort and iterate from back and check the second largest element`.
    public static int secondLargestElementInArrayBrute(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);   // 0(nlogn);
        
        int largest = arr[n-1]; //0(n) at extreme case
        for(int i=n-2;i>=0;i--){
            if(arr[i] != largest){
                return arr[i];
            }
        }
        return -1;

        // TC -> 0(nlogn + n).
        // sc -> 0(1)
        // but we changed the array.
    }

    // Better approach -> a two pass solution.
    public static int secondLargestElementInArrayBetter(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int slargest = -1;

        //first pass to find the largest element
        for(int i=1;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        //second pass to get the second largest.
        for(int i=0;i<n;i++){
            if(arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        return slargest;

        // TC -> 0(2n)
        // SC -> 0(n)
    }

    public static int secondLargestElementInArrayOptimal(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int slargest = -1;
        
        for(int i=1;i<n;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;

        // TC -> 0(n)
        // SC -> 0(1)
    }

    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the element of array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans = secondLargestElementInArrayOptimal(arr);
        System.out.print("Second Largest is : "+ans);
        sc.close();
    }
}
