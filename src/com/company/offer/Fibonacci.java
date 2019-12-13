package com.company.offer;

/**
 * 输出斐波那契数列第n项
 * @author ynx
 * @version V1.0
 * @date 2019-12-09
 * @modified_date 2019-12-09
 */
public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(5));
    }

    public long fibonacci(int n) {
        long result = 0;
        long preOne = 1;
        long preTwo = 0;
        if (n == 0) {
            return preTwo;
        }

        if (n == 1) {
            return preOne;
        }

        for (int i = 2; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }
}
