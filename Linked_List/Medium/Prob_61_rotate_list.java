package Linked_List.Medium;

public class Prob_61_rotate_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode tail = head;
        int length = 1;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        k = k % length;

        if(k == 0){
            return head;
        }

        tail.next = head;

        int steps = length - k;
        ListNode newTail = head;

        for(int i=1; i<steps; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Prob_61_rotate_list solution = new Prob_61_rotate_list();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int k = 2;

        ListNode rotatedList = solution.rotateRight(head, k);

        while(rotatedList != null){
            System.out.print(rotatedList.val + " ");
            rotatedList = rotatedList.next;
        }
    }
}
