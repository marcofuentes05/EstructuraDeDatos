package Clases;

import Interfaz.Radio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioImpTest {

    @Test
    void toggle() {
    }

    @Test
    void getState() {
        Radio r  = new RadioImp();
        Boolean esperado = true;
        Boolean real = r.getState();
        assertEquals(esperado,real);
    }

    @Test
    void changeFrequency() {
    }

    @Test
    void changeStation() {
    }

    @Test
    void getFrequency() {
        boolean esperado = true;
        Radio r = new RadioImp();
        boolean real = r.getFrequency();
        assertEquals(real, esperado);
    }

    @Test
    void saveStation() {
    }

    @Test
    void changeStationButton() {
    }

    @Test
    void getStation() {
        Radio r = new RadioImp();
        double real = r.getStation();
        double esperado = 87.9;
        assertEquals(esperado,real);
    }

    /**@Test
    void toString() {
        return null;
    }**/
}