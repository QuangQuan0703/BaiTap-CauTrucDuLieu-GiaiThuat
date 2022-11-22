package ArrayList_LinkedList;

public class Linked<T> {
    Node head = null;
    int lenght=0;
    public class Node{
        T data;
        Node next = null;
        public Node(T data){
            this.data = data;
        }
    }
    public void insertAtHead(T data){
        if (lenght != 0){
            Node nodeHead = new Node(data);
            nodeHead.next =head;
            head = nodeHead;
        }
        else {
            Node nodeHead = new Node(data);
            head = nodeHead;
        }
        lenght++;
    }
    public Node getNodeIndex(int index){
        Node nodeIndex = head;
        if (lenght != 0){
            if (index == 0){
                return this.head;
            }
            else if (index >0 && index < lenght ){
                for (int i =0; i < index; i++){
                    nodeIndex = nodeIndex.next;
                }
            }
        }
        return nodeIndex;
    }
    public void insertAtTail (T data){
        if (lenght != 0){
            Node nodeTail = new Node(data);
            this.getNodeIndex(lenght - 1).next = nodeTail;
        }
        else {
            this.insertAtHead(data);
        }
        lenght++;
    }
    public void insertNodeIndex(T data, int index){
        if (index == 0){
            this.insertAtHead(data);
        }
        else if (index == lenght -1){
            this.insertAtTail(data);
        }
        else if (index >0 || index < lenght-1){
            Node nodeIndex = this.getNodeIndex(index);
            Node nodeAdd = new Node(data);
            Node node = this.getNodeIndex(index -1);
            node.next = nodeAdd;
            nodeAdd.next = nodeIndex;
            lenght++;
        }
    }
    public void print (int index){
        System.out.println(this.getNodeIndex(index).data);
    }
    public void removeHead (){
        Node node = this.getNodeIndex(1);
        head = node;
        lenght--;
    }
    public void removeTail (){
        this.getNodeIndex(lenght - 2).next = null;
        lenght--;
    }
    public void removeNodeIndex(int index){
        if (index == 0){
            this.removeHead();
        }
        else if (index == lenght-1){
            this.removeTail();
        }
        else {
            Node nodeFirst = this.getNodeIndex(index-1);
            Node nodeSecond = this.getNodeIndex(index+1);
            nodeFirst.next = nodeSecond;
        }
        lenght--;
    }
    public  void print (String arg){
        String s = "full";
        if (arg.equals(s)){
            for(int i =0; i < lenght; i++){
                T a = this.getNodeIndex(i).data;
                System.out.print(" " + a + " ");
            }
            System.out.println();
        }
    }
}
