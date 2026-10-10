package Linked_List.Easy;

public class Prob_83_remove_duplicates_from_sorted_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Prob_83_remove_duplicates_from_sorted_list solution = new Prob_83_remove_duplicates_from_sorted_list();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(1);
        head.next.next = solution.new ListNode(2);
        head.next.next.next = solution.new ListNode(3);
        head.next.next.next.next = solution.new ListNode(3);

        ListNode result = solution.deleteDuplicates(head);
        System.out.print("Resulting list after removing duplicates: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
