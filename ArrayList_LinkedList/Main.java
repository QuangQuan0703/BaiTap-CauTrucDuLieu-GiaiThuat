package ArrayList_LinkedList;

public class Main {
    public static void main(String[] args) {
        Linked<Integer> linked = new Linked<Integer>();
        String a = "full";
        linked.insertAtHead(5);
        linked.print(a);
        linked.insertAtTail(0);
        linked.print(a);
        linked.insertAtHead(9);
        linked.print(a);
        linked.insertNodeIndex(45, 2);
        linked.print(a);
        linked.insertNodeIndex(45, 1);
        linked.print(a);
        linked.removeHead();
        linked.print(a);
        linked.removeTail();
        linked.print(a);
        linked.removeNodeIndex(1);
        linked.print(a);
    }
}
