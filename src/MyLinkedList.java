import java.util.Iterator;
import java.util.function.Consumer;

public class MyLinkedList<T> implements Iterator{
    private Node first;
    private Node last;
    private int size;
    private int index;

    public MyLinkedList() {
        this.last = null;
        this.first = null;
        this.size = 0;
        this.index = 0;
    }

    public int getSize() {
        return size;
    }

    public int addFirst(T element){
        Node node = new Node(element);
        if(size == 0){
            first = last = node;
        }else{
            node.next = first;
            first.prev = node;
            first = node;
        }
        size++;
        return size;
    }
    public int addLast(T element){
        Node node = new Node(element);
        if(size == 0){
            first = last = node;
        }else{
            node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
        return size;
    }

    public Object get(int i) throws Exception{
        if(i > size-1) throw new Exception();
        Node n = first;
        int p = 0;
        while(p != i){
            n = n.next;
            p++;
        }
        return n.value;
    }
    public Object addOn(int i, T element) throws Exception{
        if(i > size-1) throw new Exception();
        if(i == 0) return this.addFirst(element);
        Node n = first;
        int p = 0;
        while(p != i){
            n = n.next;
            p++;
        }
        Node newNode = new Node(element);
        n.prev.next = newNode;
        newNode.prev = n.prev;
        newNode.next = n;
        n.prev = newNode;
        size++;
        return size;
    }

    @Override
    public boolean hasNext() {
        return index < this.size;
    }

    @Override
    public Object next() {
        Object o = null;
        try{
            o = this.get(index);
            index++;
        }catch (Exception e){

        }
        return o;
    }

    @Override
    public void remove() {
    }

    @Override
    public void forEachRemaining(Consumer action) {
    }
}