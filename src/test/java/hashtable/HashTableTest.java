package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void putTest() {
        HashTable hashTable = new HashTable();
        hashTable.put("Daniel", "123");
        hashTable.put("Thales", "456");
        hashTable.put("Naves", "789");
        assertEquals("123", hashTable.get("Daniel"));
        assertEquals("456", hashTable.get("Thales"));
        assertEquals("789", hashTable.get("Naves"));
    }

    @Test
    public void collisionTest() {
        HashTable hashTable = new HashTable();
        hashTable.put("Joao", "123");
        hashTable.put("Maria", "456");
        assertEquals("123", hashTable.get("Joao"));
        assertEquals("456", hashTable.get("Maria"));
    }
}
