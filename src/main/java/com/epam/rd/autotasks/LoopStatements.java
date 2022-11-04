package com.epam.rd.autotasks;


class LoopStatements {
    public static int sumOddDigits(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        while (n > 0) {
            int x = n % 10;
            if (x % 2 != 0) {
                sum += x;
            }
            n /=10;
        }
        return sum;
    }
}