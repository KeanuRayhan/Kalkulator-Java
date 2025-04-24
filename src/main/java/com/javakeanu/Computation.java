package com.javakeanu;

public class Computation {

    public static String hitung(String input1, String input2, String operator) {
        int a, b;

        // Validasi angka
        try {
            a = Integer.parseInt(input1);
            b = Integer.parseInt(input2);
        } catch (NumberFormatException e) {
            return "Error: Input harus berupa angka.";
        }

        // Validasi rentang
        if (a < -32768 || a > 32767 || b < -32768 || b > 32767) {
            return "Error: Nilai harus berada dalam rentang -32,768 hingga 32,767.";
        }

        // Validasi operator
        if (!operator.matches("[+\\-*/]")) {
            return "Error: Operator tidak valid. Gunakan +, -, * atau /.";
        }

        // Validasi pembagian nol
        if (operator.equals("/") && b == 0) {
            return "Error: Tidak bisa membagi dengan nol.";
        }

        // Perhitungan
        int hasil = 0;
        switch (operator) {
            case "+":
                hasil = Calculator.tambah(a, b);
                break;
            case "-":
                hasil = Calculator.kurang(a, b);
                break;
            case "*":
                hasil = Calculator.kali(a, b);
                break;
            case "/":
                hasil = Calculator.bagi(a, b);
                break;
        }

        return "Hasil: " + hasil;
    }
}
