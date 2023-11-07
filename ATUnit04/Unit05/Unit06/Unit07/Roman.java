package Unit05.Unit06.Unit07;

import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int I = 1;
        int X = 10;
        int C = 100;
        int M = 1000;
        System.out.print("Please enter a number between 1-3999: ");
        int number = input.nextInt();
        if (number < 1 || number > 3999) {
            System.out.println("Number out of range");
        }
        int numberM = number / M;
        number = number % 1000;

        int numberC = number / C;
        number = number % 100;

        int numberX = number / X;
        number = number % 10;

        int numberI = number / I;

        if (numberM == 3) {
            System.out.print("MMM");
        } else if (numberM == 2) {
            System.out.print("MM");
        } else if (numberM == 1) {
            System.out.print("M");
        }

        if (numberC == 9) {
            System.out.print("CM");
        } else if (numberC == 8) {
            System.out.print("DCCC");
        } else if (numberC == 7) {
            System.out.print("DCC");
        } else if (numberC == 6) {
            System.out.print("DC");
        } else if (numberC == 5) {
            System.out.print("D");
        } else if (numberC == 4) {
            System.out.print("CD");
        } else if (numberC == 3) {
            System.out.print("CCC");
        } else if (numberC == 2) {
            System.out.print("CC");
        } else if (numberC == 1) {
            System.out.print("C");
        }

        if (numberX == 9) {
            System.out.print("XC");
        } else if (numberX == 8) {
            System.out.print("LXXX");
        } else if (numberX == 7) {
            System.out.print("LXX");
        } else if (numberX == 6) {
            System.out.print("LX");
        } else if (numberX == 5) {
            System.out.print("L");
        } else if (numberX == 4) {
            System.out.print("XL");
        } else if (numberX == 3) {
            System.out.print("XXX");
        } else if (numberX == 2) {
            System.out.print("XX");
        } else if (numberX == 1) {
            System.out.print("X");
        }

        if (numberI == 9) {
            System.out.print("IX");
        } else if (numberI == 8) {
            System.out.print("VIII");
        } else if (numberI == 7) {
            System.out.print("VII");
        } else if (numberI == 6) {
            System.out.print("VI");
        } else if (numberI == 5) {
            System.out.print("V");
        } else if (numberI == 4) {
            System.out.print("IV");
        } else if (numberI == 3) {
            System.out.print("III");
        } else if (numberI == 2) {
            System.out.print("II");
        } else if (numberI == 1) {
            System.out.print("I");
        }

        System.out.println("");

    }
}
