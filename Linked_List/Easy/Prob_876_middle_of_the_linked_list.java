package Linked_List.Easy;

public class Prob_876_middle_of_the_linked_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        int mid = count/2;
        temp = head;

        for(int i=0; i<mid; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        Prob_876_middle_of_the_linked_list solution = new Prob_876_middle_of_the_linked_list();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        ListNode middle = solution.middleNode(head);
        System.out.print("Middle node value: " + middle.val);
    }
}
