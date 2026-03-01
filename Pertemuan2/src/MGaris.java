public class MGaris {
    public static void main(String[] args) {

        Titik titikA = new Titik(0, 0);
        Titik titikB = new Titik(4, 4);
        Titik titikC = new Titik(0, 4);
        Titik titikD = new Titik(4, 0);
        Garis garis1 = new Garis(titikA, titikB);
        Garis garis2 = new Garis(titikC, titikD);
        System.out.println("Informasi Garis Pertama:");
        garis1.printGaris();
        System.out.println("Panjang garis = " + garis1.getPanjang());
        System.out.println("Gradien garis = " + garis1.getGradien());
        System.out.println("Informasi Garis Kedua:");
        garis2.printGaris();
        System.out.println("Panjang garis = " + garis2.getPanjang());
        System.out.println("Gradien garis = " + garis2.getGradien());
        System.out.println("Titik tengah garis pertama:");
        Titik tengah = garis1.getTitikTengah();
        tengah.printTitik();
        System.out.println("Apakah kedua garis sejajar? " + garis1.isSejajar(garis2));
        System.out.println("Apakah kedua garis saling tegak lurus? " + garis1.isTegakLurus(garis2));
        System.out.println("Total objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}