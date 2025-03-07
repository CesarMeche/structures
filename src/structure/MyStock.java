package structure;

public class MyStock<T> {

    private DoubleNode<T> tail;

    public MyStock() {
    }

    public void push(T data) {
        DoubleNode<T> newData = new DoubleNode<T>(data);
        newData.setPrevious(tail);
        tail = newData;
    }

    public T pop() {
        if (tail == null) {
            return null;
        }
        T out = tail.getValue();
        tail = tail.getPrevious();
        return out;
    }

    public int size() {
        DoubleNode<T> aux = tail;
        int i = 0;
        while (aux != null) {
            aux = aux.getPrevious();
            i++;
        }
        return i;
    }

    public T peak() {
        return tail != null ? tail.getValue() : null;
    }

    public boolean isEmpty() {
        return tail == null;
    }
}
