
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        String inputWords =  scan.nextLine();
        String[] wordsArr = inputWords.split(" ");

        Random rnd = new Random();
        for (int i = 0; i < wordsArr.length ; i++) {
            int j = rnd.nextInt(wordsArr.length);
            String index = wordsArr[i];
            wordsArr[i] = wordsArr[j];
            wordsArr[j] = index;
        }
        System.out.println(String.join(System.lineSeparator(),wordsArr));

    }
}
