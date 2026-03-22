import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Bambang", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Rumi", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Supri", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "Semarang", 10000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("=== STATISTIK JUMLAH SDM ===");
        System.out.println("Total Manusia    : " + Manusia.getCounterMns());
        System.out.println("Total PNS        : " + PNS.getCounterPNS());
        System.out.println("Total Pengusaha  : " + Pengusaha.getCounterPengusaha());
        System.out.println("Total Petani     : " + Petani.getCounterPetani());
        System.out.println("----------------------------------\n");

        System.out.println("=== DETAIL PEGAWAI PNS (p1) ===");
        p1.cetakInfo(); 
        System.out.println("Masa Kerja   : " + p1.hitungMasaKerja() + " Tahun");
        System.out.println("Pajak Tahunan: Rp " + (long)p1.hitungPajak());

        System.out.println("\n=== DETAIL PENGUSAHA (pe1) ===");
        pe1.cetakInfo();
        System.out.println("Masa Kerja   : " + pe1.hitungMasaKerja() + " Tahun");
        System.out.println("Pajak Tahunan: Rp " + (long)pe1.hitungPajak());

        System.out.println("\n=== DETAIL PETANI (pt1) ===");
        pt1.cetakInfo();
        System.out.println("Masa Kerja   : " + pt1.hitungMasaKerja() + " Tahun");
        System.out.println("Pajak Tahunan: Rp " + (long)pt1.hitungPajak() + " (Bebas Pajak)");

        System.out.println("\n=== UPDATE INFO PNS (p2) ===");
        p2.cetakInfo();
    }
}