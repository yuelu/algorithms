package org.luyue.examples.datastructure;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import org.junit.Test;

public class ArrayStackTest {

    /**
     * <pre>
     * input: 5 4 3 2 - - 1 - - -
     * output: 2 3 1 4 5
     */
    @Test
    public void test() {

        ArrayStack<Integer> stack = new ArrayStack<>(5);

        assertThat(stack.isEmpty(), is(true));

        List<Integer> actual = new ArrayList<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        assertThat(stack.isEmpty(), is(false));

        actual.add(stack.pop());
        actual.add(stack.pop());
        stack.push(1);
        actual.add(stack.pop());
        actual.add(stack.pop());
        actual.add(stack.pop());

        assertThat(stack.isEmpty(), is(true));
        assertThat(actual.toString(), is("[2, 3, 1, 4, 5]"));

        try {
            actual.add(stack.pop());
            fail("Should throw stack empty exception");
        } catch (EmptyStackException e) {

        }
    }

    @Test
    public void testStackOverflow() {

        ArrayStack<Integer> stack = new ArrayStack<>(3);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        assertThat(stack.isEmpty(), is(false));

        try {
            stack.push(2);
            fail("Should throw StackOverflowError");
        } catch (StackOverflowError e) {

        }
    }
}
