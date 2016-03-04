public class Node<T>{
    T value;
    Node prev;
    Node next;

    public Node(T value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

