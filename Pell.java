package edu.neu.coe.info6205;

public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0)
            throw new UnsupportedOperationException("n can't be negative");

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = 2 * arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
