//task2 singlelinkedlist with tail
//task3 method that takes head as parameter and detect weather linked list contains cycle
import java.util.*;
class Node {
    String name;
    Node next;
    Node(String name){
        this.name = name;
        next = null;
    }
}
class SingleLinkedList{
	Node head = null;
	Node tail = null;
	public void insertAtBeginning(String name){
        Node n = new Node(name);
        if(head != null){
        n.next =  head;
        head = n;
        }
        else{
            head = n;
			tail = head;
        }
    }
    public void insertAtBeginning(Node n){
        if(head != null){
        n.next =  head;
        head = n;
        }
        else{
            head = n;
			tail = head;
        }
    }
    public void insertAtEnd(String name){
        Node node = new Node(name);
        if(head != null){
            tail.next = node;
			tail = node;
        }
        else{
            head = node;
			tail = head;
        }
    }
    public void insertAtEnd(Node node){
        if(head != null){
            tail.next = node;
			tail = node;
        }
        else{
            head = node;
			tail = head;
        }
    }
	public void removeFromBegining(){
		if(head != null)
		head = head.next;
	}
	public void removeFromEnd(){
		if(head != null){
			Node temp = head;
			while(temp.next.next != null){
				temp = temp.next;
			}
			temp.next = null;
		tail = temp;
		}
	}
	public void printAll(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.name + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public boolean containsCycle(Node head){
		Vector obj = new Vector();
		while(head != null){
			if(obj.contains(head)){
				return true;
			}
			obj.add(head);
			head = head.next;
		}
		return false;
	}
	public static void main(String[] sk){
		SingleLinkedList li = new SingleLinkedList();
		li.insertAtBeginning("5");
		li.insertAtBeginning("4");
		li.insertAtBeginning("3");
		li.insertAtEnd("6");
		li.insertAtEnd("7");
		li.insertAtEnd("8");
		Node n = new Node("9");
		li.insertAtEnd(n);
		n = new Node("10");
		li.insertAtEnd(n);
		n = new Node("2");
		li.insertAtBeginning(n);
		n = new Node("1");
		li.insertAtBeginning(n);
		li.printAll();
		li.removeFromBegining();
		li.printAll();
		li.removeFromEnd();
		li.printAll();
		li.tail.next = li.head;
		System.out.println("List contains cycle : " + li.containsCycle(li.head));
	}
}