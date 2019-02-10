package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private List<Integer> data;

    Heap() {
        data = new ArrayList<>();
    }

    /**
     * Insert at final position and Sift Up until the inserted element is in the correct order.
     *
     * @param key
     */
    public void insert(Integer key) {
        data.add(key);
        siftUp();
    }

    /**
     * Delete the max element a replace for the last element, after that the siftDown method sort the elements.
     *
     */
    public void delete() {
        if (!data.isEmpty()) {
            data.set(0, data.get(data.size() - 1));
            data.remove(data.size() - 1);
            siftDown();
        }
    }

    /**
     * Sift elements down to maintain the correct order for MAX HEAP.
     *
     * Left node = 2k + 1 (children)
     * Right node = 2k + 2 (children)
     *
     */
    private void siftDown() {
        int k = 0;
        int l = 2*k + 1;
        while (l < data.size()) {
            int max = l;
            int r = l + 1;
            if (r < data.size() && data.get(r) > data.get(l)) { //there is a right child
                max++;
            }
            if (data.get(k) < data.get(max)) {
                Integer aux = data.get(k);
                data.set(k, data.get(max));
                data.set(max, aux);
                k = max;
                l = 2*k + 1;
            } else {
                break;
            }
        }
    }

    /**
     * Sift elements up to maintain the correct order for MAX HEAP.
     *
     * Left node = 2k + 1 (children)
     * Right node = 2k + 2 (children)
     *
     * Get parent
     * 2p + 1 = k => p = (k-1) / 2
     *
     */
    private void siftUp() {
        int k = data.size() - 1;
        while (k > 0) {
            int p = (k-1) / 2;
            if (data.get(p) < data.get(k)) {
                Integer aux = data.get(p);
                data.set(p, data.get(k));
                data.set(k, aux);
                k = p;
            } else {
                break;
            }
        }
    }


    public List<Integer> getData() {
        return data;
    }

}
