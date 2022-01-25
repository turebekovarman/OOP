class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { // if "i" is a divisor
                sum += i + n/i; // add both divisors
            }
        }
        /* If sqrt is a divisor, we should only count it once */
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}