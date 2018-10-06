import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class miniLotto {

    Generator nowaLiczba = new Generator();



//LinkedList<int>
//        for (int i = 0; i < 5; i++) {
//            LinkedList losowanie1 = new LinkedList();
//
//            losowanie1.add(nowaLiczba.getWylosowanaLiczba());
//
//            System.out.println(losowanie1);
//
//        }

List<Integer> losowanie1 = new ArrayList<>();

    public List<Integer> getLosowanie1() {
        for (int i=0 ; i<5 ; i++){
            losowanie1.add (nowaLiczba.getWylosowanaLiczba());
        }

        return losowanie1;
    }

}
