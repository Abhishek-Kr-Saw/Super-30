import java.util.Scanner;

public class ReverseString {

    public static void reverseString(String s){
        int n = s.length();
        System.err.println("size : "+n);
        int i = 0;
        int j = n-1;
        
        StringBuilder st = new StringBuilder(s);
        while(i < j){
            char temp = st.charAt(i);
            st.setCharAt(i,st.charAt(j));
            st.setCharAt(j,temp);
            i++ ;
            j--;
        }
        // String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed String : "+st.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        reverseString(str);

        sc.close();
    }
}
