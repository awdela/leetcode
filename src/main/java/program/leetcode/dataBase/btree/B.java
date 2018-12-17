package program.leetcode.dataBase.btree;

public interface B {

    public Object get(Comparable key);

    public void remove(Comparable key);

    public void insertOrUpdata(Comparable key, Object obj);

}
