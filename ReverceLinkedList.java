// link: https://leetcode.com/problems/reverse-linked-list/description/

// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Example 1:
    // Input: head = [1,2,3,4,5]
    // Output: [5,4,3,2,1]
    
// Example 2:
    // Input: head = [1,2]
    // Output: [2,1]

// Example 3:
    // Input: head = []
    // Output: []

class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * ReverceLL
 */
class ReverceLL {
    static Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        //if linkedlist is empty
        if (head == null ) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void RevercedLL(){
       //Node newData = new Node(data);

        Node currentNode = head;
        Node previousNode = null;
        Node nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next; // nextNode stores the currnt next node value
            currentNode.next = previousNode; 
            previousNode = currentNode;
            currentNode = nextNode;
        }

        head = previousNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    
}



public class ReverceLinkedList {
    public static void main(String[] args) {
        //ReverceLinkedList rvl = new ReverceLinkedList();
        ReverceLL rl = new ReverceLL();

        rl.addFirst(12);
        rl.addFirst(11);
        rl.addFirst(10);
        rl.addFirst(9);

        System.out.println("Before Reversing the data: ");
        rl.display();

        rl.RevercedLL();

        System.out.println("\n\nAfter Revercing the data: ");
        rl.display();

    

    }
}
