package com.company.sadna23;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int gr1 = 0, gr2 = 0, m1 = 0, m2 = 0;
        double num;
        for (int i = 0; i < 120; i++) {
            num = s.nextDouble();
            if (num >= 10 && num < 12) {
                gr1++;
                System.out.println("oren");
            }
            if (num >= 12 && num < 13) {
                gr2++;
                System.out.println("berosh");
            }
        }

        m1 = (int) Math.ceil(1.0 * gr1 / 10);
        m2 = (int) Math.ceil(1.0 * gr2 / 10);
    }
}