package Linked_List.Medium;

import java.util.HashSet;
import java.util.Set;

public class Prob_3217_delete_nodes_from_ll_present_in_array {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;

        while(temp.next != null){
            if(set.contains(temp.next.val)){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Prob_3217_delete_nodes_from_ll_present_in_array solution = new Prob_3217_delete_nodes_from_ll_present_in_array();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        // Define the array of values to delete
        int[] nums = {2, 4};

        // Modify the list
        ListNode modifiedHead = solution.modifiedList(nums, head);

        // Print the modified list
        ListNode temp = modifiedHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
