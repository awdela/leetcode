package program.leetcode.dataStructure;

public class Case2 {

    static class ListEntry{
        int val;
        ListEntry next;
        ListEntry(int x){
            val = x;
        }
    }

    public static ListEntry addTwoNumbers(ListEntry l1) {
        int len1 = 1;
        int len2 = 0;
        ListEntry result = new ListEntry(0);

        if (l1==null) {
            len1 = 0;
        }
        if (l1.next==null) {
            len1 = 1;
        }
        while (l1 != null ) {
            ListEntry temp = l1.next;
            if (temp!=null) {
                l1.next = temp.next;
                len1++;
            }else {
                break;
            }
        }
        System.out.println(len1);
        return result;

    }

    public static void main(String[] args) {
        ListEntry l11 = new ListEntry(1);
        ListEntry l12 = new ListEntry(2);
        l11.next = l12;
        l12.next = new ListEntry(3);

        ListEntry l21 = new ListEntry(1);
        ListEntry l22 = new ListEntry(2);
        l21.next = l22;
        l22.next = new ListEntry(3);

        addTwoNumbers(l11);
    }
}
