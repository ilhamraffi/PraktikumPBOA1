public class Asersi2{
    public static void main (String[] args){
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran =" + kelilingLingkaran);

    }
}

//Pada kode di atas terdapat suatu kesalahan, kesalahannya adalah penggunaan assert yang dimana dia malah memvalidasi nilai jari jari. Penggunaan assert yang benar untuk keperluan dubbing, bukan untuk validasi atau kondisi dalam program