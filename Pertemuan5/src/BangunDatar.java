public abstract class BangunDatar {
    private  Integer jmlSisi;
    private String Warna;
    private String border;
    protected static Integer counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(Integer jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        Warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public Integer getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return Warna;
    }

    public String getBorder() {
        return border;
    }

    public void setJmlSisi(Integer jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + Warna);
        System.out.println("Border: " + border);
    }

    public static void printCounter() {
        System.out.println(counterBangunDatar);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}