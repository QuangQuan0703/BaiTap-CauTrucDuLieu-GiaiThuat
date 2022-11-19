package Queue_Stack;
import java.lang.Iterable;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StackInterface<Integer> S = new StackArr<Integer>();
        S.push(5);
        S.push(3);
        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        S.push(7);
        S.push(9);
        System.out.println(S.top());
        S.push(4);
        System.out.println(S.size());
        System.out.println(S.pop());
        S.push(6);
        S.push(8);
        System.out.println(S.pop());
        QueueInterface<Integer> queueInterface = new QueueArr<>();
        System.out.println("QUEUE");
        queueInterface.enqueue(4) ;
        queueInterface.enqueue(321);
        System.out.println(
        queueInterface.dequeue());
        System.out.println(
        queueInterface.isEmpty());
        System.out.println(
        queueInterface.dequeue());
        System.out.println(
        queueInterface.isEmpty());
    }
}
