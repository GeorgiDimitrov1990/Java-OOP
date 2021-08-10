package p01_Database;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {
    private static final Integer[] NUMBERS = { 5, 9, 29, 45};
    private Database database;

    @Before//изпълнява се преди всеки тест!
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }
    //Constructor testing
    //връща ли правилен обект
    @Test
    public void testConstructorHasToCreateValidObject() throws OperationNotSupportedException {

        assertEquals(4, database.getElements().length);
        Integer[] databaseNumbers = database.getElements();

        for (int i = 0; i < databaseNumbers.length; i++) {
            assertEquals(NUMBERS[i], databaseNumbers[i]);
        }
    }

    //хвърля ли ексепшън над 16 елемента
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowExWhenUseMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[17];
        new Database(numbers);
    }

    //хвърля ли ексепшън под 1 елемента
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowsExWhenUseLessThanOneElement() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[0];
        new Database(numbers);
    }

    //Add testing
    //подаване на хулл елемент
    @Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowExWhenParamIsNull() throws OperationNotSupportedException {
        database.add(null);
    }

    //правилна работа, добавя елемент в масица
    @Test
    public void testAddShouldAddElement() throws OperationNotSupportedException {


        database.add(17);
        assertEquals(5, database.getElements().length);
        assertEquals(Integer.valueOf(17), database.getElements()[4]);
    }

    //Remove testing
    //нямаме елементи;
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowExWithEmptyData() throws OperationNotSupportedException {

        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        //празен масив
        database.remove();
    }
    //тестваме дали премахва последният елемент
    @Test
    public void testRemoveShouldRemoveLastElement() throws OperationNotSupportedException {
        Database database = new Database(NUMBERS);

        database.remove();
        assertEquals(3, database.getElements().length);
        Integer[] elements = database.getElements();
        for (int i = 0; i < elements.length; i++) {
            assertEquals(elements[i], NUMBERS[i]);
        }
    }



}