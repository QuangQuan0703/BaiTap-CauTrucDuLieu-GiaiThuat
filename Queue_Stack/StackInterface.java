package Queue_Stack;

public interface StackInterface<E> {
    public void push(E element);
    public E pop();
    public int size();
    public boolean isEmpty();
    public E top();
}

