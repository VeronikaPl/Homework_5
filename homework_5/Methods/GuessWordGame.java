package Methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWordGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String randomWord = words[random.nextInt(words.length)];
        System.out.println(Arrays.toString(words));
        System.out.print("Guess a word: ");
        String guess_word = scanner.nextLine().toLowerCase();
        while (!randomWord.equals(guess_word)){
            StringBuilder stringBuilder = new StringBuilder ("###############");
            int shortestWordLenght;
            shortestWordLenght = randomWord.length() < guess_word.length() ?
                    randomWord.length() : guess_word.length();
            for (int i = 0; i < shortestWordLenght; i++){
                if (guess_word.charAt(i) == randomWord.charAt(i)) {
                    stringBuilder.setCharAt(i, guess_word.charAt(i));
                }
            }
            System.out.println("Hint: " + stringBuilder);
            System.out.print("Wrong! Try again: ");
            guess_word = scanner.next().toLowerCase();
        }
        if (randomWord.equals(guess_word))
            System.out.println("Congratulations! You win!");
    }
}
