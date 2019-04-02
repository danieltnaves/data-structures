package dynamicarray;

public class DynamicArray<T> {

    private int capacity;
    private Object[] array;
    private int pointer;

    public DynamicArray() {
        capacity = 100;
        array = new Object[capacity];
        pointer = 0;
    }

    public void add(T element) {
        if (pointer == capacity) {
            increaseCapacity();
        }
        array[pointer] = element;
        pointer++;
    }

    public void add(T element, int pos) {
        if (pos == pointer) {
            add(element);
            return;
        }

        for (int i = pos; i < pointer; i++) {
            array[i + 1] = i;
        }
        array[pos] = element;
        pointer++;
    }

    public void set(T element, int pos) {
        array[pos] = element;
    }

    private void increaseCapacity() {
        Object[] newCapacityArray = new Object[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            newCapacityArray[i] = array[i];
        }
        array = newCapacityArray;
        capacity = capacity * 2;
    }

    public int size() {
        return pointer;
    }

    public void delete(int pos) {
        if (pos <= pointer) {
            for (int i = pos; i < pointer; i++) {
                array[i] = array[i+1];
            }
            pointer--;
        }
    }

    public T get(int pos) {
        return (T) array[pos];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public boolean contains(T element) {
        for (int i = 0; i < pointer; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}
