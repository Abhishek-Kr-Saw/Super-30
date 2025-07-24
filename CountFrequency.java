import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {

    public static void countFrequency(int[] arr) {
        // Your frequency counting logic here
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : arr){
            mp.put(num , mp.getOrDefault(num,0)+1);
        }

        System.out.println("Elements : Counts");

        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            System.out.println("  "+e .getKey()+"      :    "+e .getValue());
        }
        
        // TC -> 0(n) : n size of array
        // SC -> 0(n) : but for storing ans not for operation.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input from user
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function
        countFrequency(arr);

        sc.close();
    }
}
