package com.company;
class LinkedList{
    static class Node{
        int data = 0;
        Node next = null;
        public Node(Node next){
            this.next = next;
        }
        public Node(Node next, int data) {
            this.data = data;
            this.next = next;
        }
        public String toString() {
            return "" + data;
        }
    }
    Node head;
    int size = 0;

    public LinkedList(){
        head = new Node(null);
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }


    public int size() {
        return size;
    }


    public void add(Node item) {
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;

        temp.next = item;
        size++;
    }


    public void add(int index, Node item) {
        Node temp = head;
        for (int i = 1; i < index-1; i++) {
            temp = temp.next;
        }
        item.next = temp.next;
        temp.next = item;
        size++;
    }


    public void remove(int index) {
        Node temp = head;
        for (int i = 1; i < index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }


    public void remove(Node item) {
        Node temp = head;
        while(temp.next != item){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }


    public LinkedList duplicate(){
        LinkedList list2 = new LinkedList();
        Node temp = head.next;
        while (temp != null) {
            list2.add(new Node(null, temp.data));
            temp = temp.next;
        }
        return list2;
    }


    public LinkedList duplicateReversed() {
        int[] arr = new int[size];
        Node temp = head.next;
        for (int i = 0; i < size; i++) {
            arr[i] = temp.data;
            temp = temp.next;
        }
        LinkedList list2 = new LinkedList();
        list2.head.data = arr[arr.length-1];
        for (int i = arr.length-2; i >-1 ; i--) {
            list2.add(new Node(null, arr[i]));
        }
        list2.add(new Node(null, head.data));

        return list2;
    }


    public String toString() {
        String str  = "[size: " + size+" - ";
        Node temp = head;
        while (temp.next != null) {
            str = str + temp + " ";
            temp = temp.next;
        }
        str = str + temp+"";
        str += "]";
        return str;
    }

    public static void main(String[] args){
        LinkedList li = new LinkedList();
        System.out.println("List is empty "+li.isEmpty());
        for (int i = 1; i <= 10; i++) {
            Node n = new Node(null, (int)(Math.random() * 100));
            li.add(n);
        }
        Node n = new Node(null, 800);
        li.add(5, n);
        System.out.println(li);

        //li.remove(5);
        li.remove(n);
        System.out.println(li);

        System.out.println("List is empty "+li.isEmpty());
        System.out.println(li.size);


        LinkedList li2 = li.duplicate();
        System.out.println(li2);

        LinkedList li3 = li.duplicateReversed();
        System.out.println(li3);

    }
}