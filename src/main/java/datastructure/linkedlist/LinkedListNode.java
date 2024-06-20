package datastructure.linkedlist;

public class LinkedListNode<T> {
    public T data;
    public LinkedListNode<T> next;
    public LinkedListNode<T> back;
    public LinkedListNode(T data) {
        this.data = data;
    }
}
