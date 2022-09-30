package Iterator;

public interface MyIterator<E> {
    void first();
    void next();
    boolean isDone();
    E currentItem();
}
