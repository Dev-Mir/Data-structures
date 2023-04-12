//task2 DoubleLinkedList with tail
//task3 method that takes head as parameter and detect weather linked list contains cycle
import java.util.*;
class Node {
    String name;
    Node prev, next;
    Node(String name){
        this.name = name;
        prev = null;
        next = null;
    }
}
class DoubleLL{
	Node head = null;
	Node tail = null;
	public void insertAtBeginning(String name){
        Node n = new Node(name);
        if(head != null){
        head.prev = n;
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
        head.prev = n;
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
            node.prev = tail;
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
            node.prev = tail;
			tail.next = node;
			tail = node;
        }
        else{
            head = node;
			tail = head;
        }
    }
	public void removeFromBegining(){
		if(head != null){
		head = head.next;
		head.prev = null;
		}
	}
	public void removeFromEnd(){
		if(head != null){
			tail = tail.prev;
			tail.next = null;
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
		Node tail = null;
		while(head != null){
			if(obj.contains(head)){
				return true;
			}
			obj.add(head);
			tail = head;
			head = head.next;
		}
		obj = new Vector();
		while(tail != null){
			if(obj.contains(tail)){
				return true;
			}
			obj.add(tail);
			tail = tail.prev;
		}
		return false;
	}
	public static void main(String[] sk){
		DoubleLL li = new DoubleLL();
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
		
		System.out.println("List contains cycle: " + li.containsCycle(li.head));
		li.head.prev = li.tail;//list will be circular after this line
		System.out.println("List contains cycle: " + li.containsCycle(li.head));
		DoubleLL li2 = new DoubleLL();
		Node[] nodes = new Node[5];
		for(int i=0; i<5; i++)
			nodes[i] = new Node(i + 1 + "");
		li2.insertAtBeginning(nodes[0]);
		li2.insertAtBeginning(nodes[1]);
		li2.insertAtEnd(nodes[2]);
		li2.insertAtEnd(nodes[3]);
		li2.insertAtEnd(nodes[0]);
		li2.insertAtEnd(nodes[4]);

		System.out.println("List contains cycle: " + li.containsCycle(li.head));
	}
}