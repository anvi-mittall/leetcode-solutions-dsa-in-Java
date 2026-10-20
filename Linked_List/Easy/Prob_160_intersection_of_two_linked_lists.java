package Linked_List.Easy;

public class Prob_160_intersection_of_two_linked_lists {
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode tempA = headA;

    //     while(tempA != null){
    //         ListNode tempB = headB;

    //         while(tempB != null){
    //             if(tempA == tempB){
    //                 return tempA;
    //             }
    //             tempB = tempB.next;
    //         }
    //         tempA = tempA.next;
    //     }
    //     return null;
    // }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int countA = 0;
        int countB = 0;

        while(tempA != null){
            countA++;
            tempA = tempA.next;
        }

        while(tempB != null){
            countB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        while(countA > countB){
            tempA = tempA.next;
            countA--;
        }

        while(countB > countA){
            tempB = tempB.next;
            countB--;
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    public static void main(String[] args) {
        Prob_160_intersection_of_two_linked_lists solution = new Prob_160_intersection_of_two_linked_lists();
        ListNode headA = solution.new ListNode(4);
        headA.next = solution.new ListNode(1);
        ListNode intersection = solution.new ListNode(8);
        headA.next.next = intersection;
        intersection.next = solution.new ListNode(4);
        intersection.next.next = solution.new ListNode(5);

        ListNode headB = solution.new ListNode(5);
        headB.next = solution.new ListNode(0);
        headB.next.next = solution.new ListNode(1);
        headB.next.next.next = intersection;

        ListNode result = solution.getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
