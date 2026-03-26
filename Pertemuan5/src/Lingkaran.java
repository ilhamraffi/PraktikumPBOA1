public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @Override
    public void zoomIn() {
        this.jari *= 1.1; // Menambah ukuran menjadi 10% lebih besar
    }

    @Override
    public void zoomOut() {
        this.jari *= 0.9; // Mengurangi ukuran menjadi 10% lebih kecil
    }

    @Override
    public void zoom(int percent) {
        jari = jari * (percent / 100.0);
    }
}