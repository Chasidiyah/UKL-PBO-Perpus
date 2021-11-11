
package Perpus;

public class Laporan {

    public void laporan(Buku buku) {

        int x = buku.getJmlBuku();

        System.out.println();
        System.out.println("Tabel Buku");
        System.out.println();
        System.out.println("ID \tNama Buku   \tStok  \tHarga Pinjam");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + buku.getNamaBuku(i) + "   \t" + buku.getStok(i) + "   \t" + buku.getHarga(i) + "/minggu");
        }
    }

    public void laporan(Siswa siswa) {
        int x = siswa.getJmlSiswa();

        System.out.println();
        System.out.println("Tabel Siswa");
        System.out.println();
        System.out.println("ID \tNama Siswa   \tAlamat   \tTelepon \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + siswa.getNama(i) + "   \t" + siswa.getAlamat(i) + "   \t" + siswa.getTelepon(i) + "   \t" + siswa.getStatus(i));
        }
    }

    public void laporan(Peminjaman peminjaman, Buku buku) {
        int x = peminjaman.getJmlPeminjaman();

        System.out.println();
        System.out.println("Laporan Peminjaman");
        System.out.println();
        System.out.println("Nama Buku   \tBanyak \tHarga Pinjam \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyaknya(i) * buku.getHarga(peminjaman.getIdBuku(i));
            total += jumlah;

            System.out.println(buku.getNamaBuku(peminjaman.getIdBuku(i)) + "   \t" + peminjaman.getBanyaknya(i) + "   \t" + buku.getHarga(peminjaman.getIdBuku(i)) + "/minggu" + "   \t" + jumlah);
        }
        System.out.println("Total Omset =" + total);

    }
}
