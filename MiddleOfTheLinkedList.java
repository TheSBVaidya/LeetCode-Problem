// link: https://leetcode.com/problems/middle-of-the-linked-list/description/

// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.

// Example 1:
    // Input: head = [1,2,3,4,5]
    // Output: [3,4,5]
    // Explanation: The middle node of the list is node 3.

// Example 2:
    // Input: head = [1,2,3,4,5,6]
    // Output: [4,5,6]
    // Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class middleOfLL {
    Node head;

    void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    int middleNode(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
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


    public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        middleOfLL mll = new middleOfLL();

        mll.addFirst(10);
        mll.addFirst(8);
        mll.addFirst(4);
        mll.addFirst(2);

        System.out.println("Original LL: ");
        mll.display();

        System.out.println("\n\nMiddle Data: ");
        int result = mll.middleNode();
        System.out.println(result);



    }
}
