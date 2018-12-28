package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Object> stack = new ArrayList<>();

    public void push(Object element) {
        stack.add(element);
    }

    public Object pop() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("The stack is empty.");
        }
        return stack.remove(stack.size() - 1);
    }
}
