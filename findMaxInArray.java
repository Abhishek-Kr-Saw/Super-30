import java.util.Scanner;

public class findMaxInArray {

    public static void maxElement(int[] nums){
        int max = nums[0];
        for(int i=1 ; i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.err.println("Maximum is : "+max);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the element of array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        maxElement(arr);
        sc.close();


        //Enter the size of array : 5
        // Enter the element of array : 2 3 4 5 1
        // Maximum is : 5
    }
}
