public class LaMevaCua<E>  implements Queue<E> {

    E[] elems;
    private int p;

    public LaMevaCua(int i) {
        elems = (E[]) new Object[i];
    }

    @Override
    public void push(E e) throws FullQueueException {

        if(isFull()) throw new FullQueueException();
        elems[p++] = e;
    }

    private boolean isFull() {
        return (this.p >= elems.length);
    }

    @Override
    public E pop() throws EmptyQueueException {
        if(isEmpty()) throw new EmptyQueueException();
        E primer = elems[0];
        //Desplaçament esquerra
        for (int i=0; i<p ; i++) {
            elems[i] = elems[i + 1];
        }

        this.p--;
        return primer;
        }

    private boolean isEmpty() {
        return (this.p ==0 );
    }

    @Override
    public int size() {
        return this.p;
    }
}
