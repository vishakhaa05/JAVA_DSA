package LinkedList;

public class LL {

    Node head;
    private int size;

    // Constructor
    LL() {
        size = 0;
    }

    // Node class
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add node at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    // Print the list
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // Remove first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = head.next;
        size--;
    }

    // Remove last node
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    // Insert node at a specific index
    public void addInMiddle(int index, String data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index value");
            return;
        }

        Node newNode = new Node(data);

        // Insert at beginning
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        // Traverse to (index - 1)th node
        Node currNode = head;
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.next;
        }

        // Insert new node
        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }

    // Get the current size
    public int getSize() {
        return size;
    }

    // Main method for testing
    public static void main(String args[]) {
        LL list = new LL();

        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        System.out.println("Size: " + list.getSize());

        list.addInMiddle(2, "beautiful");
        list.printList();
        System.out.println("Size: " + list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
    }
}
