public class Dosen{
    private String nama;
    private String nip;
    private String prodi;

    public Dosen(){
        
    }

    public Dosen(String nama, String nip, String prodi) {
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void printfDosen() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Prodi: " + prodi);
    }

}