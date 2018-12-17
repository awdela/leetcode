package program.leetcode.dataStructure;

import java.util.HashSet;
import java.util.Set;

/**
* leetcode第141题
* 判断链表中是否存在环
* 使用set来判断后继节点是否重复,如果有重复则是环
*/

public class Case141 {

    private static Set<ListNode> allNodes;

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static boolean hasCycle(ListNode head) {
        allNodes = new HashSet<ListNode>();
        if (head ==null || head.next==null) {
            return false;
        }
        while (head!=null) {
            if (!allNodes.contains(head)) {
                allNodes.add(head);
            }else {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        /**
         * 构造head
         */
        ListNode[] lists = new ListNode[10];
        for (int i=0;i<10;i++) {
            ListNode l = new ListNode(i+1);
            lists[i] = l;
            if (i>0) {
                lists[i-1].next = l;
            }
        }
        lists[9].next = lists[2];
        System.out.println(Case141.hasCycle(lists[0]));
    }


}
