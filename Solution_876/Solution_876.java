package Solution_876;

import java.util.ArrayList;

public class Solution_876{
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();
        int length = 0;
        while (head != null) {
            array.add(head);
            head = head.next;
            length++;
        }
        return array.get(length / 2);
    }
}