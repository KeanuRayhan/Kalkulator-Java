package com.javakeanu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kalkulator ===");

        System.out.print("Masukkan angka pertama: ");
        String input1 = scanner.nextLine();

        System.out.print("Masukkan angka kedua: ");
        String input2 = scanner.nextLine();

        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        String hasil = Computation.hitung(input1, input2, operator);
        System.out.println(hasil);

    }
}