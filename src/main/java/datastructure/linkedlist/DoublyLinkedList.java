package datastructure.linkedlist;

public class DoublyLinkedList<T> {
    private int length;
    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;

    /** insert before
     * if node is head , make head refer new node, make new node.next refer node, make node.prev ref new node
     *else if node is tail, make node.next refer new node, make new node.previous refers node, make tail=new npde
     * else node.previous.next refer new node, make new node .next refer node.
     **/

    public void insertBefore(LinkedListNode<T> node,T data){
        LinkedListNode<T> newNode= new LinkedListNode<T>(data);
        newNode.next=node;
        newNode.back=node.back;

        if (node==head){
            head=newNode;
        }else {
            node.back.next=newNode;
        }
        node.back=newNode;

    }

    public void insertLast(T data){
        LinkedListNode<T> newNode= new LinkedListNode<T>(data);
        if (tail==null){
            this.head=newNode;
        }else {
            tail.next=newNode;
            newNode.back=tail;
        }
        this.tail=newNode;
    }

    /**insertAfter
     * if node is tail node.next=newNode, new node.back=node, tail=new node
     * else  node.next=new node, newNode.next=node.next, newNode.back=node
     * **/
    public void insertAfter(LinkedListNode<T> node,T data){
        LinkedListNode<T> newNode= new LinkedListNode<T>(data);
        newNode.next=node.next;
        node.next=newNode;

//        else {
//            newNode.next=node.next;
//        }
        newNode.back=node;
        if (node==tail){
            tail=newNode;
        }
    }

    /**find**/

    public LinkedListNode<T> find(T data){
        for (LinkedListNode<T> n=head;n!=null;n=n.next){
            if (n.data==data){
                return n;
            }
        }
        return null;
    }
    /**delete node
     * if head==tail head=null, tail=null
     * if node==head, head=node.next, head.back=null
     * else if node=tail, tail=tail.back, tail.next=null
     * else node.back.next=node.next
     * **/
    public void DeleteNode(LinkedListNode<T> node){
        if (head==tail){
            head=null;
            tail=null;
        }else if(node==head){
            head=node.next;
            head.back=null;
        }else if (node==tail){
                tail=node.back;
                tail.next=null;
        }else {
                node.back.next=node.next;
        }
    }
    public void printList(){
        for (LinkedListNode<T> n=head;n!=null;n=n.next){
            System.out.println(n.data);
        }

    }
}
