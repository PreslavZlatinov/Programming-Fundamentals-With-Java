import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int[] wagini = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();
        boolean isEmpty = false;


        for (int i = 0; i < wagini.length; i++) {
            if(peopleCount <= 0){
                break;
            }
            if(peopleCount>=4 && wagini[i]==0) {
                peopleCount -= 4;
                wagini[i] += 4;
            }
            else if(wagini[i]>0 && wagini[i]<4){
                if(peopleCount>=4){
                peopleCount -= 4- wagini[i];
                wagini[i] += 4 - wagini[i];}
                else{
                    wagini[i] += peopleCount;
                    peopleCount -= peopleCount;
                }
            }
            else{
                if (wagini[i]+peopleCount <= 4){
                wagini[i] += peopleCount;
                peopleCount -= peopleCount;}
            }
        }

        for (int i = 0; i < wagini.length; i++) {
            if(wagini[i]<4){
                isEmpty = true;
                break;
            }
        }

        if(peopleCount==0 && isEmpty){
            System.out.println("The lift has empty spots!");
            for (int i : wagini) {
                System.out.print(i + " ");
            }

        }
        else if(!isEmpty && peopleCount>0){
            System.out.printf("There isn't enough space! %d people in a queue!\n",peopleCount);
            for (int i : wagini) {
                System.out.print(i + " ");
            }
        }
        else{
            for (int i : wagini) {
                System.out.print(i + " ");
            }
        }
    }
}