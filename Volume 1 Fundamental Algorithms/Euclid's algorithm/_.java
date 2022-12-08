class algo {
    private static int euclidAlgoGCD(int m, int n) {
        return n == 0 ? m : euclidAlgoGCD(n, m % n);
    }

    public static void main(String[] args) {
        int n = 24, m = 36;
        /*
        IO
         */
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        System.out.println(euclidAlgoGCD(m, n));
    }
}
