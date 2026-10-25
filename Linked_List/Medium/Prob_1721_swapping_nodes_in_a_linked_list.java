package Linked_List.Medium;

public class Prob_1721_swapping_nodes_in_a_linked_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode first = null;
        ListNode last = head;

        int i=1;
        
        while(temp != null){
            if(i == k){
                first = temp;
                break;
            }
            temp = temp.next;
            i++;
        }

        temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        temp = head;
        for(int j=1; j<=count - k; j++){
            temp = temp.next;
        }
        last = temp;

        int swap = first.val;
        first.val = last.val;
        last.val = swap;

        return head;
    }

    public static void main(String[] args) {
        Prob_1721_swapping_nodes_in_a_linked_list solution = new Prob_1721_swapping_nodes_in_a_linked_list();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int k = 2;

        ListNode swappedList = solution.swapNodes(head, k);

        while(swappedList != null){
            System.out.print(swappedList.val + " ");
            swappedList = swappedList.next;
        }
    }
}
