class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean sign = (divisor < 0) ^ (dividend < 0);
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        int result = 0;
        while (ldivisor <= ldividend) {
            int pow = 0;
            while(ldividend >= (ldivisor << pow))
            {
                pow++;
            }
            pow--;
            result += 1<<pow;
            ldividend = ldividend - (ldivisor << pow);
        }
        return sign ? -result : result;
    }
}