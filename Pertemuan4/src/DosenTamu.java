import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String nip, String nidk, String nama,
                     LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas,
                     LocalDate tanggalAkhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {

        Period kontrak =
                Period.between(LocalDate.now(), tanggalAkhirKontrak);

        System.out.println("NIP : " + nip);
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);

        System.out.println("Sisa Kontrak : "
                + kontrak.getYears()*12 + kontrak.getMonths()
                + " bulan");

        System.out.println("Tanggal Berakhir Kontrak : "
                + formatTanggal(tanggalAkhirKontrak));

        System.out.println("Gaji Pokok : "
                + formatRupiah(gajiPokok));

        System.out.println("Tunjangan : "
                + formatRupiah(hitungTunjangan()));
    }
}