/**
 * The StackGeneric class represents a generic stack data structure using an array to store the elements.
 * @param <T> the type of elements stored in the stack
 */
public class StackGeneric<T> {
    private int size;
    private Element<T> top;

    /**
     * The Element class represents an element of the stack.
     * @param <T> the type of data stored in the element
     */
    private static class Element<T> {
        public T data;
        public Element<T> next;

        /**
         * Constructs an element with the specified data.
         * @param data the data to be stored in the element
         */
        public Element(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Constructs an empty stack.
     */
    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    /**
     * Adds the element to the top of the stack.
     * @param item the element to be pushed onto the stack
     */
    public void push(T item) {
        Element<T> newElement = new Element<>(item);
        newElement.next = top;
        top = newElement;
        size++;
    }

    /**
     * Removes and returns the element at the top of the stack.
     * @return the element at the top of the stack
     * @throws java.util.EmptyStackException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Returns number of items in stack
     * @return the number of items in this stack
     */
    public int size() {
        return size;
    }
}