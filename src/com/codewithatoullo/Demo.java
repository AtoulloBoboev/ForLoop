package com.codewithatoullo;

public class Demo {
    public static void main(String[] args) {
        System.out.print("От");
        for (int i = 10; i < 100; i += 2) {
            if (i % 4 == 0) {
                System.out.print(" " + i + "#");
            } else if (i % 4 != 0)
                System.out.print(" " + i);
        }
        System.out.print(" на этом всё.");

    }
}
