package model;

import java.util.Date;

public class MahasiswaBeraksi {
    public static void main (String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19631017";
        mahasiswa.nama = "Regina";
        mahasiswa.tanggalLahir = new Date();
    }
}
