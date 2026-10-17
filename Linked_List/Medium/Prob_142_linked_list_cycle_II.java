package Linked_List.Medium;

public class Prob_142_linked_list_cycle_II {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Prob_142_linked_list_cycle_II solution = new Prob_142_linked_list_cycle_II();
        ListNode head = solution.new ListNode(3);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(0);
        head.next.next.next = solution.new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle

        ListNode cycleStart = solution.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("The cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}
