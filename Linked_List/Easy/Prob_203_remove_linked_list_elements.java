package Linked_List.Easy;

public class Prob_203_remove_linked_list_elements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Prob_203_remove_linked_list_elements solution = new Prob_203_remove_linked_list_elements();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(6);
        head.next.next.next = solution.new ListNode(3);
        head.next.next.next.next = solution.new ListNode(4);
        head.next.next.next.next.next = solution.new ListNode(5);
        head.next.next.next.next.next.next = solution.new ListNode(6);

        int valToRemove = 6;
        ListNode result = solution.removeElements(head, valToRemove);
        System.out.print("Resulting list after removing elements with value " + valToRemove + ": ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
