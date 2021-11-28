package sample4.pkg;

public abstract class QueueC{
    abstract boolean add(Object x); //Enqueue

    abstract Object remove(); //Dequeue

    abstract int size();

    abstract int capacity();

    abstract boolean isEmpty();

    abstract Object head();

    abstract Object back();

    abstract void show();
}