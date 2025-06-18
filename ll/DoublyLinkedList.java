class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedListdemo {
    Node head;
    Node tail;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete Last
    public void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Print List Forward
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListdemo dll = new DoublyLinkedListdemo();

        dll.addFirst(10);
        dll.addFirst(20);
        dll.addLast(30);
        dll.printList(); // Output: 20 <-> 10 <-> 30 <-> null

        dll.deleteFirst();
        dll.printList(); // Output: 10 <-> 30 <-> null

        dll.deleteLast();
        dll.printList(); // Output: 10 <-> null
    }
}
