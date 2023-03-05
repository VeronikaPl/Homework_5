package Methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWordGame {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};
    String randomWord = words[random.nextInt(words.length)];

    public void StartGame(){
        System.out.println(Arrays.toString(words));
        System.out.print("Guess a word: ");
        String guessWord = scanner.nextLine().toLowerCase();
        while (!randomWord.equals(guessWord)){
            StringBuilder stringBuilder = new StringBuilder ("###############");
            int shortestWordLenght = randomWord.length() < guessWord.length() ?
                    randomWord.length() : guessWord.length();
            for (int i = 0; i < shortestWordLenght; i++){
                if (guessWord.charAt(i) == randomWord.charAt(i)) {
                    stringBuilder.setCharAt(i, guessWord.charAt(i));
                }
            }
            System.out.println("Hint: " + stringBuilder);
            System.out.print("Wrong! Try again: ");
            guessWord = scanner.next().toLowerCase();
        }
        if (randomWord.equals(guessWord))
            System.out.println("Congratulations! You win!");
    }

    public static void main(String[] args) {
        GuessWordGame guessWordGame = new GuessWordGame();
        guessWordGame.StartGame();
    }
}
