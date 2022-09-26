public class LaMevaCua<E>  implements Queue<E> {

    E[] elems;

    @Override
    public void push(E e) throws FullQueueException {

        if(isFull()) throw new FullQueueException();
        elems[p++] = e;
    }

    @Override
    public E pop() throws EmptyQueueException {
        if(isEmpty()) throw EmptyQueueException;
        E primer = elems[0];
        //Desplaçament esquerra
        for (int i; i<p ; i++) {
            elems[i] = elems[i + 1];
        }

        this.p--;
        return primer;
        }

    @Override
    public int size() {
        return this.p;
    }
}
