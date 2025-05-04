package com.javakeanu;

public class Computation {

    public static String hitung(String input1, String input2, String operator) {
        try {
            int a = parseInput(input1);
            int b = parseInput(input2);

            validateRange(a);
            validateRange(b);

            validateOperator(operator);
            validateDivideByZero(operator, b);

            int hasil = compute(a, b, operator);
            return "Hasil: " + hasil;

        } catch (IllegalArgumentException | IllegalStateException e) {
            return e.getMessage();
        }
    }

    // Modul untuk melakukan pengecekan input yang dimasukkan berupa angka
    public static int parseInput(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Error: Input tidak boleh null.");
        }
        if (input.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Input tidak boleh kosong.");
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Input harus berupa angka.");
        }
    }

    // Modul untuk validasi rentang angka input
    public static void validateRange(int value) {
        if (value < -32768) {
            throw new IllegalArgumentException("Error: Nilai terlalu kecil dari batas minimum.");
        }
        if (value > 32767) {
            throw new IllegalArgumentException("Error: Nilai melebihi batas maksimum.");
        }
    }

    // Modul untuk validasi operator yang dimasukkan
    public static void validateOperator(String operator) {
        if (operator == null || operator.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Operator tidak boleh kosong.");
        }
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            throw new IllegalArgumentException("Error: Operator tidak valid.");
        }
    }

    // Modul untuk validasi khusus Pembagian dengan angka 0
    public static void validateDivideByZero(String operator, int b) {
        if (operator.equals("/") && b == 0) {
            throw new IllegalArgumentException("Error: Tidak bisa membagi dengan nol.");
        }
    }

    // Modul menghitung sesuai operasi
    public static int compute(int a, int b, String operator) {
        switch (operator) {
            case "+" -> { return Calculator.tambah(a, b); }
            case "-" -> { return Calculator.kurang(a, b); }
            case "*" -> { return Calculator.kali(a, b); }
            case "/" -> { return Calculator.bagi(a, b); }
            default -> throw new IllegalStateException("Error: Operasi tidak dikenali.");
        }
    }

}
