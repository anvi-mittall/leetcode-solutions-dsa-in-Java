package Linked_List.Easy;

public class Prob_206_reverse_linked_list{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Prob_206_reverse_linked_list solution = new Prob_206_reverse_linked_list();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        ListNode result = solution.reverseList(head);
        System.out.print("Reversed linked list: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}