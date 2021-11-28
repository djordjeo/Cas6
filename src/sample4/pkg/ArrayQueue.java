package sample4.pkg;

import java.util.Arrays;

public class ArrayQueue implements Queue{

    private final Object[] elements;
    private int start, end, size;

    public ArrayQueue(int capacity){
        elements = new Object[capacity];
    }

    public ArrayQueue(){
        this(1024);
    }

    @Override
    public boolean add(Object x) {
        if(size() == capacity())
            return false;
        elements[end] = x;
        size++;
        end = (end + 1) % capacity();
        return true;
    }

    @Override
    public Object remove() {
        if(isEmpty())
            return null;
        Object e = elements[start];
        start = (start+1) % capacity();
        size--;
        return e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Object head() {
        return isEmpty() ? null : elements[start];
    }

    @Override
    public Object back() {
        if(isEmpty())
            return null;
        return end == 0 ? elements[capacity() - 1] : elements[end - 1];
    }

    @Override
    public void show() {
        System.out.print("[");
        int i = start;
        while(i != end){
            System.out.print(elements[i] + ", ");
            i = (i+1) % capacity();
        }
        System.out.println("]");
    }
}
