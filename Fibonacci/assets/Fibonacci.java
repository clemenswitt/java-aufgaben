import java.util.Arrays;

public class Fibonacci {
    private int[] fibonacci;

    public Fibonacci() {
        // TODO: Konstruktor vervollständigen
    }

    public int[] getFibonacci() {
        return this.fibonacci;
    }

    public int[] berechne() {
        // Initialisierung der ersten beiden Fibonacci-Zahlen
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // TODO: Berechnung der übrigen Elemente der Fibonacci-Folge mittels for-Schleife

        // Ausgabe der berechneten Folge auf der Konsole
        System.out.println(Arrays.toString(fibonacci));

        return fibonacci;
    }
}
