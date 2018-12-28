package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Object> queue = new ArrayList<>();

    public void enQueue(Object element) {
        queue.add(element);
    }

    public Object deQueue() throws Exception {
        if (queue.isEmpty()) {
            throw new Exception("The queue is empty");
        }
        return queue.remove(0);
    }

}
