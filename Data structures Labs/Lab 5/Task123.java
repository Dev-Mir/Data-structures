/*
Name Shankar
cms: 023-19-0063
section: bscs3 (B)
Task 1, 2, and 3
*/
import java.util.*;
class Node{
    Node next = null;
    int data = 0;
    Node(int data){
        this.next = null;
        this.data = data;
    }
}
class LinkedList{
    Node head = null;
    void add(int n){
        Node node = new Node(n);
        if(head == null){
            head = node;
            return;
        }
        Node cur = head;
       while(cur.next!= null)
           cur = cur.next;
       cur.next = node;
    }
    public Node makeReverse(Node cur){
        Node next = null, prev = null;
        while(cur != null){
            next = cur.next;
            cur.next= prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public void print(){
        Node cur = head;
        while(cur!= null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void printReverse(){
        if(head == null)
            return;
        Node cur = head;
        Node last = null;
        while(last != head){
            while(cur.next != last){
                cur = cur.next;
            }
            System.out.print(cur.data+" ");
            last = cur;
            cur = head;
        }
        System.out.println();
    }
    public void makeCyclic(){
        Node cur = head;
        while(cur.next!= null)
            cur = cur.next;
        cur.next =  head;
    }
    public boolean isCyclic(){
        Vector vec = new Vector();
        Node cur = head;
        while(cur.next != null){
            if(vec.contains(cur)){
                return true;
            }
            vec.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
public class Task123{
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printReverse();
        list.print();
        list.head = list.makeReverse(list.head);
        list.print();
        System.out.println(list.isCyclic());
        list.makeCyclic();
        System.out.println(list.isCyclic());
    }
    
}
