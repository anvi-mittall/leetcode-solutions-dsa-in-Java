package Linked_List.Medium;

public class Prob_2_add_two_numbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Prob_2_add_two_numbers solution = new Prob_2_add_two_numbers();
        ListNode l1 = solution.new ListNode(2);
        l1.next = solution.new ListNode(4);
        l1.next.next = solution.new ListNode(3);

        ListNode l2 = solution.new ListNode(5);
        l2.next = solution.new ListNode(6);
        l2.next.next = solution.new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.print("Resultant linked list: ");
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
