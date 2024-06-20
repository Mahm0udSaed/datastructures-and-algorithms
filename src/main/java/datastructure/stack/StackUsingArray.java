package datastructure.stack;

import java.util.Arrays;

public class StackUsingArray {
    private int top;
    private int maxSize=5;
    private int arr []=new int[maxSize];

    public StackUsingArray() {
        top=-1;
    }
    /**
     * check if the top is greater than or equal the array size
     * else increase the top and then insert new item
     * **/
    public boolean push (int item){
        if (top>=maxSize-1){
            System.out.println("Stack over flow");
            return false;
        }else {
            arr[++top]=item;
            System.out.println("Item inserted successfully");
            return true;
        }
    }

    /**
     * check if the top >-1 then insert and increase size then return the item
     * **/

    public int pop(){
        if (top<0){
            System.out.println("Stack under flow");
            return 0;
        }else {
            return arr[top--];
        }
    }

    public int peek(){
        if (top<0){
            System.out.println("Stack under flow");
            return 0;
        }else {
            return arr[top];
        }
    }
    public void print(){
        System.out.println("Stack : "+ Arrays.toString(arr));
    }
    public static void main(String...args){
        StackUsingArray stackUsingArray=new StackUsingArray();
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        stackUsingArray.push(3);

        System.out.println("Peek from the stack : "+stackUsingArray.peek());
        System.out.println("pop from the stack : "+stackUsingArray.pop());
        stackUsingArray.push(4);
        stackUsingArray.print();
    }
}
