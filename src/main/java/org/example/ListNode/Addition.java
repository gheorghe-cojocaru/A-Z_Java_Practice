package org.example.ListNode;

public class Addition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Dummy-Knoten um den Start der Ergebnisliste zu speichern
        ListNode dummy = new ListNode(0);
        ListNode p = l1, q = l2, current = dummy;
        int carry = 0;

        //Solange es Knoten in l1 oder l2 gibt, oder ein Übertrag existiert
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;

        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        Addition addition = new Addition();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addition.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.println(result.val + " ");

            result = result.next;
        }
    }
}
