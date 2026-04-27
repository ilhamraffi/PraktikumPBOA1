public class Main {
    public static void main(String[] args) {

        // Membuat objek Persegi
        Persegi persegi1 = new Persegi(5.0, "Merah", "Solid");
        Persegi persegi2 = new Persegi(7.0, "Hijau", "Dotted");

        // Membuat objek Lingkaran
        Asersi2 lingkaran1 = new Asersi2(3.0, "Biru", "Dashed");
        Asersi2 lingkaran2 = new Asersi2(4.0, "Kuning", "Solid");

        // Informasi Persegi 1
        System.out.println("=== Informasi Persegi 1 ===");
        persegi1.printInfo();
        System.out.println("Luas Persegi      : " + persegi1.getLuas());
        System.out.println("Keliling Persegi  : " + persegi1.getKeliling());
        System.out.println("Diagonal Persegi  : " + persegi1.getDiagonal());

        // Informasi Persegi 2
        System.out.println("\n=== Informasi Persegi 2 ===");
        persegi2.printInfo();
        System.out.println("Luas Persegi      : " + persegi2.getLuas());
        System.out.println("Keliling Persegi  : " + persegi2.getKeliling());
        System.out.println("Diagonal Persegi  : " + persegi2.getDiagonal());

        // Informasi Lingkaran 1
        System.out.println("\n=== Informasi Lingkaran 1 ===");
        lingkaran1.printInfo();
        System.out.println("Luas Lingkaran    : " + lingkaran1.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran1.getKeliling());

        // Informasi Lingkaran 2
        System.out.println("\n=== Informasi Lingkaran 2 ===");
        lingkaran2.printInfo();
        System.out.println("Luas Lingkaran    : " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran2.getKeliling());

        // Total objek BangunDatar
        System.out.println("\nTotal Bangun Datar yang dibuat: " + BangunDatar.counterBangunDatar);
    }
}