package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Model.Mahasiswa mahasiswa = new Model.Mahasiswa();
        mahasiswa.setNama("19630578");
        mahasiswa.setNama("Muhammad Daffa Naufal");

        System.out.println(mahasiswa.getNpm());

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);
        try {
            mahasiswa.setTanggalLahir(simpleDateFormat.parse("06-10-2000"));
        } catch (ParseException e) {
            System.err.println("================================================");
            System.err.println("============= Format Tanggal Salah =============");
            System.err.println("================================================");
        }

        mahasiswa.tampilkanAtribut();
        System.out.println("Usia saya " + mahasiswa.hitungUsia() + " Tahun");
        System.out.println("-----------------------------------------------");

        Model.Mahasiswa m = new Model.Mahasiswa("19630578","Muhammad Daffa Naufal", new Date());
        m.tampilkanAtribut();
        System.out.println("-----------------------------------------------");



    }
}