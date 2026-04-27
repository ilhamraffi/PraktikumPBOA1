public class Persegi extends BangunDatar {
    private Double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(Double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public Double getSisi() {
        return sisi;
    }

    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public Double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}