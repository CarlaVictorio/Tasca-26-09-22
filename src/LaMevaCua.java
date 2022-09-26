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

        return null;
    }

    @Override
    public int size() {
        return this.p;
    }
}
