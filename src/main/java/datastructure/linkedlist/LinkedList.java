package datastructure.linkedlist;

public class LinkedList<T> {
    private int length;
    public LinkedListNode<T> head=null;
    public LinkedListNode<T> tail=null;
/** key point in linked list is to know the head and tail   **/
    /**insert before
     * create new node
     * make new node next ref the node
     * find the parent node
     * if parent is null
     * make the head ref the new node
     * else
     * make the parent refs the new node
     * **/
    public void insertBefore(LinkedListNode<T> node,T data){
        LinkedListNode<T> newNode=new LinkedListNode<>(data);
        newNode.next=node;
        LinkedListNode<T> parent=findParent(node);
        /** this means that there is only one node(node)**/
        if (parent==null){
            this.head=newNode;
        }else{
            parent.next=newNode;
        }
    }
    /**delete node*
     * if the node is the head and tail  make it ref to null
     * else if node is the head make head ref node next
     * if node is the tail, get parent and make tail ref to parent
     * else get parent and make next it ref to node next
     * */
    public void deleteNode(LinkedListNode<T> node){
        /** this means there is only one node **/
        if (head==tail){
            this.head=null;
            this.tail=null;
        }else if (head==node){
            this.head=node.next;
        }else {
            LinkedListNode<T> parent=findParent(node);
            if (tail==node){
                this.tail=parent;
            }else {
                parent.next=node.next;
            }
        }
        this.length--;
    }

    /**find parent**/
    public LinkedListNode<T> findParent(LinkedListNode<T> node){
        LinkedListIterator<T> linkedListIterator=new LinkedListIterator<>(this.head);
        for (LinkedListNode<T> n=head;n!=null;n=linkedListIterator.next()){
            if (n.next==node){
                return n;
            }
        }
        return null;
    }
    public LinkedListNode<T> find(T data){
        LinkedListIterator<T> linkedListIterator=new LinkedListIterator<>(this.head);
        for (LinkedListNode<T> n=head;n!=null;n=linkedListIterator.next()){
            if (n.data==data){
                return n;
            }
        }
        return null;
    }

    /** insert Last
     * create new node
     * if tail = null make tail ref new node
     * else make tail next ref new node, make tail ref new node
     * */

    public void insertLast(T data){
        LinkedListNode<T> newNode=new LinkedListNode<>(data);
        /** this means list is empty **/
        if (tail!=null){
            this.tail.next=newNode;
        }else {
            this.head=newNode;
        }
        this.tail=newNode;
        this.length++;
    }
    public void printList(){
        LinkedListIterator<T> linkedListIterator=new LinkedListIterator<>(this.head);
        for (LinkedListNode<T> n=head;n!=null;n=linkedListIterator.next()){
            System.out.println(n.data);
        }
    }
    /**
     * insert first
     * create new node
     * if head is null make head and tail ref new node (this means list is empty)
     * else make newNode.next ref head
     * ,make head ref new node
     * increase length
     * **/
    public void insertFirst(T data){
        LinkedListNode<T> newNode=new LinkedListNode<>(data);
        if (this.head==null){
            this.head=newNode;
            this.tail=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
       length++;
    }
    /**
     * delete head
     * make head ref head first
     * **/
    public void deleteHead(){
        if (head==tail){
            this.tail=null;
        }
        this.head=this.head.next;
        length--;
    }
}
