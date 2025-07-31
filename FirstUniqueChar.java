import java.util.*;

public class FirstUniqueChar {

    // Function to find first non-repeating character
    public static char firstNonRepeatingChar(String str) {
        int n = str.length();
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<n;i++){
            if(mp.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }

        return '\0'; // placeholder (null character)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = firstNonRepeatingChar(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
