package Linked_List.Medium;

public class Prob_86_Partition_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);

        ListNode temp1 = small;
        ListNode temp2 = large;
        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                temp1.next = temp;
                temp1 = temp1.next;
            }else{
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp2.next = null;
        temp1.next = large.next;

        return small.next;
    }

    public static void main(String[] args) {
        Prob_86_Partition_list solution = new Prob_86_Partition_list();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(4);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(2);
        head.next.next.next.next = solution.new ListNode(5);
        head.next.next.next.next.next = solution.new ListNode(2);

        int x = 3;

        ListNode partitionedList = solution.partition(head, x);

        while(partitionedList != null){
            System.out.print(partitionedList.val + " ");
            partitionedList = partitionedList.next;
        }
    }
}
