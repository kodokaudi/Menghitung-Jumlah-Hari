package JumlahHari2;

class JumlahHari2 {
    public static int hitungHari(int tahun, int bulan) {
        switch (bulan) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0))
                    return 29;
                else
                    return 28;
            default:
                return -1; // Menunjukkan bulan tidak valid
        }
    }
}
