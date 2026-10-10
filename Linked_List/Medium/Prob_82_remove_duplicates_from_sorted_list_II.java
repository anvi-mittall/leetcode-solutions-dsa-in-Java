package Linked_List.Medium;

//import Linked_List.Easy.Prob_83_remove_duplicates_from_sorted_list.ListNode;

public class Prob_82_remove_duplicates_from_sorted_list_II {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode temp = head;

        while(temp != null){
            if(temp.next != null && temp.val == temp.next.val){
                while(temp.next != null && temp.val == temp.next.val){
                    temp = temp.next;
                }
                prev.next = temp.next;
            }else{
                prev = temp;
            }
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Prob_82_remove_duplicates_from_sorted_list_II solution = new Prob_82_remove_duplicates_from_sorted_list_II();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(3);
        head.next.next.next.next = solution.new ListNode(4);
        head.next.next.next.next.next = solution.new ListNode(4);
        head.next.next.next.next.next.next = solution.new ListNode(5);

        ListNode result = solution.deleteDuplicates(head);
        System.out.print("Resulting list after removing duplicates: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
