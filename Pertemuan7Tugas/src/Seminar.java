public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakPeserta = 0;
    }
    public void registrasi(Civitasakademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Seminar penuh!");
        }
    }
    public int countPeserta() {
        return banyakPeserta;
    }
    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
    }
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}