import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public abstract class Pegawai {

    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir,
                   LocalDate tmt, double gajiPokok) {

        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    protected String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        return date.format(formatter);
    }

    protected String formatRupiah(double amount) {
        NumberFormat format =
                NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        return format.format(amount);
    }

    public abstract void printInfo();
}