package Linked_List.Medium;

public class Prob_1669_merge_in_between_linked_lists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;

        for(int i=0; i<a-1; i++){
            temp = temp.next;
        }

        ListNode start = temp;

        temp = list1;
        for(int i=0; i<b; i++){
            temp = temp.next;
        }

        ListNode end = temp.next;

        ListNode last = list2;
        while(last.next != null){
            last = last.next;
        }

        start.next = list2;
        last.next = end;

        return list1;
    }

    public static void main(String[] args) {
        Prob_1669_merge_in_between_linked_lists solution = new Prob_1669_merge_in_between_linked_lists();
        ListNode list1 = solution.new ListNode(0);
        list1.next = solution.new ListNode(1);
        list1.next.next = solution.new ListNode(2);
        list1.next.next.next = solution.new ListNode(3);
        list1.next.next.next.next = solution.new ListNode(4);
        list1.next.next.next.next.next = solution.new ListNode(5);

        int a = 3;
        int b = 4;

        ListNode list2 = solution.new ListNode(1000000);
        list2.next = solution.new ListNode(1000001);
        list2.next.next = solution.new ListNode(1000002);

        ListNode mergedList = solution.mergeInBetween(list1, a, b, list2);

        // Print the merged list
        ListNode current = mergedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
