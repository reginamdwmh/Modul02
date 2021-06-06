package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main (String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19631017";
        mahasiswa.nama = "Regina";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("29-09-2000");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 =new Mahasiswa("19631017","Regina","29-09-2000");
        mahasiswa2.tampilkanAtribut();

    }
}
