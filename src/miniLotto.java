import java.util.LinkedList;
import java.util.List;

public class miniLotto {

    Generator nowaLiczba = new Generator();



       public void losowanie() {

        for (int i = 0; i < 5; i++) {
            LinkedList losowanie1 = new LinkedList();

            losowanie1.add(nowaLiczba);

            System.out.println(losowanie1);
        }


    }
}
