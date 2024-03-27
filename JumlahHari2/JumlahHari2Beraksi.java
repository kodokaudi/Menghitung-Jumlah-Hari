package JumlahHari2;

import java.util.Scanner;

public class JumlahHari2Beraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input tahun
        System.out.print("Masukkan tahun: ");
        int tahun = 0;
        while (true) {
            try {
                tahun = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Masukkan tahun dalam bentuk angka!");
                System.out.print("Masukkan tahun: ");
            }
        }

        // Meminta input bulan
        System.out.print("Masukkan bulan: ");
        int bulan = 0;
        while (true) {
            try {
                bulan = Integer.parseInt(scanner.nextLine());
                if (bulan < 1 || bulan > 12)
                    throw new IllegalArgumentException("Error! Masukkan bulan dari 1-12!");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Masukkan bulan dalam bentuk angka.");
                System.out.print("Masukkan bulan: ");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.print("Masukkan bulan: ");
            }
        }

        // Menghitung jumlah hari
        int jumlahHari = JumlahHari2.hitungHari(tahun, bulan);
        if (jumlahHari == -1)
            System.out.println("Error: Bulan tidak valid.");
        else
            System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah " + jumlahHari + " hari.");

        scanner.close();
    }
}

