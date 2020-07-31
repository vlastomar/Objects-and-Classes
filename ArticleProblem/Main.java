package ArticleProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];
        Article vlado = new Article(title, content, author);

        int numberOperation = Integer.parseInt(scan.nextLine());

        //List<ArticleProblem.Article> articleBody = new ArrayList<>();

        for (int i = 0; i < numberOperation ; i++) {
            input = scan.nextLine().split(": "); //izpolzvme sashtiya input shtoto gore veche ne ni tryabvaa
            switch (input[0]){
                case "Edit":

                    vlado.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    vlado.changeAuthor(input[1]);
                    break;
                case "Rename":
                    vlado.rename(input[1]);
                    break;
            }

        }
        System.out.println(vlado);
    }
}
