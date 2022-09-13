import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PunkteArrayTest {

    @Test
    void checkArraySize() {
        PunkteArray arr = new PunkteArray();
        assertEquals(5, arr.getPunkte().length);
    }

    @Test
    void checkGeneratedPoints() {
        PunkteArray arr = new PunkteArray();
        arr.fuellePunkteArray();
        for(Punkt p : arr.getPunkte()) {
            assertTrue(p.getX() >= 0 && p.getX() <= 10);
            assertTrue(p.getY() >= 0 && p.getY() <= 10);
        }
    }

    @Test
    void checkPointOrder() {
        PunkteArray arr = new PunkteArray();
        arr.fuellePunkteArray();
        Punkt[] arrCopy = Arrays.copyOf(arr.getPunkte(), arr.getPunkte().length);
        assertArrayEquals(sort(arrCopy), arr.punkteSortieren());
    }

    Punkt[] sort(Punkt[] arr) {
        Punkt tausch;
        double kuerzesterAbstand;
        double aktuellerAbstand;
        int position = 0;
        for(int i = 0; i < arr.length-1; i++) {
            kuerzesterAbstand = 1000;
            for(int j = i+1; j < arr.length; j++) {
                aktuellerAbstand = arr[i].gibAbstand(arr[j]);
                if(aktuellerAbstand < kuerzesterAbstand) {
                    kuerzesterAbstand = aktuellerAbstand;
                    position = j;
                }
            }
            tausch = arr[i+1];
            arr[i+1] = arr[position];
            arr[position] = tausch;
        }
        return arr;
    }
}