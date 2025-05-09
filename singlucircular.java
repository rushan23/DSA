class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
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
            tail.next = head;
        }
    }

    // Delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
    }

    // Print List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}


public class singlucircular {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.addFirst(10);
        cll.addFirst(20);
        cll.addLast(30);
        cll.printList(); // Output: 20 -> 10 -> 30 -> (back to head)

        cll.deleteFirst();
        cll.printList(); // Output: 10 -> 30 -> (back to head)

        cll.deleteLast();
        cll.printList(); // Output: 10 -> (back to head)
    }
}
