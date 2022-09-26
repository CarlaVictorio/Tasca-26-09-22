public class LaMevaCua<E>  implements Queue<E> {

    E[] elems;
    int p;

    @Override
    public void push(E e) throws FullQueueException {

        if(isFull()) throw new FullQueueException();
        elems[p++] = e;
    }

    @Override
    public E pop() throws EmptyQueueException {
        if(isEmpty()) throw EmptyQueueException;
        E primer = elems[0];
        //desplaçament esquerra

        this.p--;
        return primer;
        }

    @Override
    public int size() {
        return this.p;
    }
}
