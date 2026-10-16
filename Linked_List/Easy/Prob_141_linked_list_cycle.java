package Linked_List.Easy;

public class Prob_141_linked_list_cycle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
            return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_141_linked_list_cycle solution = new Prob_141_linked_list_cycle();
        ListNode head = solution.new ListNode(3);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(0);
        head.next.next.next = solution.new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle

        boolean hasCycle = solution.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
