public class Kendaraan {
    private String noPlat;
    private String Jenis;

    public Kendaraan(){

    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    public String getnoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return Jenis;
    }

    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }

    public void printKendaraan(){
        System.out.println("noPlat: " + noPlat);
        System.out.println("Jenis: " + Jenis);
    }
    
}
