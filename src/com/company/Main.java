package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Suma: " + (a+b));
        System.out.println("Skirtumas: " + (a-b));
    }
}
