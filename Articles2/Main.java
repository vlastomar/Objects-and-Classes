package Articles2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        ArrayList<Article> articles = new ArrayList<>();
        String sortBy = "";

        for (int i = 0; i <= number ; i++) {
            String inputS = scan.nextLine();
            if ("title".equals(inputS) || "content".equals(inputS) || "author".equals(inputS)){
                sortBy = inputS;
                break;
            }
            String[] input = inputS.split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];
            Article vlado = new Article(title, content, author);
            articles.add(vlado);
        }
        switch (sortBy){
            case "title":
                articles
                        .stream()
                        .sorted((p1 , p2) -> p1.getTitle().compareTo(p2.getTitle()))
                        .forEach(p -> System.out.println(p));
                break;
            case "content" :
                articles
                        .stream()
                        .sorted((p1 , p2) -> p1.getContent().compareTo(p2.getContent()))
                        .forEach(p -> System.out.println(p));
                break;
            case "author":
                articles
                        .stream()
                        .sorted((p1 , p2) -> p1.getAuthor().compareTo(p2.getAuthor()))
                        .forEach(p -> System.out.println(p));
                break;
        }


    }
}
