package Linked_List.Hard;

import java.util.ArrayList;
import java.util.List;

public class merge_k_sorted_lists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        while(lists.length > 1){
            List<ListNode> merged = new ArrayList<>();
            for(int i=0; i<lists.length; i+=2){
                ListNode l1 = lists[i];
                ListNode l2 = (i+1<lists.length)?lists[i+1]:null;

                merged.add(mergeTwoLists(l1,l2));
            }
            lists = merged.toArray(new ListNode[0]);
        }
        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1 != null){
            temp.next = l1;
        }else{
            temp.next = l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        merge_k_sorted_lists solution = new merge_k_sorted_lists();

        // Create sample linked lists
        ListNode l1 = solution.new ListNode(1);
        l1.next = solution.new ListNode(4);
        l1.next.next = solution.new ListNode(5);

        ListNode l2 = solution.new ListNode(1);
        l2.next = solution.new ListNode(3);
        l2.next.next = solution.new ListNode(4);

        ListNode l3 = solution.new ListNode(2);
        l3.next = solution.new ListNode(6);

        ListNode[] lists = {l1, l2, l3};

        // Merge the k sorted linked lists
        ListNode mergedList = solution.mergeKLists(lists);

        // Print the merged linked list
        System.out.print("Merged Linked List: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
