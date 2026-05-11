import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        this.nbelm = Lnama.size();
    }

    public void delNama(String nama) {
        Lnama.remove(nama);
        this.nbelm = Lnama.size();
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String namaLama, String namaBaru) {
        int index = Lnama.indexOf(namaLama);
        if (index != -1) {
            Lnama.set(index, namaBaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equalsIgnoreCase(nama)) count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman: " + Lnama.toString());
    }
}