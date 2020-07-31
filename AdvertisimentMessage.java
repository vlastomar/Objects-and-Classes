import java.util.Random;
import java.util.Scanner;

public class AdvertisimentMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberMessages = Integer.parseInt(scan.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random randomPrint = new Random();

        for (int i = 0; i < numberMessages; i++) {
            int j = randomPrint.nextInt(phrases.length);
            int k = randomPrint.nextInt(events.length);
            int l = randomPrint.nextInt(author.length);
            int m = randomPrint.nextInt(cities.length);
            System.out.printf("%s%s%s-%s%n", phrases[j], events[k], author[l], cities[m] );

        }

    }
}
