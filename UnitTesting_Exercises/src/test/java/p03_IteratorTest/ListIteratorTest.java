package p03_IteratorTest;

import junit.framework.TestCase;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest extends TestCase {

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowsExWhenIsEmpty() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator();

    }

    @Test
    public void testConstructorWorkingWithElements() throws OperationNotSupportedException {
        String[] arr = {"1", "2", "3"};
        ListIterator listIterator = new ListIterator(arr);
        int counter = 0;
        while (listIterator.hasNext()) {
            assertEquals(listIterator.print(), arr[counter]);
            counter++;
            listIterator.move();
        }
    }

    @Test
    public void testHasNextMethodWhenHasNextElement() throws OperationNotSupportedException {
        String[] arr = {"1", "2", "3"};
        ListIterator listIterator = new ListIterator(arr);
        assertTrue(listIterator.hasNext());
    }

    @Test
    public void testHasNextMethodWhenHasNotNextElement() throws OperationNotSupportedException {
        String[] arr = {"1"};
        ListIterator listIterator = new ListIterator(arr);
        assertFalse(listIterator.hasNext());
    }

    @Test
    public void testMoveMethodWhenHasNextElement() throws OperationNotSupportedException {
        String[] arr = {"1", "2", "3"};
        ListIterator listIterator = new ListIterator(arr);
        assertTrue(listIterator.move());

    }
    @Test
    public void testMoveMethodWhenHasNotNextElement() throws OperationNotSupportedException {
        String[] arr = {"1"};
        ListIterator listIterator = new ListIterator(arr);
        assertFalse(listIterator.move());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintMethodWhenElementsAreZero() throws OperationNotSupportedException {
        String[] arr = {};
        ListIterator listIterator = new ListIterator(arr);
    }
    @Test
    public void testPrintMethodWhenHasElements() throws OperationNotSupportedException {
        String[] arr = {"1", "2", "3"};
        ListIterator listIterator = new ListIterator(arr);
        int counter = 0;
        while (listIterator.hasNext()){
            assertEquals(listIterator.print(), arr[counter]);
            counter++;
            listIterator.move();
        }
    }

}