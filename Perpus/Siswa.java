package Perpus;

import java.util.ArrayList;

public class Siswa implements User {

    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa() {
        //0
        this.namaSiswa.add("Sasa");
        this.alamat.add("Ngawi");
        this.telepon.add("085233214156");
        this.status.add(true);

        //1
        this.namaSiswa.add("Ayu");
        this.alamat.add("Nganjuk");
        this.telepon.add("081217161884");
        this.status.add(false);

        //2
        this.namaSiswa.add("Veve");
        this.alamat.add("Malang");
        this.telepon.add("081357363062");
        this.status.add(true);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }

    public void editStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);
    }

    public int getJmlSiswa() {
        return this.status.size();
    }

    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
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
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }

}
