package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {
    private static final Person[] PEOPLE = { new Person(1, "First"), new Person(2, "Second"), new Person(3, "Third")};
    private Database database;

    @Before//изпълнява се преди всеки тест!
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(PEOPLE);
    }
    //Constructor testing
    //връща ли правилен обект
    @Test
    public void testConstructorHasToCreateValidObject() throws OperationNotSupportedException {

        assertEquals(3, database.getElements().length);
        Person[] databaseNumbers = database.getElements();

        for (int i = 0; i < databaseNumbers.length; i++) {
            assertEquals(PEOPLE[i], databaseNumbers[i]);
        }
    }

    //хвърля ли ексепшън над 16 елемента
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowExWhenUseMoreThanSixteenElements() throws OperationNotSupportedException {
        Person[] numbers = new Person[17];
        new Database(numbers);
    }

    //хвърля ли ексепшън под 1 елемента
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowsExWhenUseLessThanOneElement() throws OperationNotSupportedException {
        Person[] numbers = new Person[0];
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


        database.add(new Person(4, "Forth"));
        assertEquals(4, database.getElements().length);
        assertEquals(4, database.getElements()[3].getId());
        assertEquals("Forth", database.getElements()[3].getUsername());
    }

    //Remove testing
    //нямаме елементи;
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowExWithEmptyData() throws OperationNotSupportedException {

        for (int i = 0; i < PEOPLE.length; i++) {
            database.remove();
        }
        //празен масив
        database.remove();
    }
    //тестваме дали премахва последният елемент
    @Test
    public void testRemoveShouldRemoveLastElement() throws OperationNotSupportedException {


        database.remove();
        Person[] elementsInDatabase = database.getElements();
        assertEquals(2, elementsInDatabase.length);
        assertEquals(2, elementsInDatabase[elementsInDatabase.length - 1].getId());
        assertEquals("Second", elementsInDatabase[elementsInDatabase.length - 1].getUsername());

        for (int i = 0; i < elementsInDatabase.length; i++) {
            assertEquals(elementsInDatabase[i], PEOPLE[i]);
        }
    }

    // find by username
    // подаваме параметър нулл
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameThrowExWithNullUsername() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    // нямаме хора
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByusernameThrowWithEmptyData() throws OperationNotSupportedException {
        database = new Database(null, null, null);
        database.findByUsername("First");
    }
    // ако не намерим точно 1 име
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameThrowIfSizeIsNotEqualsOne() throws OperationNotSupportedException {
        database = new Database();
        database.findByUsername("First");
    }

    // да намерим човек по username
    @Test
    public void testFindByUsernameReturnCorrectPerson() throws OperationNotSupportedException {
        Person resultPerson = database.findByUsername("First");
        assertEquals(1, resultPerson.getId());
        assertEquals("First", resultPerson.getUsername());
    }

    //find by id
    // нямаме хора
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdThrowWithEmptyData() throws OperationNotSupportedException {
        database = new Database(null, null, null);
        database.findById(1);
    }
    // ако не намерим точно 1 име
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIddThrowIfSizeIsNotEqualsOne() throws OperationNotSupportedException {
        database = new Database();
        database.findById(1);
    }

    // да намерим човек по username
    @Test
    public void testFindByIdReturnCorrectPerson() throws OperationNotSupportedException {
        Person resultPerson = database.findById(1);
        assertEquals(1, resultPerson.getId());
        assertEquals("First", resultPerson.getUsername());
    }
}