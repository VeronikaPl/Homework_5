package Methods;


import java.util.Scanner;

public class FindWordPosition {
    public static void findWordPosition(String source, String target){
        if(source.isEmpty() || target.isEmpty())
            System.out.println("Some of strings is empty");
        else
            System.out.println(source.indexOf(target));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String source = scanner.nextLine();
        System.out.print("Enter a target: ");
        String target = scanner.nextLine();
        findWordPosition(source, target);
    }
}
