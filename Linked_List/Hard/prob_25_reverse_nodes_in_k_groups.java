package Linked_List.Hard;

public class prob_25_reverse_nodes_in_k_groups {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        ListNode curr = head;

        while(curr != null){
            // Count k nodes
            ListNode temp = curr;
            int count = 0;

            while(temp != null && count < k){
                temp = temp.next;
                count++;
            }

            // If less than k nodes remain
            if(count < k){
                tail.next = curr;
                break;
            }

            // Reverse k nodes
            ListNode prev = null;
            ListNode next = null;
            ListNode start = curr;

            count = 0;

            while(curr != null && count < k){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            // Add reversed group to blank list
            tail.next = prev;
            tail = start;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        prob_25_reverse_nodes_in_k_groups solution = new prob_25_reverse_nodes_in_k_groups();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int k = 2;
        ListNode result = solution.reverseKGroup(head, k);

        // Print the reversed linked list in groups of k
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
