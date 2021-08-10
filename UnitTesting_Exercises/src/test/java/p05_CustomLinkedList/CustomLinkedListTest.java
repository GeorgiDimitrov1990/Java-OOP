package p05_CustomLinkedList;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CustomLinkedListTest extends TestCase {
    //Трябва да се довършат случаите, в които се хвърлят ексепшъни
    @Test
    public void testCustomLinkedListConstructor(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        int integer = linkedList.get(0);
        int integer1 = linkedList.get(1);
        Assert.assertEquals(1, integer);
        Assert.assertEquals(2, integer1);
    }

    @Test
    public void testGetMethod(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        int number = linkedList.get(0);
        assertEquals(1, number);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetMethodWhenIndexIsBiggerThanCount(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
      try {
          int number = linkedList.get(3);
      } catch (IllegalArgumentException ex){

      }

    }


    @Test
    public void testSetMethodWorkingProperly(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.set(0, 3);
        int number = linkedList.get(0);
        assertEquals(3, number);


    }

    @Test
    public void testAddMethod(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        int number = linkedList.get(0);
        assertEquals(1, number);

    }

    @Test
    public void testRemoveAtMethod(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.removeAt(0);
        int number = linkedList.get(0);
        assertEquals(2,number);
    }

    @Test
    public void testRemoveMethod(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        int index = linkedList.remove(1);
        assertEquals(0, index);
    }

    @Test
    public void testRemoveMethodWhenElementDoesNotExist(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        int index = linkedList.remove(4);
        assertEquals(-1, index);
    }

    @Test
    public void testMethodIndexOfWhenElementDoesNotExist(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        int index = linkedList.indexOf(4);
        assertEquals(-1, index);

    }
    @Test
    public void testMethodIndexOfWhenElementExist(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        int index = linkedList.indexOf(1);
        assertEquals(0, index);

    }

    @Test
    public void testContainsWhenElementDoesExist(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertTrue(linkedList.contains(1));

    }
    @Test
    public void testContainsWhenElementDoesNotExist(){
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertFalse(linkedList.contains(4));
    }






}