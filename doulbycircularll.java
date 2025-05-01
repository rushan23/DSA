class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class CircularDoublyLinkedList {
    Node head = null;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode.prev = newNode;
            head = newNode;
        } else {
            Node tail = head.prev;

            newNode.next = head;
            newNode.prev = tail;

            tail.next = head.prev = newNode;
            head = newNode;
        }
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode.prev = newNode;
            head = newNode;
        } else {
            Node tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;

            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // Delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;
            Node newTail = tail.prev;

            newTail.next = head;
            head.prev = newTail;
        }
    }

    // Print List Forward
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}
public class doulbycircularll {
     public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        cdll.addFirst(10);
        cdll.addFirst(20);
        cdll.addLast(30);
        cdll.printList(); // 20 <-> 10 <-> 30 <-> (back to head)

        cdll.deleteFirst();
        cdll.printList(); // 10 <-> 30 <-> (back to head)

        cdll.deleteLast();
        cdll.printList(); // 10 <-> (back to head)
    }
}
