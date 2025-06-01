class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class Reversell {
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // Save next
            curr.next = prev;      // Reverse pointer
            prev = curr;           // Move prev
            curr = next;           // Move curr
        }

        return prev; // New head
    }

    // For displaying the list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original List: ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed List: ");
        printList(head);
    }
}
