package program.leetcode.dataBase.btree;

public class BplusTree implements B{

    //根节点
    protected Node root;

    //阶数,M值
    protected int order;

    //子叶节点的链表头
    protected Node head;

    @Override
    public Object get(Comparable key) {
        return root.get(key);
    }

    @Override
    public void remove(Comparable key) {

    }

    @Override
    public void insertOrUpdata(Comparable key, Object obj) {

    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


}
