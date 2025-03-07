package structure;

public class PriorityQueue <T>{
    MyQueueu<T>[] queueus;

    public PriorityQueue(int i) {
        this.queueus = new MyQueueu[i];
        for (int j = 0; j < i; j++) {
           queueus[j]= new MyQueueu<>();
        }
    }

    public void push(T data,int priority) {
        queueus[priority].push(data);
    }

    public T poll() {
        for (MyQueueu<T> myQueueu : queueus) {
            if (myQueueu.peak()!=null) {
                return myQueueu.poll();
            }
        }
        return null;
    }

    public T peak() {
        for (MyQueueu<T> myQueueu : queueus) {
            if (myQueueu.peak()!=null) {
                return myQueueu.peak();
            }
        }
        return null;
    }

    public boolean isEmpty() {
        for (MyQueueu<T> myQueueu : queueus) {
            if (!myQueueu.isEmpty()) {
                return false	;
            }
        }
        return true;
    }
}
