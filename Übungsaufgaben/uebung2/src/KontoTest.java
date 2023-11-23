import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class KontoTest {

    private Konto k;
    private float temp;

    @BeforeEach
    public void kontoErzeugen(){
        k = new Konto();
    }

    @Test
    void testGetKontostand() {

        assertEquals(0f, k.getKontostand());
    }

    @Test
    void testEinzahlen() {
        temp = k.getKontostand();
        k.einzahlen(10.5f);
        assertEquals(temp+10.5f , k.getKontostand());
        // assertThrows(IllegalArgumentException.class, () -> k.abheben(-50f));
        // () -> k.abheben()); == lambda: "anonymous method", define method without method head
    }

    @Test
    void testAbheben() {
        temp = k.getKontostand();
        k.abheben(10.5f);
        assertEquals(temp-10.5f, k.getKontostand());
        //assertThrows(IllegalArgumentException.class, () -> k.abheben(-50f));
    }

    @Test
    void testKontoIstLeer(){
        k.kontoIstLeer();
        assertTrue(0 == k.getKontostand());
    }

    @Test
    void testKontoInitialisierung() {
        temp = k.getKontostand();
        k.kontoInitialisierung();
        assertEquals(temp + 15, k.getKontostand());
    }

    @Test
    void testKontoLeeren(){
        k.kontoLeeren();
        assertEquals(0, k.getKontostand());
    }

    @Test
    void testAbhebenOhneDispo(){
        k.abhebenOhneDispo();
        assertEquals(0, k.getKontostand());
    }
}