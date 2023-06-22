package Account.arrayExercises;

public class MyStack {
    private int counter;
    private String[] elements;

    public MyStack(int stacks) {

        elements = new String[stacks];
    }

    public boolean isEmpty() {
        if (counter == 0) return true;{
        } return false;
    }

    public void push(String element) {
        elements[counter] = element;
        counter++;

    }

    public String pop() {
        counter--;
        return elements[counter];
    }
}
