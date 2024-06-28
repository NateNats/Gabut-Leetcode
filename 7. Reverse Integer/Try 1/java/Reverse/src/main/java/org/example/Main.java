package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse (int x) {
        int val;
        int x1 = x;
        long cont = 0;

        while (x1 != 0) {
            val = x1 % 10;
            cont = val + cont * 10;
            x1 /= 10;

            if (cont > Integer.MAX_VALUE) return 0;
            if (cont < Integer.MIN_VALUE) return 0;
        }
        return (int) cont;
    }
}