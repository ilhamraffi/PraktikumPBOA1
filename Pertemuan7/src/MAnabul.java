public class MAnabul {
    public static void main(String[] args) {
        Anabul[] koleksi = new Anabul[3];
        
        koleksi[0] = new Kucing("Si Oren");
        koleksi[1] = new Anjing("Tito");
        koleksi[2] = new Burung("Mprit");

        for (Anabul a : koleksi) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}