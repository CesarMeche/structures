package structure;

public class DoubleNode<T> {
    private T data;
    private DoubleNode<T> nextNode;
    private DoubleNode<T> previousNode;
    public DoubleNode<T> getPrevious() {
        return previousNode;
    }

    public void setPrevious(DoubleNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public DoubleNode(T data) {
        this.data=data;
    }

    public T getValue() {
        return data;
    }
    public void setValue(T data) {
        this.data = data;
    }
    public DoubleNode<T> getNext() {
        return nextNode;
    }
    public void setNext(DoubleNode<T> node) {
        this.nextNode = node;
    }
    
    



}
