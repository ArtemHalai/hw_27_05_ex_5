package com.epam.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter integer value: ");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        System.out.println("Enter position of bit you want to replace: ");
        int pos = scanner.nextInt();

        System.out.println("Enter 1 or 0 to replace at chosen position: ");
        int number = scanner.nextInt();
        if (number != 0 && number != 1) {
            System.out.println("Wrong number!");
        } else {
            changeBit(value, pos, number);
        }
    }

    private static void changeBit(int value, int pos, int number) {
        int mask = 1 << pos;
        System.out.println((value & ~mask) | ((number << pos) & mask));
    }
}
