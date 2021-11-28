package sample.pkg;

import java.util.Arrays;

public class Stack {

    private int el[];
    private int head;

    public Stack(){
        this(5);
    }

    public Stack(int n){
        el = new int[n];
        head = 0;
    }

    public void push(int i) {
        if(!checkCapacity())
            el[head++] = i;
        else {
            System.out.println("Resizing..");
            el[head++] = i;
        }
    }

    private boolean checkCapacity() {
        if(getSize() >= getCapacity()){
            System.out.println("Stack overflow..");
            el = Arrays.copyOf(el,2*el.length);
            return true;
        }
        return false;
    }

    private int getCapacity(){
        return el.length;
    }

    private int getSize(){
        return head;
    }

    public int pop() {
        if(isEmpty()){
            return 0;
        }
        head--;
        int tmp = el[head];
        el[head] = -1;
        return tmp;
    }

    private boolean isEmpty() {
        if(getSize() <= 0){
            System.out.println("Stack underflow..");
            return true;
        }
        return false;
    }

    public int top(){
        System.out.print("Top element is: ");
        return el[head-1];
    }

    public int back(){
        System.out.print("Back element is: ");
        return el[0];
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stack{");
        sb.append(Arrays.toString(el));
        sb.append(", head=").append(head);
        sb.append('}');
        return sb.toString();
    }
}
