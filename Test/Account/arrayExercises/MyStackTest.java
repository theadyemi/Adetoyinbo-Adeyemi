package Account.arrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    @Test
    public void stackExistTest(){
        MyStack newStack = new MyStack(5);
        assertNotNull(newStack);
    }

    @Test
    public void newStackIsEmptyTest(){
        MyStack newStack = new MyStack(5);
        assertTrue(newStack.isEmpty());

    }

    @Test
    public void pushX_stackShouldNotBeEmpty_Test(){
        MyStack newStack = new MyStack(5);
        newStack.push("G-String");
        assertFalse(newStack.isEmpty());
    }

    @Test
    public void pushX_popX_stackShouldBeEmptyTest(){
        MyStack newStack = new MyStack(5);
        newStack.push("E-String");
        newStack.pop();
        assertTrue(newStack.isEmpty());
    }

    @Test
    public void pushXAndY_popY_stackShouldNotBeEmptyTest(){
        MyStack newStack = new MyStack(5);
        newStack.push("G-String");
        newStack.push("E-String");
        assertFalse(newStack.isEmpty());
    }

    @Test
    public void pushX_shouldReturnX_whenPopped_Test(){
        MyStack newStack = new MyStack(5);
        newStack.push("D-String");
        String actual = newStack.pop();
        assertEquals("D-String", actual);
    }

    @Test
    public void pushXYZ_Z_stackShouldNotBeEmptyTest(){
        MyStack newStack = new MyStack(5);
        newStack.push("G-String");
        newStack.push("E-String");
        newStack.push("D-String");
        newStack.pop();
        String actual = newStack.pop();
        assertFalse(newStack.isEmpty());
    }

    @Test
    public void pushXYZ_removeZY_stackShouldNotBeEmptyTest(){
        MyStack newStack = new MyStack(5);
        newStack.push("G-String");
        newStack.push("E-String");
        newStack.push("D-String");
        newStack.pop();
        newStack.pop();
        String actual = newStack.pop();
        assertEquals("G-String", actual);
    }

    @Test
    public void push6Stacks_stackShouldNotBeEmptyTest(){
        MyStack newStack = new MyStack(5);
        newStack.push("G-String");
        newStack.push("E-String");
        newStack.pop();
        String actual = newStack.pop();
        assertEquals("G-String", actual);
    }
}