public interface IntTable {

    boolean add(Table e); // Returns true if this set did not already contain the specified element

    void clear();

    boolean contains(Table o);

    boolean isEmpty();

    boolean remove(Table o); // Returns true if this set contained the specified element

    int size();

    Object[] toArray();


}
