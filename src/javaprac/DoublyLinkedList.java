package javaprac;

public class DoublyLinkedList {

    class Node {
        int data;
        Node previous; // to point to previous node
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    private void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            head.previous = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }
    }

    private void displayList() {
        Node current = tail;

        if(head == null) {
            System.out.println("List is empty!");
        } else {
            System.out.println("Doubly Linked List output: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.previous;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addNode(1);
        doublyLinkedList.addNode(2);
        doublyLinkedList.addNode(3);
        doublyLinkedList.addNode(4);
        doublyLinkedList.addNode(5);
        doublyLinkedList.addNode(6);
        doublyLinkedList.addNode(7);
        doublyLinkedList.addNode(8);
        doublyLinkedList.addNode(9);
        doublyLinkedList.addNode(10);

        doublyLinkedList.displayList();
    }
}
