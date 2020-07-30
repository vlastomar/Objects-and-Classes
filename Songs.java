import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numSongs = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numSongs ; i++) {
            String[] data = scan.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song songN = new Song();

            songN.setTypeList(type);
            songN.setName(name);
            songN.setTime(time);

            songs.add(songN);
        }
        String typeList = scan.nextLine();
        if ("all".equals(typeList)){
            for(Song songN : songs){
                System.out.println(songN.getName());
            }

        }else {
            for(Song songN : songs){
                if (songN.getTypeList().equals(typeList)){
                    System.out.println(songN.getName());
                }
            }
        }
    }


}

