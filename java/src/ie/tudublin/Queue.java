public class Queue {

    private class Node {
        int data;
        Node next;
    }

    Node z;
    Node head;
    Node tail;

    public Queue() {
        z = new Node(); z.next = z;
        head = z;  tail = null;
    }

    public void display() {
        System.out.println("\nThe queue values are:\n");

        Node temp = head;
        while( temp != temp.next) {
            System.out.print( temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("\n");
        System.out.println("Tail: " + tail.data);
    }

    public void enQueue( int x) {
        Node temp;

        temp = new Node();
        temp.data = x;
        temp.next = z;

        if(head == z)    // case of empty list
            head = temp;
        else                // case of list not empty
            tail.next = temp;

        tail = temp;        // new node is now at the tail
    }

    public void deQueue(){
        Node current = head;
        while (current.next.next != z){
            current = current.next;
        }

        current.next = z;
        tail = current;
    }
}






















