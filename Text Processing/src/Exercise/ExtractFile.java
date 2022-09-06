package Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        int index = inputLine.indexOf('.');

        String fileType = inputLine.substring(index+1);

        String fileName = inputLine.substring(inputLine.lastIndexOf('\\')+1,index);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileType);
    }
}
