package queue;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    @Test
    public void testQueueAndDeQueue() throws Exception {
        Queue queue = new Queue();
        queue.enQueue("apple");
        queue.enQueue("banana");
        queue.enQueue("pineapple");
        assertEquals(queue.deQueue(), "apple");
        assertEquals(queue.deQueue(), "banana");
        assertEquals(queue.deQueue(), "pineapple");
    }

    @Test(expected = Exception.class)
    public void testDeQueueEmptyQueue() throws Exception {
        Queue queue = new Queue();
        queue.deQueue();
    }

}
