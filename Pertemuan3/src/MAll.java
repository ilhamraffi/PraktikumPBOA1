public class MAll {
    public static void main(String[] args) {
        Dosen D1 = new Dosen("Dr. Budi", "123456789", "Informatika");
        D1.printfDosen();

        Dosen D2 = new Dosen("Dr. Siti", "987654321", "Sistem Informasi");
        D2.printfDosen();

        D1.setNip("111111111");
        D1.setProdi("Teknik Komputer");
        D1.printfDosen();

        MataKuliah mk1 = new MataKuliah("Algoritma dan Pemrograman", "MK001", 3);
        mk1.printfMatkul();

        MataKuliah mk2 = new MataKuliah ("Pemrograman Berorientaso Objek", "MK002", 3);
        mk2.printfMatkul();

        mk1.setNama("Algoritma dan Pemrograman Lanjutan");
        mk1.setidMatkul("MK003");
        mk1.printfMatkul();

        Kendaraan k1 = new Kendaraan("k 0 M", "Motor");
        k1.printKendaraan();

        Kendaraan k2 = new Kendaraan("M 1 M", "Mobil");
        k2.printKendaraan();

        k1.setnoPlat("J O J");
        k1.setJenis("Mobil");
    }
}
