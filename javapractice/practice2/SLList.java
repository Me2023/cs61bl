/** An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within.
 * SLList class acts as a middle man between user and raw data structure.
 * Allow us to store meta information about entire list, e.g. size. */

public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size; /** Improvement #5: Caching */
    private IntNode sentinel; /** Improvement #6b: Sentinel Nodes */

    /** Improvement #6: The Empty List */
    public SLList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }


    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Returns the first item in the list. */
    public int getFirst(){
        return sentinel.next.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        size += 1;

        /* For Improvement #6: The Empty List */
        /* if (first == null) {
            first = new IntNode(x, null);
            return;
        } */


        /* Improvement #6b: Sentinel Nodes */
        IntNode p = sentinel.next;
        /* Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Returns the size of the list that starts at IntNode p. */
    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size() {
        return size(sentinel.next);
    }

    /**
    public int size() {
        if (first.next == null) {
            return 1;
        }
        first = first.next;
        return 1 + size(); // Changes the SLList! No!
    }
     */

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(4);
        System.out.println(L.size());
        System.out.println(L.size);
    }
}
