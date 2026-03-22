public class MainBangunDatar {
    public static void main(String[] args) {
        Persegi kotakA = new Persegi(12.0, "Oranye", "Double-Line");
        Persegi kotakB = new Persegi(8.5, "Hitam", "Solid");
        
        Lingkaran bundarA = new Lingkaran(7.0, "Merah Muda", "Dotted");
        Lingkaran bundarB = new Lingkaran(10.0, "Cokelat", "Solid");

        BangunDatar kotakC = new Persegi(15.0, "Cyan", "Groove");
        BangunDatar bundarC = new Lingkaran(21.0, "Emas", "Ridge");

        System.out.println("=== ANALISIS KOTAK A ===");
        kotakA.printInfo();
        System.out.printf("Luas: %.2f | Keliling: %.2f\n", kotakA.getLuas(), kotakA.getKeliling());
        System.out.println("Garis Diagonal: " + kotakA.getDiagonal());

        System.out.println("\n=== ANALISIS BUNDAR A ===");
        bundarA.printInfo();
        System.out.printf("Luas: %.2f | Keliling: %.2f\n", bundarA.getLuas(), bundarA.getKeliling());

        System.out.println("\n=== AKSES KHUSUS (DOWNCASTING) ===");
        double diagC = ((Persegi) kotakC).getDiagonal();
        System.out.println("Diagonal Kotak C (Cast): " + diagC);

        System.out.println("\n=== UJI PERBANDINGAN ===");
        System.out.println("Apakah Kotak A & B luasnya sama? " + kotakA.isEqualLuas(kotakB));
        System.out.println("Apakah Bundar B & C kelilingnya sama? " + bundarB.isEqualKeliling(bundarC));

        System.out.println("\n=== EKSPERIMEN ZOOM (RESIZING) ===");
        System.out.println("Luas awal Kotak B: " + kotakB.getLuas());
        
        kotakB.zoomIn();
        System.out.println("Setelah Zoom In (200%): " + kotakB.getLuas());
        
        kotakB.zoom(25); 
        System.out.println("Setelah Zoom Custom (25%): " + kotakB.getLuas());

        System.out.println("\n========================================");
        System.out.println("Total Objek Bangun Datar di Memory: " + BangunDatar.counterBangunDatar);
        System.out.println("========================================");
    }
}
