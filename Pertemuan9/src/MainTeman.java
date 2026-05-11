public class MainTeman {
    public static void main(String[] args) {
        Teman theBoys = new Teman();

        theBoys.addNama("kimiko");
        theBoys.addNama("hughie");
        theBoys.addNama("starligth");
        theBoys.addNama("butcher");
        theBoys.showTeman();
        System.out.println("Total elemen: " + theBoys.getNbelm());
        System.out.println();

        System.out.println("Anggota di indeks 0: " + theBoys.getNama(0));
        System.out.println();

        System.out.println("Apakah 'butcher' ada? " + theBoys.isMember("butcher"));
        System.out.println();

        theBoys.gantiNama("starligth", "starlight");
        theBoys.showTeman();
        System.out.println();

        theBoys.setNama(1, "hughie campbell");
        theBoys.showTeman();
        System.out.println();

        System.out.println("Jumlah nama 'BUTCHER': " + theBoys.countNama("BUTCHER"));
        System.out.println();

        theBoys.delNama("kimiko");
        theBoys.showTeman();
        System.out.println("Jumlah anggota sekarang: " + theBoys.getNbelm());
    }
}