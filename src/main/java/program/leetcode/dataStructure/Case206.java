package program.leetcode.dataStructure;

/**
 * leetcode第206题
 * 反转单向链表
 * 采用递归方式
 * TODO:效率太慢 需要使用前继节点来做
 */
public class Case206 {

    public static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }

    public static ListNode reverseList(ListNode l) {
        int len = 0;
        ListNode lnext0 = l;
        ListNode lnew = new ListNode(0);
        if (l == null) {
            return null;
        }
        if (l.next == null) {
            return l;
        }
        while (l.next!=null){
            ++len;
            l = l.next;
            if (l.next ==null) {
                lnew.val = l.val;
            }
        }
        ListNode[] lists = new ListNode[len];
        for (int j=0;j<len;j++) {
            ListNode lnext1 = lnext0;
            ListNode lnext = new ListNode(0);
            for (int i=len-j;i>0;i--) {
                lnext.val = lnext1.val;
                lnext1 = lnext1.next;
            }
            lists[j] = lnext;
            if (j>0) {
                lists[j-1].next = lnext;
            }
            lnew.next = lists[0];
        }
        return lnew;
    }

    public static void main(String[] args) {
        ListNode l0 = new ListNode(0);
        ListNode[] lists = new ListNode[1];
        for (int i=0;i<1;i++) {
            ListNode l = new ListNode(i+1);
            lists[i] = l;
            if (i>0) {
                lists[i-1].next = l;
            }
        }
        l0.next = lists[0];
        System.out.println(reverseList(l0));
    }

}
