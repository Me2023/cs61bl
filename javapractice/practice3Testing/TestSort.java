/** Errors: JUnit, testFindSmallest */

public class TestSort {

    public static void testSort() {
        String[] input = {"I", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);

        /** JUnit Testing */
        // org.junit.Assert.assertArrayEquals(expected, input);

        /** Ad-Hoc Testing */
        for(int i = 0; i < input.length; i +=1 ) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position" + i + ", expected: " + expected[i] + ", but got: " + input[i]);
                break; // or return;
            }
        }


        if (!java.util.Arrays.equals(input, expected)) {
            System.out.println("Error!");
        }
    }

    public static void testFindsmallest() {
        String[] input = {"I", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input, 0);
        System.out.println(actual);

        if(actual == expected) {
            System.out.println("Yes!");
        }
        else {
            System.out.println("No!");
        }

    }


    public static void main(String[] args) {
        testSort();
        testFindsmallest();
    }
}
