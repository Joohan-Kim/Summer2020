package com.company


public class Challenge2v2 {

    public static void main(String[] args) { //main method
        // call all my functions
        line();
        Top();
        Bottom();
        line();
    }

    public static void Top() {
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
            for (int space = 1; space <= -2 * line + 7; space++) {
                System.out.print(" ");
            }
                System.out.println("|");
            }

        }

        public static void line () {
            System.out.println("#================");
        }


    public static void Bottom(){

        System.out.println("| <>...........<>  |");
        System.out.println("|  <>........<>    |");
        System.out.println("|    <>....<>      |");
        System.out.println("|      <><>        |");
    }
}


