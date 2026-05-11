public class MainKlinik {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        Anjing doggy = new Anjing("safrie", 90.0);

        Anggora cat1 = new Anggora("jule", 68.5);

        Kembangtelon cat2 = new Kembangtelon("haryanto", 3.2);
        
        Burung bird = new Burung("budi gunawan", 0.5);

        klinik.enqueueAnabul(doggy);
        klinik.enqueueAnabul(cat1);
        klinik.enqueueAnabul(cat2);
        klinik.enqueueAnabul(bird);

        klinik.showAnabul();
        klinik.showJenisAnabul();

        System.out.println("\nStatistik Klinik:");
        System.out.println("Total Kucing: " + klinik.countKucing());
        System.out.println("Total Bobot Kucing: " + klinik.bobotKucing() + " kg");

        System.out.println("\nMemproses antrean pertama...");
        Anabul diproses = klinik.dequeueAnabul();
        System.out.println("Keluar antrean: " + diproses.getNama());
        
        System.out.println("Sisa antrean: " + klinik.getNbelm());
    }
}