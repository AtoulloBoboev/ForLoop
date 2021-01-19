package com.codewithatoullo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner it = new Scanner(System.in);
        int x;
        System.out.print("Enter a number:");
        x = it.nextInt();
        System.out.print("От ");
        for (int i = 0; i <= 24; i++) {
            if (x % 2 == 0) {
                x += 1;
                System.out.print(" " + x);
            } else {
                x += 2;
                System.out.print(" " + x);
            }
        }
        System.out.print(" до.");

    }
}
