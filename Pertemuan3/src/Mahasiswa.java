public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;
    private Dosen dosenWali;
    private Kendaraan Kendaraan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public MataKuliah[] getListMatKul() {
        return listMatKul;
    }

    public void setListMatKul(MataKuliah[] listMatKul) {
        this.listMatKul = listMatKul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return Kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.Kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        } else {
            System.out.println("Mata kuliah sudah penuh!");
        }
    }

    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            total += listMatKul[i].getSks();
        }
        return total;
    }

    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs() {
        printMhs();

        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama() 
                + " (" + listMatKul[i].getSks() + " SKS)");
        }

        System.out.println("\nTotal SKS: " + getJumlahSKS());

        if (dosenWali != null) {
            System.out.println("\nDosen Wali:");
            System.out.println("NIP  : " + dosenWali.getNip());
            System.out.println("Nama : " + dosenWali.getNama());
            System.out.println("Prodi: " + dosenWali.getProdi());
        }

        if (Kendaraan != null) {
            System.out.println("\nKendaraan:");
            System.out.println("No Plat: " + Kendaraan.getnoPlat());
            System.out.println("Jenis  : " + Kendaraan.getJenis());
        }
    }
}