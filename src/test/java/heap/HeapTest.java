package heap;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;

public class HeapTest {

    @Test
    public void heapInsertionTest() {
        Heap heap = new Heap();
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(10);
        Assert.assertThat(Arrays.asList(30, 10, 20, 10), is(heap.getData()));
    }

    @Test
    public void heapDeletionTest() {
        Heap heap = new Heap();
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(10);
        heap.delete();
        Assert.assertThat(Arrays.asList(20, 10, 10), is(heap.getData()));
    }
}
