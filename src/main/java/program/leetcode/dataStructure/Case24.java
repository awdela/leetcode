package program.leetcode.dataStructure;

/**
* leetcode第24题
* 两两交换链表中的节点
*
*/

public class Case24 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        while (pre.next!=null && pre.next.next!=null) {
            ListNode a = pre.next;
            ListNode b = pre.next.next;
            //交换值
            pre.next = b;
            b.next = a;
            //交换指针
            a.next = b.next;
            //更新
            pre = b;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        /**
         * 构造head
         */
        int n = 5;
        ListNode[] lists = new ListNode[n];
        for (int i=0;i<n;i++) {
            ListNode l = new ListNode(i+1);
            lists[i] = l;
            if (i>0) {
                lists[i-1].next = l;
            }
        }
        Case24.swapPairs(lists[0]);
    }

}
