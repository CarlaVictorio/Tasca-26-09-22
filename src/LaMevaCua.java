public class LaMevaCua<E>  implements Queue<E> {

    E[] elems;
    int p;

    @Override
    public void push(E e) throws FullQueueException {

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
        return 0;
    }
}
