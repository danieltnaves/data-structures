package hashtable;

public class HashTable {

    private int initialCapacity = 30;

    private Entry[] entries;

    public HashTable() {
        entries = new Entry[initialCapacity];
    }

    public void put(String key, String value) {
         int index = getIndex(key);
         Entry entry = new Entry(key, value);
         if (entries[index] == null) {
             entries[index] = entry;
             return;
         }
         Entry colisionEntry = entries[index];
         while (colisionEntry.next != null) {
             colisionEntry = colisionEntry.next;
         }
         colisionEntry.next = entry;
    }

    public String get(String key) {
        int index = getIndex(key);
        if (entries[index] != null) {
            Entry entry = entries[index];
            while (entry.next != null && !entry.key.equals(key)) {
                entry = entry.next;
            }
            return entry.value;
        }
        return null;
    }

    private int getIndex(String key) {
        int hashCode = key.hashCode() % initialCapacity;
        if (key.equals("Joao") || key.equals("Maria")) {
            return 4; //fake colision test
        }
        return hashCode < 0 ? hashCode * -1 : hashCode;
    }

    private class Entry {

        String key;
        String value;
        Entry next;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

    }
}
