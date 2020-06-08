package com.company;


class Challenge2v2 {

    public static void main(String[] args) {
        line();
        Top();
        top2();
        Bottom();
        line();
    }

    public static void Top() {
        for (int line = 1; line < 4; line++) {
            System.out.print("|");
            for (int space = 1; space <= -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= -2 * line + 8; space++) {
                System.out.print(" ");
            }

        }
    }
    public static void top2() {
        System.out.println("|<>............<>|");
    }


    public static void line() {
        System.out.println("#================#");
    }


    public static void Bottom() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int space = 1; space < -2 * line + 8; space++) {
                System.out.print("");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }


    }