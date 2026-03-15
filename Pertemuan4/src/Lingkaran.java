public class Lingkaran extends BangunDatar {
    private Double jari;

    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(Double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public Double getJari() {
        return jari;
    }

    public void setJari(Double jari) {
        this.jari = jari;
    }

    public Double getLuas() {
        return Math.PI * jari * jari;
    }

    public Double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}