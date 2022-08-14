/** ArrayBasics */
public class BasicArraySyntax {
    public static void main(String[] args){
        /** Like classes, arrays are (almost always) instantiated with new.
         * Three valid notations:
         */
        int[] x, y;
        y = new int[3];
        x = new int[]{1, 2, 3, 4, 5, 6};
        int[] w = {9, 10 ,11, 12, 13}; // Can omit the new if you are also declaring a variable.

        String[] s = new String[6];
        s[4] = "ketchup";
        s[x[3] - x[1]] = "muffins";

        int[] b = {9, 10, 11};
        System.arraycopy(b, 0, x, 3, 2); // (In Python) x[3:5] = b[0:2]
    }
}
