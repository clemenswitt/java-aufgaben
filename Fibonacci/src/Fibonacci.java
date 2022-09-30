import java.util.Arrays;

public class Fibonacci {
    private int[] fibonacci;

    public Fibonacci() {
        fibonacci = new int[100];
    }

    public int[] getFibonacci() {
        return this.fibonacci;
    }

    public int[] berechne() {
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for(int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }

        // Ausgabe der berechneten Folge auf der Konsole
        System.out.println(Arrays.toString(fibonacci));

        return fibonacci;
    }
}
