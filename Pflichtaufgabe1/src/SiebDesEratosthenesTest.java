import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class SiebDesEratosthenesTest {

    // TESTS deleteMultiple

    // Normale Eingabe von Parametern
    @Test
    public void testDeleteMultipleNormalfall(){
        assertArrayEquals(new int[]{13, 2, 3, 7, 41}, SiebDesEratosthenes.deleteMultiple(2, new int[]{13, 2, 3, 4, 6, 7, 41, 22}));
    }

    // Worst case: Langer Array, keine Vielfachen von x im Array -> Langer Array muss ausgegeben werden
    @Test
    public void testDeleteMultipleWorstCase(){
        assertArrayEquals(new int[]{3,5,7,9,11,13,15,17}, SiebDesEratosthenes.deleteMultiple(2, new int[]{3,5,7,9,11,13,15,17}));
    }

    // Best case: Kurzer Array, Element in Array = erstes Vielfache von x
    @Test
    public void testDeleteMultipleBestCase(){
        assertArrayEquals(new int[]{}, SiebDesEratosthenes.deleteMultiple(3, new int[]{6}));
    }

    // Eine 0 wird immer aus dem Array sortiert (da 0 ein Vielfaches von allem ist) und 1 wird nie aussortiert
    @Test
    public void testDeleteMultiple0InArray(){
        assertArrayEquals(new int[]{1}, SiebDesEratosthenes.deleteMultiple(3, new int[]{0,1}));
    }

    // Rückgabe = leerer Array also nur
    @Test
    public void testDeleteMultipleLeererArray(){
        assertArrayEquals(new int[]{}, SiebDesEratosthenes.deleteMultiple(2, new int[]{8,4,28,10}));
    }

    // Exception wegen unzulässige Eingabe, x ist negativ
    @Test
    public void testDeleteMultipleNegativeEingabe(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> SiebDesEratosthenes.deleteMultiple(-1, new int[]{2,4}));
        assertEquals("x muss positiv sein", exception.getMessage());
    }

    // Exception wegen unzulässige Eingabe, Element in Array ist negativ
    @Test
    public void testDeleteMultipleNegativesElementInArray(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> SiebDesEratosthenes.deleteMultiple(2, new int[]{-2,2,4}));
        assertEquals("Kein Element des Arrays darf negativ sein", exception.getMessage());
    }


    // Tests eratoSieve

    // Normalfall
    @Test
    public void testEratoSieveNormalfall(){
        assertArrayEquals(new int[]{2,3,5,7,11,13,17,19,23,29}, SiebDesEratosthenes.eratoSieve(30));
    }

    // Exception x <= 0
    @Test
    public void testEratoSieveNegativeEingabe(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> SiebDesEratosthenes.eratoSieve(0));
        assertEquals("max muss größer 0 sein", exception.getMessage());
    }

    // Grenzfall, Eingabe = 1
    @Test
    public void testEratoSieveGrenzfall(){
        assertArrayEquals(new int[]{}, SiebDesEratosthenes.eratoSieve(1));
    }

    // Best case, Eingabe = 0
    @Test
    public void testEratoSieveBestCase(){
        assertArrayEquals(new int[]{}, SiebDesEratosthenes.eratoSieve(0));
    }

    // average Runtime
    @Test
    @Timeout(100)
    public void testEratoSieveRuntime(){
        SiebDesEratosthenes.eratoSieve(1000);
    }

    // Runtime worst case = hohe Zahl max
    @Test
    @Timeout(1000)
    public void testEratoSieveWorstRuntime(){
        SiebDesEratosthenes.eratoSieve(50000);
    }
}