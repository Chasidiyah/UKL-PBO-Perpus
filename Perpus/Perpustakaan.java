package Perpus;

import java.util.Scanner;

public class Perpustakaan {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int temp = 0;

        do {

            Buku buku = new Buku();
            Laporan laporan = new Laporan();
            Siswa siswa = new Siswa();
            Peminjaman peminjaman = new Peminjaman();
            laporan.laporan(buku);
            laporan.laporan(siswa);
            peminjaman.prosesPeminjaman(siswa, peminjaman, buku, laporan);

            laporan.laporan(buku);
            laporan.laporan(siswa);

            System.out.println("lanjutkan atau matikan 1 : 99");

            temp = myObj.nextInt();
        } while (temp != 99);

        System.exit(0);

    }

}
