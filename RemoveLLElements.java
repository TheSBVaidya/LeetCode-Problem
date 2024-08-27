// Link: https://leetcode.com/problems/remove-linked-list-elements/description/

// Given the head of a linked list and an integer val,
// remove all the nodes of the linked list that has Node.val == val, and return the new head.

// Example 1:
    // Input: head = [1,2,6,3,4,5,6], val = 6
    // Output: [1,2,3,4,5]

// Example 2:
    // Input: head = [], val = 1
    // Output: []

// Example 3:
    // Input: head = [7,7,7,7], val = 7
    // Output: []

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
    
        public void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("Null");
        }
    
        Node removeElements(int val) {
            Node currentNode = head;
            // Node current = null;

            while(head != null && head.data == val) {
                head = head.next;
            }

            if (head == null) {
                return null;
            }
            // Travresed in linked list
            while(currentNode != null && currentNode.next != null) {
                if(currentNode.next.data == val) {
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode = currentNode.next;
                }
            }
            return head;
        }
    }

public class RemoveLLElements {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        int val = 6;

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        
        Node upNode = ll.removeElements(val);

        ll.display(upNode);
        

        
    }
}
