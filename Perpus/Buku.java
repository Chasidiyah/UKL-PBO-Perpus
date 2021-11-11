package Perpus;

import java.util.ArrayList;

public class Buku {

    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() {
        this.namaBuku.add("TOEFL Guide");
        this.stok.add(33);
        this.harga.add(50000);

        this.namaBuku.add("Programmer");
        this.stok.add(5);
        this.harga.add(156000);

        this.namaBuku.add("Algorithms");
        this.stok.add(52);
        this.harga.add(171000);

        this.namaBuku.add("TOEFL iBT");
        this.stok.add(37);
        this.harga.add(95000);
    }

    public int getJmlBuku() {
        return this.namaBuku.size();
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku.add(namaBuku);
    }

    public String getNamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    public void editStok(int idBuku, int stok) {
        this.stok.set(idBuku, stok);;
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }

}
