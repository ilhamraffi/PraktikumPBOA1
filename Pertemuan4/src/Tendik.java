import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public LocalDate hitungTanggalPensiun() {

        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan() {

        int masaKerja = hitungMasaKerja().getYears();
        return 0.01 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {

        Period masaKerja = hitungMasaKerja();

        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);

        System.out.println("Masa Kerja : "
                + masaKerja.getYears() + " tahun "
                + masaKerja.getMonths() + " bulan");

        System.out.println("Tanggal Pensiun : "
                + formatTanggal(hitungTanggalPensiun()));

        System.out.println("Gaji Pokok : "
                + formatRupiah(gajiPokok));

        System.out.println("Tunjangan : "
                + formatRupiah(hitungTunjangan()));
    }
}