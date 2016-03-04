import org.junit.Test;

import static org.junit.Assert.*;
public class MyLinkedListTest {

    @org.junit.Test
    public void testAddFirst() throws Exception {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("hello");
        assertEquals(1,list.getSize());
        list.addFirst("bhai");
        assertEquals(2,list.getSize());
        assertEquals("bhai", list.get(0));
        assertEquals("hello", list.get(1));
    }

    @org.junit.Test
    public void testAddLast() throws Exception {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addLast("hello");
        assertEquals(1,list.getSize());
        list.addLast("bhai");
        assertEquals(2,list.getSize());
        assertEquals("hello", list.get(0));
        assertEquals("bhai", list.get(1));
    }

    @org.junit.Test
    public void testGet() throws Exception {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("hello");
        assertEquals(1,list.getSize());
        list.addFirst("bhai");
        assertEquals("bhai", list.get(0));
        assertEquals("hello", list.get(1));
    }

    @org.junit.Test
    public void testAddOn() throws Exception {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("hello");
        assertEquals(1,list.getSize());
        list.addOn(0,"bhai");
        list.addOn(1,"how");
        assertEquals("bhai", list.get(0));
        assertEquals("how", list.get(1));
        assertEquals("hello", list.get(2));
    }

}