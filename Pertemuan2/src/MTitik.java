public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik(); 
        T1.getJarakPusat();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1; 
        T2.printTitik(); 
        T1.setAbsis(10); 
        T1.setOrdinat(10); 
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(5, 6);
        T3.printTitik();
        T4.printTitik();

        System.out.println("Jumlah titik yang telah dibuat: " + Titik.counterTitik);

        T4.getKuadran();

        T3.getJarakPusat();
        T4.getJarakPusat();

        T3.getJarak(T4);
        T4.getJarak(T3);

        T3.RefleksiX();
        T3.printTitik();
    }
}