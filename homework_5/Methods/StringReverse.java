package Methods;


import java.util.Scanner;

public class StringReverse {
    public static String stringReverse(String source){
        if(source.isEmpty())
            return "String is empty";
        else {
            char[] temp = new char[source.length()];
            for (int i = 0; i < source.length(); i++) {
                temp[source.length() - i - 1] = source.charAt(i);
            }
            return "Reverse word: " + String.valueOf(temp);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String source = scanner.nextLine();
        System.out.println(stringReverse(source));
    }
}
