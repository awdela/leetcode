package program.leetcode.dataBase.btree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class Node {

    //是否为叶子节点
    protected boolean isLeaf;

    //是否为根节点
    protected boolean isRoot;

    //父节点
    protected Node parent;

    //叶结点的前节点
    protected Node previous;

    //叶结点的后节点
    protected Node next;

    //节点的关键字
    protected List<Entry<Comparable, Object>> entries;

    //子节点
    protected List<Node> children;

    //叶结点数据
    protected Object data;

    public Node(boolean isLeaf) {
        this.isLeaf = isLeaf;
        entries = new ArrayList<Entry<Comparable, Object>>();
        //如果不是叶子节点创建子节点
        if (!isLeaf) {
            children = new ArrayList<Node>();
        }
    }

    public Node(boolean isLeaf, boolean isRoot) {
        this(isLeaf);
        this.isRoot = isRoot;
    }

    public Object get(Comparable key) {
        //如果是叶子节点
        if (isLeaf) {
            for(Entry<Comparable, Object> entry:entries) {
                if (entry.getKey().compareTo(key) == 0) {
                    return entry.getValue();
                }
            }
            //没找到
            return null;

        //不是子节点
        }else {
            //如果key小于等于节点最左边的key，沿第一个节点继续搜索
            if (key.compareTo(entries.get(0).getKey())<=0) {
                return children.get(0).get(key);
            }
            //如果key大于等于节点最右边的key，沿最后一个节点搜索
            else if(key.compareTo(entries.get(entries.size()-1).getKey()) >= 0) {
                return children.get(children.size()-1).get(key);
            }
            //否则沿比key大的前一个子节点继续搜索
            else {
                for (int i=0;i<entries.size();i++) {
                    if (entries.get(i).getKey().compareTo(key)<=0 && entries.get(i+1).getKey().compareTo(key) > 0) {
                        return children.get(i).get(key);
                    }
                }
            }

        }
        return null;
    }

    public void insertOrUpdate(Comparable key, Object obj) {

    }


    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setRoot(boolean isRoot) {
        this.isRoot = isRoot;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public List<Entry<Comparable, Object>> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry<Comparable, Object>> entries) {
        this.entries = entries;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node [isLeaf=" + isLeaf + ", isRoot=" + isRoot + ", parent=" + parent + ", previous=" + previous
                + ", next=" + next + ", entries=" + entries + ", children=" + children + ", data=" + data + "]";
    }

}
