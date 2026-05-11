class Kucing extends Anabul {
    public Kucing(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() { 
        System.out.println(nama + " bergerak dengan berjalan."); 
    }

    @Override
    public void bersuara() { 
        System.out.println(nama + " berbunyi: Meong!"); 
    }
}