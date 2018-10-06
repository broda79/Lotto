import java.util.Random;

public class Generator {

    Random rand = new Random();
    private int wylosowanaLiczba = rand.nextInt(48) + 1;

    public int getWylosowanaLiczba() {
        return wylosowanaLiczba;
    }

    public void setWylosowanaLiczba(int wylosowanaLiczba) {
        this.wylosowanaLiczba = wylosowanaLiczba;
    }
}
