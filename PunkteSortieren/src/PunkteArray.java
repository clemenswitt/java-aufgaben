import java.util.Arrays;
import java.util.Random;

public class PunkteArray {
    private Punkt[] punkte;

    public PunkteArray() {
        this.punkte = new Punkt[5];
    }

    public Punkt[] getPunkte() {
        return punkte;
    }

    public void fuellePunkteArray() {
        punkte[0] = new Punkt(0,0);
        for(int i = 1; i < punkte.length; i++) {
            Random randomGenerator = new Random();
            punkte[i] = new Punkt(randomGenerator.nextInt(10), randomGenerator.nextInt(10));
        }
    }

    public Punkt[] punkteSortieren() {
        Punkt tausch;
        double kuerzesterAbstand;
        double aktuellerAbstand;
        int position = 0;
        for(int i = 0; i < punkte.length-1; i++) {
            kuerzesterAbstand = 1000;
            for(int j = i+1; j < punkte.length; j++) {
                aktuellerAbstand = punkte[i].gibAbstand(punkte[j]);
                if(aktuellerAbstand < kuerzesterAbstand) {
                    kuerzesterAbstand = aktuellerAbstand;
                    position = j;
                }
            }
            tausch = punkte[i+1];
            punkte[i+1] = punkte[position];
            punkte[position] = tausch;
        }
        System.out.println("Sotiertes Punkte-Array: " + Arrays.toString(punkte));
        return punkte;
    }
}
