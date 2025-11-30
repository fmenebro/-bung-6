package h3;

import java.util.Arrays;

public class H3_main {
    public static boolean compareArraysVal(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        int[] ac = Arrays.copyOf(a, a.length);
        int[] bc = Arrays.copyOf(b, b.length);

        Arrays.sort(ac);
        Arrays.sort(bc);

        return Arrays.equals(ac, bc);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] c = {3, 1, 2};
        System.out.println(compareArraysVal(a, c)); // true
    }
}
