package datastructure.stack;

import datastructure.linkedlist.LinkedList;
import datastructure.linkedlist.LinkedListNode;

public class StackWithLinkedList<T> {
    private LinkedList<T> linkedList;
    public StackWithLinkedList(LinkedList<T> data){
        this.linkedList=data;
    }
    public void push(T item){
        this.linkedList.insertFirst(item);
    }
    public LinkedListNode<T> pop(){
        LinkedListNode<T> head=this.linkedList.head;
        this.linkedList.deleteHead();
        return head;
    }
    public LinkedListNode<T> peek(){
        return this.linkedList.head;
    }
    public static void main(String...args){

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.insertLast("1");
        linkedList.insertLast("2");
        linkedList.insertLast("3");
//      linkedList.deleteNode(linkedList.find("2"));
//      linkedList.insertBefore(linkedList.find("3"),"2");
        //linkedList.printList();
        StackWithLinkedList<String> stringStackWithLinkedList=new StackWithLinkedList<>(linkedList);
        System.out.println("push.......");
        stringStackWithLinkedList.push("0");
        linkedList.printList();
        System.out.println("pop.......");
        stringStackWithLinkedList.pop();
        linkedList.printList();
        System.out.println("peek.......");
        stringStackWithLinkedList.peek();
        linkedList.printList();

    }
}
