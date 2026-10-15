package Linked_List.Medium;

public class Prob_2095_delete_the_middle_node_of_linked_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        int mid = count/2;
        temp = head;

        for(int i=0; i<mid-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Prob_2095_delete_the_middle_node_of_linked_list solution = new Prob_2095_delete_the_middle_node_of_linked_list();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        ListNode updatedHead = solution.deleteMiddle(head);
        System.out.print("Updated linked list after deleting middle node: ");
        while(updatedHead != null){
            System.out.print(updatedHead.val + " ");
            updatedHead = updatedHead.next;
        }
    }
}
