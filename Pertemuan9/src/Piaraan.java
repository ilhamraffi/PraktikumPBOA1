import java.util.LinkedList;

public class Piaraan {
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() { 
        return this.nbelm; 
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        this.nbelm = Lanabul.size();
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peekFirst();
    }

    public Anabul dequeueAnabul() {
        Anabul removed = Lanabul.pollFirst();
        this.nbelm = Lanabul.size();
        return removed;
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.print(a.getNama() + " ");
        }
        System.out.println();
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) count++;
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " [" + a.getClass().getSimpleName() + "]");
        }
    }
}