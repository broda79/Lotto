import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        //Losowanie l1 = new Losowanie();
//        System.out.println("start programu");
//
//        miniLotto l1 = new miniLotto();
//        Generator l2 = new Generator();
//
//        System.out.println(l2.getWylosowanaLiczba());
//        System.out.println(l1.losowanie1);
        Random rand = new Random();



        List<Integer> losowanie1 = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            int wylosowanaLiczba = rand.nextInt(48) + 1;
            losowanie1.add(wylosowanaLiczba);
        }
        System.out.println("Typowanie Małego Lotka : " + losowanie1);


        List<Integer> losowanieDuzegoLotka = new LinkedList<>();

        for(int i=0; i<6; i++){
            int wylosowanaLiczba = rand.nextInt(48)+1;
            losowanieDuzegoLotka.add(wylosowanaLiczba);
        }
        System.out.println("Typowanie Dużego Lotka: "+ losowanieDuzegoLotka );
    }

}


