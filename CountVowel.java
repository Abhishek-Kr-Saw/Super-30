import java.util.Scanner;

public class CountVowel {

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    public static int countVowels(String str) {
        int count = 0;
        for(char c : str.toCharArray()){
            if(isVowel(c)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Call your vowel counting function here
            int count = countVowels(input);

            System.out.println("Number of vowels: " + count);
        }
        // TC -> 0(n).
        // SC -> 0(1).
    }
}
