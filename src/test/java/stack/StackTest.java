package stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {


    @Test
    public void testPushAndPop() throws Exception {
        Stack stack = new Stack();
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");
        assertEquals("orange", stack.pop());
        assertEquals("banana", stack.pop());
        assertEquals("apple", stack.pop());
    }

    @Test(expected = Exception.class)
    public void testPopFromEmptyStack() throws Exception {
        Stack stack = new Stack();
        stack.pop();
    }

}
