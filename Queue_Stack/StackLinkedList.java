package Queue_Stack;

import java.util.Iterator;

public class StackLinkedList<E> implements StackLinkedList_Interface<E> {
    class Node {
        E element;
        Node next = null;
        public Node(E element){
            this.element = element;
        }
    }

    private Node stack = null;
    int length = 0;

    @Override
    public void push(E element) {
        // Thêm một phần tử vào stack
        if(length == 0){
            Node node = new Node(element);
            stack = node;
        }
        else{
            Node node = stack;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node(element);
        }
        length++;
    }

    @Override
    public E pop() {
        // Lấy một phần tử khỏi stack
        E elements = null;
        if (length == 0){
            return null;
        }
        else {
            if (stack.next == null){
                elements = stack.element;
                stack = null;
                length --;
            }
            else {
                Node node = stack;
                while (node.next != null){
                    node = node.next;
                }
                elements = node.element;
                remove();

            }
        }
        return elements;
    }
    public void remove (){
        Node node = stack;
        for (int i = 0; i < length-2; i++){
            node = node.next;
        }
        node.next = null;
        length--;
    }


    @Override
    public boolean isEmpty() {
        // Kiểm tra stack rỗng
        return length == 0;
    }

    @Override
    public E top() {
        // Lấy giá trị phần tử đầu tiên của stack
        return stack.element;
    }
    public int size(){
        return length;
    }

    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new StackIterator();
    }
    class StackIterator implements Iterator<E> {

        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return currentNode != null;
        }
        @Override
        public E next() {
            // TODO Auto-generated method stub
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }
}

