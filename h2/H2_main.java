package h2;

import java.util.Arrays;

public class H2_main {
    public static boolean compareArrays(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] e = {1, 2, 3};
        System.out.println(compareArrays(a, e)); // true
    }
}
