// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
// Return the linked list sorted as well.

// Example 1:
    // Input: head = [1,1,2]
    // Output: [1,2]

// Example 2:
    // Input: head = [1,1,2,3,3]
    // Output: [1,2,3]


// import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedLists {
    Node head;

    void addLast(int data) {
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public void removeDuplicates() {
        Node currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.data == currentNode.next.data) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
    }
}

public class RemoveDuplicatesLL {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);

        ll.removeDuplicates();

        ll.display();

    }
}
