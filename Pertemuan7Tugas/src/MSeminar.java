public class MSeminar {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Pak Antok", "198111");
        Dosen d2 = new Dosen("Bu Susi puji", "198222");

        Mahasiswa m1 = new Mahasiswa("Andi", "A11", d1);
        Mahasiswa m2 = new Mahasiswa("Budi", "A12", d1);
        Mahasiswa m3 = new Mahasiswa("Cici", "A13", d2);
        Mahasiswa m4 = new Mahasiswa("Dedi", "A14", d2);
        Mahasiswa m5 = new Mahasiswa("Eka", "A15", d1);

        Seminar s = new Seminar();

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Jumlah peserta: " + s.countPeserta());

        System.out.println("\nDaftar Peserta:");
        s.tampilPeserta();

        System.out.println("\nJumlah mahasiswa: " + s.countMahasiswa());

        m1.setWali(d2);

        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}