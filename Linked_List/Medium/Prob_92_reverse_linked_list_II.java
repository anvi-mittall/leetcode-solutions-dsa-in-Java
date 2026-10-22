package Linked_List.Medium;

public class Prob_92_reverse_linked_list_II {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for(int i=1; i<left; i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for(int i=0; i<right-left; i++){
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Prob_92_reverse_linked_list_II solution = new Prob_92_reverse_linked_list_II();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int left = 2;
        int right = 4;

        ListNode reversedList = solution.reverseBetween(head, left, right);

        while(reversedList != null){
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}
