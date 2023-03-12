package Methods;

import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome(String source){
        if(source.isEmpty())
            return false;
        else {
            String reverse = "";
            for (int i = source.length() - 1; i >= 0; i--) {
                reverse += source.charAt(i);
            }
            return source.toLowerCase().equals(reverse.toLowerCase());
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String source = scanner.nextLine();
        System.out.println(isPalindrome(source));
    }
}
