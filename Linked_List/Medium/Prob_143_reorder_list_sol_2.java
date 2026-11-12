package Linked_List.Medium;

import java.util.Stack;

public class Prob_143_reorder_list_sol_2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;

        while(temp != null){
            st.push(temp);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            ListNode last = st.pop();

            if(temp == last || temp.next == last){
                last.next = null;
                break;
            }

            ListNode front = temp.next;

            temp.next = last;
            last.next = front;

            temp = front;
        }
    }

    public static void main(String[] args) {
        Prob_143_reorder_list_sol_2 solution = new Prob_143_reorder_list_sol_2();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);

        // Reorder the list
        solution.reorderList(head);

        // Print the reordered list
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
