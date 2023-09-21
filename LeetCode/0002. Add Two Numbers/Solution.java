import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // test commit
        Stack<Integer> stack = new Stack();
        Stack<Integer> list1stack = new Stack();
        Stack<Integer> list2stack = new Stack();

        String str1 = "", str2 = "";
        ListNode current1 = l1, current2 = l2;
        while (current1 != null) {
            int val1 = current1.val;
            list1stack.push(val1);
            current1 = current1.next;
        }

        while (current2 != null) {
            int val2 = current2.val;
            list2stack.push(val2);
            current2 = current2.next;
        }

        while (!list1stack.isEmpty()) {
            str1 = str1 + list1stack.pop();

        }

        while (!list2stack.isEmpty()) {
            str2 = str2 + +list2stack.pop();

        }

        BigInteger first = new BigInteger(str1);
        BigInteger second = new BigInteger(str2);
        BigInteger sumBig = first.add(second);

        String sumString = sumBig.toString();

        char[] arr = sumString.toCharArray();

        int i = 0;
        while (i < arr.length) {

            char c = arr[i];
            stack.push(Character.getNumericValue(c));

            i++;
        }

        int rootNum = stack.pop();

        ListNode rootNode = new ListNode(rootNum);
        ListNode current = rootNode;
        while (!stack.isEmpty()) {
            int value = stack.pop();
            current.next = new ListNode(value);
            current = current.next;

        }

        current.next = null;

        return rootNode;

    }
}