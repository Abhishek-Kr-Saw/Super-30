import java.util.Scanner;

public class BinaryToDecimal {

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binaryStr) {
        int n = binaryStr.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            int digit = binaryStr.charAt(i) - '0';
            ans = ans * 2 + digit;  
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = sc.nextLine();

        int decimal = binaryToDecimal(binaryStr);
        System.out.println("Decimal equivalent: " + decimal);
        
        sc.close();
    }
}
