import java.util.*;

public class PunkteArray {
    private Punkt[] punkte;

    public PunkteArray() {

        // TODO: Punkte-Array initialisieren 

    }

    public Punkt[] getPunkte() {
        return punkte;
    }

    public void fuellePunkteArray() {
        punkte[0] = new Punkt(0,0);
        Random randomGenerator = new Random();
       
        // TODO: Übrige Punkte des Arrays unter Verwendung von randomGenerator mit zufälligen Punkten füllen

    }

    public Punkt[] punkteSortieren() {
        Punkt tausch;
        double kuerzesterAbstand;
        double aktuellerAbstand;
        int position = 0;
        for(int i = 0; i < punkte.length-1; i++) {
            kuerzesterAbstand = 1000;
            for(int j = i+1; j < punkte.length; j++) {
                
                // TODO: Sortieralgorithmus implementieren

            }
        }
        System.out.println("Sotiertes Punkte-Array: " + Arrays.toString(punkte));
        return punkte;
    }
}
