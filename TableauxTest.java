import org.junit.Test;

import static org.junit.Assert.*;

public class TableauxTest {

    @Test
    public void trierDecroissantSSS() {
        int[] tab = {7,4,8,3,9,2,6,1,5};
        int[] expectedTab = {9,8,7,6,5,4,3,2,1};
        Tableaux.trierDecroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @Test
    public void maximum() {
        int[] tab = {7,4,8,3,9,2,6,1,5};
        int expectedResult = 9;
        int result = Tableaux.maximum(tab);
        assertEquals(expectedResult, result);
    }

    @Test
    public void minimum() {
        int[] tab = {7,4,8,3,9,2,6,1,5};
        int expectedResult = 1;
        int result = Tableaux.minimum(tab);
        assertEquals(expectedResult, result);
    }

    @Test
    public void moyenne() {
        int[] tab = {7,4,8,3,9,2,6,1,5};
        double expectedResult = 5.0;
        double result = Tableaux.moyenne(tab);
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void fouilleSeq() {
        int[] tab = {7,4,8,3,9,2,6,1,5};
        int expectedResult = 4;
        int result = Tableaux.fouilleSeq(tab, 9);
        assertEquals(expectedResult, result);
    }
}