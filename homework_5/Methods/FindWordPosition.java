package Methods;


import java.util.Scanner;

public class FindWordPosition {
    public static int findWordPosition(String source, String target){
        return source.indexOf(target);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String source = scanner.nextLine();
        System.out.print("Enter a target: ");
        String target = scanner.nextLine();
        System.out.println(findWordPosition(source, target));
    }
}
