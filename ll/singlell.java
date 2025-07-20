class SinglyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // Delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Add in Middle (at index)
    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node x = head;
        for (int i = 0; i < index - 1; i++) {
            if (x == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            x = x.next;
        }

        Node n = new Node(data);
        n.next = x.next;
        x.next = n;
    }

    // Print List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class singlell {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst(10);
        list.addFirst(100);
        list.addLast(3100);
        list.printList(); // Output: 100 -> 10 -> 3100 -> null

        list.deleteFirst();
        list.printList(); // Output: 10 -> 3100 -> null

        list.deleteLast();
        list.printList(); // Output: 10 -> null

        list.addMiddle(1, 1000);
        list.printList(); // Output: 10 -> 1000 -> null
    }
}
