package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Article {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String toString(){
        return String.format("%s - %s: %s",this.title,this.content,this.author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] article = scanner.nextLine().split(", ");

        String title = article[0];
        String content = article[1];
        String author = article[2];

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] commandToArray = command.split(": ");

            if(command.contains("Edit")){
                content = commandToArray[1];
            }
            else if(command.contains("ChangeAuthor")){
                author = commandToArray[1];
            }
            else if(command.contains("Rename")){
                title = commandToArray[1];
            }
        }

        Article articleToPrint = new Article();
        articleToPrint.setContent(content);
        articleToPrint.setAuthor(author);
        articleToPrint.setTitle(title);

        System.out.println(articleToPrint.toString());
    }
}
