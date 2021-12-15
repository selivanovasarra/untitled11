package com.company.sadna23;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 1000000000, count = 0;
        for (int i = 0; i < 12; i++) {
            int num= s.nextInt();
            if (num<min) {
                min = num;
            }
            if (num>10)
                count++;
        }

        System.out.println(min);
        System.out.println(count);
    }
}
