import java.util.*;

public class ArrayIntersection {

    // Function to find intersection of two arrays
    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> result = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        int i=0 , j=0;
        while(i<n && j<m){
            if(arr1[i] == arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and elements of first array
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input size and elements of second array
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Call the intersection function
        ArrayList<Integer> intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection of the arrays:");
        System.out.println(intersection);


        sc.close();
    }
}
