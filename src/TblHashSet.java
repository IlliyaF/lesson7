import java.util.HashSet;


public class TblHashSet implements IntTable {

    private HashSet myHashSet = new HashSet();

    public boolean add(Table e) {

        myHashSet.add(e);
        return true;
    }

    @Override
    public void clear() {

        myHashSet.clear();

    }

    public boolean contains(Table o) {

        myHashSet.contains(o);

        return true;
    }

    @Override
    public boolean isEmpty() {

        myHashSet.isEmpty();

        return true;
    }

    @Override
    public boolean remove(Table o) {
        myHashSet.remove(o);
        return true;
    }

    @Override
    public int size() {
        return myHashSet.size();
    }

    @Override
    public String toString() {
        return "TblHashSet{" +
                "myHashSet=" + myHashSet +
                '}';
    }

    @Override
    public Object[] toArray() {

        Object [] tablesArr;
        tablesArr = (Object[]) myHashSet.toArray();

        return tablesArr;
    }
}
