import java.util.Collections;
import java.util.LinkedList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Перевірка ListNode з пункту 4, 5");

        ListNode l1_ex1 = new ListNode(1);
        l1_ex1.next = new ListNode(2);
        l1_ex1.next.next = new ListNode(4);

        ListNode l2_ex1 = new ListNode(1);
        l2_ex1.next = new ListNode(3);
        l2_ex1.next.next = new ListNode(4);

        ListNode merged_ex1 = solution.mergeTwoLists(l1_ex1, l2_ex1);
        System.out.print("Example 1:");
        printList(merged_ex1);
        System.out.println("\n");

        ListNode l1_ex2 = new ListNode();
        ListNode l2_ex2 = new ListNode();
        ListNode merged_ex2 = solution.mergeTwoLists(l1_ex2, l2_ex2);
        System.out.print("Example 2:");
        printList(merged_ex2);
        System.out.println("\n");

        ListNode l1_ex3 = new ListNode();
        ListNode l2_ex3 = new ListNode(0);
        ListNode merged_ex3 = solution.mergeTwoLists(l1_ex3, l2_ex3);
        System.out.print("Example 3:");
        printList(merged_ex3);
        System.out.println("\n");

        System.out.println("Пункт 7");

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        list1.addAll(list2);
        Collections.sort(list1);

        for (Integer i : list1) {
            System.out.println(i);
        }
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.print("[]");
            return;
        }
        System.out.print("[");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.print("]");
    }
}