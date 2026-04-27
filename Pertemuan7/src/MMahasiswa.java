public class MMahasiswa {
    public static void main(String[] args) {
        System.out.println("Testing Konstruktor");
        
        Mahasiswa m1 = new Mahasiswa();
        m1.tampilkanData();

        Mahasiswa m2 = new Mahasiswa("240601", "Budi", "Informatika");
        m2.tampilkanData();

        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.print("Hasil Kloning m2: ");
        m3.tampilkanData();

        System.out.println("\nTesting Method setProgramStudi");

        m1.setProgramStudi();
        System.out.print("Varian 1 (Kosong): ");
        m1.tampilkanData();

        m1.setProgramStudi("Sistem Informasi");
        System.out.print("Varian 2 (Input String): ");
        m1.tampilkanData();

        m1.setProgramStudi(m2);
        System.out.print("Varian 3 (Ambil dari m2): ");
        m1.tampilkanData();
    }
}