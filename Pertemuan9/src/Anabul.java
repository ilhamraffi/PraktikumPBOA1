public class Anabul {
    protected String nama;
    protected String panggilan;
    protected double bobot;

    public Anabul(String nama, double bobot) { 
        this.nama = nama; 
        this.panggilan = nama;
        this.bobot = bobot;
    }

    public String getNama() { 
        return this.panggilan; 
    }
    public void setNama(String nama) { 
        this.panggilan = nama; 
    }

    public void gerak() { 
        System.out.println(nama + " bergerak."); 
    }
    public void bersuara() {
         System.out.println(nama + " bersuara."); 
    }

    public double getBobot() {
         return this.bobot; 
    }
    public void setBobot(double bobot) {
         this.bobot = bobot;
    }
    @Override
    public String toString() {
         return this.panggilan;
    }
}
