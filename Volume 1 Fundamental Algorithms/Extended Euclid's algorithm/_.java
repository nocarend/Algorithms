class algo {
    private static int[] extendedEuclidAlgo(int m, int n) {
        if (n == 0) {
            return new int[]{m, 1, 0};
        }
        int[] calculation = extendedEuclidAlgo(n, m % n);
        int _a, _b;
        _a = calculation[1];
        _b = calculation[2];
        calculation[1] = _b;
        calculation[2] = _a - m / n * _b;
        return calculation;
    }

    public static void main(String[] args) {
        int m = 3, n = 7;
        /*
        IO
         */
        System.out.println(Arrays.toString(extendedEuclidAlgo(m, n)));
    }
}