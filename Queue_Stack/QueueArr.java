package Queue_Stack;

public class QueueArr<E> implements QueueInterface<E>{
    private E[] queue;
    private int n =0;
    private int top =0;
    private int count =0;
    private int default_size = 100;
    public QueueArr(int capacity){
        n = capacity;
        queue = (E[]) new Object[capacity];
    }
    public QueueArr(){
        n = default_size;
        queue = (E[]) new Object[default_size];
    }
    public void enqueue(E element){
        if (top == n){
            System.out.println("Queue is full");
            return;
        }
        else {
            queue[top] = element;
            top++;
        }
    }
    public E dequeue(){
        if (queue[count] == null){
            return null;
        }
        else {
            E value = queue[0];
            for (int i =0; i < queue.length; i++){
                if (i == queue.length-1){
                    queue[i] = null;
                }
                else {
                    queue[i] = queue[i+1];
                }
            }
            top--;
            return value;
        }
    }
    public boolean isEmpty (){
        return (top == 0);
    }

}
