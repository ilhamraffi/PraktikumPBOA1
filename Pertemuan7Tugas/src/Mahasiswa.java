public class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim +
                ", Nama: " + nama +
                ", Dosen Wali: " + dosenWali.getNama());
    }
}