package javaprac;

public class SingleLinkedList {

    class Node {
        int data;
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

        if (head == null) {
            /* 'head' is used so that when we set new 'tail', the memory reference doesn't go stale for previous node
             class data, it achieves this by setting the first entered data inside the 'head' */
            head = newNode;
            // 'tail' is used to create data chain using 'next' variable as a pointer
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    private void displayList() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty!");
        } else {
            System.out.println("Single Linked list output: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.addNode(3);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(1);
        singleLinkedList.addNode(5);
        singleLinkedList.addNode(4);

        singleLinkedList.displayList();
    }
}
