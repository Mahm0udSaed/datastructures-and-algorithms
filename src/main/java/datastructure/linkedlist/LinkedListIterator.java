package datastructure.linkedlist;

import datastructure.linkedlist.LinkedListNode;

public class LinkedListIterator<T> {
    public LinkedListNode<T> currentNode;

    public LinkedListIterator() {
        this.currentNode=null;
    }

    public LinkedListIterator(LinkedListNode<T> node) {
        this.currentNode = node;
    }
    public T data(){
        return currentNode.data;
    }
    public LinkedListNode<T> next(){
        this.currentNode=currentNode.next;
        return this.currentNode;
    }
    public LinkedListNode<T> current(){
        return this.currentNode;
    }
}
