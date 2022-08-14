/** Array based list. */

/* Invariants:
    The position of the next item to be inserted is always size.
    size is always the number of items in the AList
    The last item in the list is always in position size - 1.
 */
public class AList {
    int size;
    int[] items;

    /** Creates an empty list. */
    public AList(){
        items = new int[100];
        size = 0;
    }

    public void addLast(int x){
        /* Resizing */
        if  (size == items.length){
            int[] a = new int[size + 1];
            System.arraycopy(items, 0, a, 0, size);
            items = a;
        }

        items[size] = x;
        size += 1;
    }

    public void resize(int capacity){
        int[] a = new int[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void addLast2(int x){
        /* Resizing */
        if  (size == items.length){
            resize(size + 1); // * refactor
        }

        items[size] = x;
        size += 1;
    }


    public int getLast() {
        return items[size - 1];
    }

    public int get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public int removeLast() {
        int x = getLast();
        items[size - 1] = 0; // unnecessary
        size -= 1;
        return x;
    }




}
