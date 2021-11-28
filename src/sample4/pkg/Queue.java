package sample4.pkg;

public interface Queue {
    boolean add(Object x); //Enqueue

    Object remove(); //Dequeue

    int size();

    int capacity();

    boolean isEmpty();

    Object head();

    Object back();

    void show();
}
