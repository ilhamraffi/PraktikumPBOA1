import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map penyimpan nim dan nama mahasiswa
        Map<String,String> mahasiswaMap = new HashMap<>();

        // Menambahkan data mahasiswa ke dalam Map
        mahasiswaMap.put("12094109419024702984", "Haryanto");
        mahasiswaMap.put("12094109419024702254", "Jule");
        mahasiswaMap.put("12094109419024702331", "rondiyah");
        mahasiswaMap.put("12094109419024709866", "cahyadi");

        System.out.println("Daftar Mahasiswa:");
        // Menggunakan lambda untuk menampilkan data mahasiswa
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
