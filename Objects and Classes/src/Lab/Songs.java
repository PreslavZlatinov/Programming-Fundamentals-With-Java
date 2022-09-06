package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

       private String typeList;
       private String name;
       private String time;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Songs> songs = new ArrayList<>();

        for (int i = 0; i <numberOfSongs ; i++) {
            String[] dataArray = scanner.nextLine().split("_");

            String type = dataArray[0];
            String name = dataArray[1];
            String time = dataArray[2];

            Songs song = new Songs();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = scanner.nextLine();
        
        if(typeList.equals("all")){
            for (Songs song : songs) {
                System.out.println(song.getName());
            }
        }
        else{
            for (Songs song : songs) {
                if(song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }

        }
    }
}
