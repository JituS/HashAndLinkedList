import org.junit.Test;

import static org.junit.Assert.*;

public class MyhashMapTest {
    @Test
    public void test_put_puts_the_value_associates_with_key() throws Exception {
        MyhashMap<String,String> hashMap = new MyhashMap<>(10);
        hashMap.put("india", "delhi");
        hashMap.put("pakistan", "islamabad");
        hashMap.put("karnataka", "bangalore");
        hashMap.put("UP", "lucknow");
        assertEquals(hashMap.get("UP"), "lucknow");
        assertEquals(hashMap.get("karnataka"), "bangalore");
        assertEquals(hashMap.get("pakistan"), "islamabad");
        assertEquals(hashMap.get("india"), "delhi");
    }

    @Test
    public void test_put_puts_the_value_associates_with_key_if_key_is_int_type() throws Exception {
        MyhashMap<Integer,String> hashMap = new MyhashMap<>(10);
        hashMap.put(1, "delhi");
        hashMap.put(2, "islamabad");
        hashMap.put(3, "bangalore");
        hashMap.put(5, "lucknow");
        assertEquals(hashMap.get(5), "lucknow");
        assertEquals(hashMap.get(3), "bangalore");
        assertEquals(hashMap.get(2), "islamabad");
        assertEquals(hashMap.get(1), "delhi");
    }
    @Test
    public void test_put_overwrite_the_keyValue_paire_is_it_same_key_is_already_there() throws Exception {
        MyhashMap<Integer,Integer> hashMap = new MyhashMap<>(10);
        hashMap.put(2, 4);
        hashMap.put(3, 9);
        hashMap.put(4, 16);
        hashMap.put(5, 25);
        hashMap.put(5, 10);
        assertEquals(hashMap.get(5), 10);
        assertEquals(hashMap.get(3), 9);
        assertEquals(hashMap.get(2), 4);
        assertEquals(hashMap.get(4), 16);
    }

}