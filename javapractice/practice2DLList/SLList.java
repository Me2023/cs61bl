public class SLList<BleepBlorp> {
    private StuffNode sentinel;
    private int size;

    private class StuffNode {
        public BleepBlorp item;
        public StuffNode next;
        public StuffNode(BleepBlorp i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    public SLList(BleepBlorp x) {
        sentinel = new StuffNode(null, null);
        sentinel.next = new StuffNode(x, null);
        size = 1;
    }

    public void addFirst(BleepBlorp x) {
        sentinel.next = new StuffNode(x, sentinel.next);
        size += 1;
    }

    public static void main(String[] args) {
        SLList<String> s1 = new SLList<>("bone");
        s1.addFirst("thugs");
        System.out.println(s1.sentinel.next.item);
    }
}
