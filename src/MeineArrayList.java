/**
 * a very simplified version of java.util.ArrayList
 *
 * @param <E>
 */

public class MeineArrayList<E> {
    private E[] list;
    private int size;
    private int capacity;
    private int increment;

    /**
     * constructs a MeineArrayList-Object with initial capacity c
     * and increment inc
     *
     * @param c   the initial capacity
     * @param inc the number of positions that will be added
     *            when the list is made bigger
     */
    public MeineArrayList(int c, int inc) {
        capacity = c;
        list = (E[]) new Object[c];
        size = 0;
        increment = inc;
    }

    public int getSize() {
        return size;
    }

    public void add(E e) {
        if(this.size >= this.capacity) {
            resize();
        }
        list[size] = e;
    }

    public void remove(E e) {
    }

    public Object get(int i) {
        return list[i];
    }

    private void resize() {
        E[] newList = (E[]) new Object[this.capacity + this.increment];
        for(int i = 0; i < this.size; i++) {
            newList[i] = (E) this.get(i);
        }
        this.list = newList;
        this.capacity = newList.length;
    }
}