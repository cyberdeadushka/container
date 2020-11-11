import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit tests.
 */
public class MyArrayTest {

    /**
     * Test for addEl().
     */
    @Test
    public void addEl() {
        MyArray actualArr = new MyArray(2);

        actualArr.addEl(9);
        assertEquals(3, actualArr.getLength());
        assertEquals(9, actualArr.getEl(2));
    }

    /**
     * Test for indexAdd().
     */
    @Test
    public void indexAdd() {
        MyArray actualArr = new MyArray(4, 1);
        actualArr.indexAdd(1, 9);

        assertEquals(9, actualArr.getEl(1));
        assertEquals(5, actualArr.getLength());
    }

    /**
     * Test for deleteEl().
     */
    @Test
    public void deleteEl() {
        MyArray actualArr = new MyArray(4, 1);
        actualArr.indexAdd(0, 2);
        for (int i=1; i< actualArr.getLength()-1;i++)
            actualArr.deleteEl(i);
        assertEquals(2, actualArr.getEl(0));
    }

    /**
     * Test for getEl().
     */
    @Test
    public void getEl() {
        MyArray actualArr = new MyArray(3, 7);
        actualArr.indexAdd(2, 1);
        assertEquals(1, actualArr.getEl(2));
    }
}