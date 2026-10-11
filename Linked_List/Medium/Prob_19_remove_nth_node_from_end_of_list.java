package Linked_List.Medium;

public class Prob_19_remove_nth_node_from_end_of_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);

        if(n == 1){
            head = head.next;
        }else{
            ListNode temp = head;

            for(int i=1; i<n-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return reverse(head);
    }

    private ListNode reverse(ListNode head){
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
        Prob_19_remove_nth_node_from_end_of_list solution = new Prob_19_remove_nth_node_from_end_of_list();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int n = 2;
        ListNode result = solution.removeNthFromEnd(head, n);
        System.out.print("Resulting list after removing the " + n + "th node from the end: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
