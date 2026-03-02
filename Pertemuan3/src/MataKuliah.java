public class MataKuliah {
    private String Nama;
    private String idMatkul;
    private int sks;

    public MataKuliah(){

    }

    public MataKuliah(String Nama, String idMatkul, int sks) {
        this.Nama = Nama;
        this.idMatkul = idMatkul;
        this.sks = sks;
    }

    public String getNama(){
        return Nama;
    }

    public String getIdMatkul(){
        return idMatkul;
    }

    public int getSks(){
        return sks;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setidMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void printfMatkul() {
        System.out.println("MataKuliah: " + Nama);
        System.out.println("idMatkul: " + idMatkul);
        System.out.println("sks: " + sks);
    }

}
