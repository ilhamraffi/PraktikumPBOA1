public class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = prodi;
    }
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }
    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }
    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }
    public void tampilkanData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + programStudi);
    }
}