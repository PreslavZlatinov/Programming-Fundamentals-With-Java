package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesV2 {
    String title;
    String content;
    String author;


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public ArticlesV2(String title, String content, String author) {
       this.title = title;
       this.content = content;
       this.author = author;
    }

    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<ArticlesV2> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String article = scanner.nextLine();
            String[] articleToArray = article.split(", ");
            ArticlesV2 articleToAdd = new ArticlesV2(articleToArray[0],articleToArray[1],articleToArray[2]);
            articles.add(articleToAdd);
        }

        String sortCriteria = scanner.nextLine();

        if(sortCriteria.equals("title")){
            articles.stream()
                    .sorted((a1,a2)->a1.getTitle().compareTo(a2.getTitle()))
                    .forEach(a -> System.out.println(a.toString()));
        }
        else if(sortCriteria.equals("content")){
            articles.stream()
                    .sorted((a1,a2)->a1.getContent().compareTo(a2.getContent()))
                    .forEach(a -> System.out.println(a.toString()));
        }
        else if(sortCriteria.equals("author")){
            articles.stream()
                    .sorted((a1,a2)->a1.getAuthor().compareTo(a2.getAuthor()))
                    .forEach(a -> System.out.println(a.toString()));
        }

    }
}
