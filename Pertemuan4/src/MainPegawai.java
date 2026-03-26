import java.time.LocalDate;

public class MainPegawai {

    public static void main(String[] args) {

        // Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
                "9545647548",
                "78647324",
                "bilal",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika"
        );

        // Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu(
                "7654321987",
                "99887766",
                "andre",
                LocalDate.of(1985,8,12),
                LocalDate.of(2022,2,1),
                4500000,
                "Fakultas Teknik",
                LocalDate.of(2026,12,31)
        );

        // Tendik
        Tendik tendik = new Tendik(
                "1234567890",
                "Citra",
                LocalDate.of(1992,3,20),
                LocalDate.of(2018,7,1),
                3500000,
                "Akademik"
        );

        System.out.println("===== DATA DOSEN TETAP =====");
        dosenTetap.printInfo();

        System.out.println("\n===== DATA DOSEN TAMU =====");
        dosenTamu.printInfo();

        System.out.println("\n===== DATA TENDIK =====");
        tendik.printInfo();
    }
}