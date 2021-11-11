
package Perpus;

import java.util.ArrayList;

public class Petugas implements User {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> status = new ArrayList<String>();

    public Petugas() {
        //0
        this.namaPetugas.add("Reva");
        this.alamat.add("Kediri");
        this.telepon.add("085285679467");

        //1c
        this.namaPetugas.add("Dinda");
        this.alamat.add("Magetan");
        this.telepon.add("085372956748");

        //2
        this.namaPetugas.add("Rahma");
        this.alamat.add("Jakarta");
        this.telepon.add("082530670743");
    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }

}