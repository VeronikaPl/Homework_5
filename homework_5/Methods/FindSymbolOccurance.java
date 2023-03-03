package Methods;


import java.util.Scanner;

public class FindSymbolOccurance {
    public static int findSymbolOccurance(String source, char letter){
        int count = 0;
        for (int i = 0; i < source.length(); i++) {
            if(source.charAt(i) == letter)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String source = scanner.nextLine();
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        System.out.println(findSymbolOccurance(source, letter));
    }
}
