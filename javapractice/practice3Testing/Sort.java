public class Sort {
    public static void sort(String[] x) {
        // Find the smallest item
        // Move it to the front
        // Selection sort the rest
        sort(x, 0);
    }

    private static void sort(String[] x, int start) {
        if (start == x.length){
            return;
        }
        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);

    }

    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = 0; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            // System.out.println(cmp);
            if (cmp < 0) {
                smallestIndex = i;
                // System.out.println("*****" + smallestIndex);
            }
        }
        return smallestIndex;
    }

    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    public static void main(String[] args) {
        String[] x = {"b", "c", "a"};
        int z = findSmallest(x, 0);
        // System.out.println(z);
    }
}
