package Linked_List.Medium;

import java.util.HashMap;

//import org.w3c.dom.Node;

public class Prob_138_copy_list_with_random_pointer {
    public class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;
        
        while(temp != null){
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            Node copy = map.get(temp);

            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);

            temp = temp.next;
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        Prob_138_copy_list_with_random_pointer solution = new Prob_138_copy_list_with_random_pointer();

        // Create a sample linked list with random pointers
        Node head = solution.new Node(1);
        head.next = solution.new Node(2);
        head.next.next = solution.new Node(3);
        head.random = head.next.next; // 1's random points to 3
        head.next.random = head; // 2's random points to 1
        head.next.next.random = head.next; // 3's random points to 2

        // Copy the list
        Node copiedHead = solution.copyRandomList(head);

        // Print the copied list and its random pointers
        Node temp = copiedHead;
        while (temp != null) {
            System.out.print("Node val: " + temp.val);
            if (temp.random != null) {
                System.out.print(", Random points to: " + temp.random.val);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            temp = temp.next;
        }
    }
}
