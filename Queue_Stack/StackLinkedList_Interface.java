package Queue_Stack;
import java.lang.Iterable;
public interface StackLinkedList_Interface<E> extends Iterable<E> {
    public void push(E element);
    public E pop();
    public boolean isEmpty();
    public E top();
    public int size();
}
