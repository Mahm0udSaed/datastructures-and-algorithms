package datastructure.linkedlist;

import datastructure.linkedlist.DoublyLinkedList;
import datastructure.linkedlist.LinkedList;

import java.util.concurrent.ExecutionException;

public class LinkedListTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.insertLast("1");
        linkedList.insertLast("2");
        linkedList.insertLast("3");
        linkedList.deleteNode(linkedList.find("2"));
        linkedList.insertBefore(linkedList.find("3"),"2");
        linkedList.printList();
        DoublyLinkedList<String> doublyLinkedList=new DoublyLinkedList<>();
        doublyLinkedList.insertLast("1");
        doublyLinkedList.insertAfter(doublyLinkedList.find("1"),"3" );
      //  doublyLinkedList.printList();
        doublyLinkedList.insertBefore(doublyLinkedList.find("3"),"2" );
       // doublyLinkedList.printList();
        doublyLinkedList.DeleteNode(doublyLinkedList.find("1"));
        doublyLinkedList.printList();

    }
}
