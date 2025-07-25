import java.util.*;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        HashMap<Character,Integer> mp = new HashMap<>();

        //Inorder to make case-insensitive 
        //s1 = s1.toLowerCase() , s2 = s2.toLowerCase()

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)-1);
            if (mp.get(ch) == 0) {
                mp.remove(ch);
            }
        }

        if(mp.size() == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check and display result
        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        sc.close();
    }
}
