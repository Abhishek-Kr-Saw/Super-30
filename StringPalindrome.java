import java.util.Scanner;

public class StringPalindrome {

    // Brute force -> reverse and match
    public static boolean isPalindrome(String s){

        //first convert all character into lowercase
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        //Reverse the string and match with the original one.
        String reversedString = new StringBuilder(s).reverse().toString();      //new StringBuilder(s) → O(n) , reverse() → O(n) , toString() → O(n)

        // Compare original with reversed
        return s.equals(reversedString);        //s.equals(reversedString) → O(n)

        // TC ->  O(n) + O(n) + O(n) + O(n) = O(n)
        // SC -> 0(n) -> for StringBuilder()
    }

    public static boolean isValidPalindrome(String s){

        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();    // clean the string

        int i=0, j = s.length()-1;
        while(i<j){ 
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

        // TC ->  O(n) for ttraversal
        // SC -> 0(1) no extra space required
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        if(isValidPalindrome(str)){
            System.out.print("String is palindrome.");
        }else{
            System.out.print("Not a palindrome string");
        }
        sc.close();
    }
}
