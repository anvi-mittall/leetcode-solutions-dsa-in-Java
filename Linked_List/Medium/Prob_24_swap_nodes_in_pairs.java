package Linked_List.Medium;

public class Prob_24_swap_nodes_in_pairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = temp.next.next;

            first.next = second.next;
            second.next = first;
            temp.next = second;

            temp = first;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Prob_24_swap_nodes_in_pairs solution = new Prob_24_swap_nodes_in_pairs();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);

        ListNode swappedList = solution.swapPairs(head);

        // Print the swapped list
        ListNode current = swappedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
