public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}

// 1. Ketika eksepsi terjadi, apakah baris 6 pada AngkaSial.java di atas dieksekusi?
// Tidak, ketika angka 13 dimasukan program mengeksekusi baris 4 pada AngkaSial.java yang melemparkan AngkaSialException, sehingga baris 6 tidak dieksekusi.
// 2. Apakah baris 15 pada AngkaSial.java di atas dieksekusi? 
// Iya, baris 15 adalah awal dari blok catch. karena eksepsi dilemparakan pada pemanggilan as.cobaAngka(13), maka program akan langsung mengeksekusi blok catch, sehingga baris 15 dieksekusi.