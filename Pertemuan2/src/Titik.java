/* Nama File    : Titik.java */
/* Deskripsi    : berisi atribut dan method untuk objek Titik */
/* Pembuat      : Ilham Muhammad Raffi*/
/* Tanggal      : Kamis, 19 Januari 2026 */

public class Titik {
    // Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // Konstruktor
    Titik(){
        this(0,0);
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    void printCounterTitik() {
        System.out.println(this.counterTitik);
    }
    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }



    void getJarakPusat() {
        double jarak = Math.sqrt(absis * absis + ordinat * ordinat);
        System.out.println("Jarak titik ke pusat: " + jarak);
    }

    void getJarak(Titik T) {
        double jarak = Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
        System.out.println("Jarak titik ke titik lain: " + jarak);
    }

    void RefleksiX(){
        ordinat = -1;
    }

    void getRefleksiX() {
        System.out.println("Refleksi terhadap sumbu X: Titik(" + absis + ", " + (-ordinat) + ")");
    }

    void getRefleksiY() {
        System.out.println("Refleksi terhadap sumbu Y: Titik(" + (-absis) + ", " + ordinat + ")");
    }

    int getKuadran(){
        if (absis == 0 && ordinat == 0) {
            return 0;
        } else {
             if (absis > 0 && ordinat > 0) {
                return 1;
            } else {
                if (absis < 0 && ordinat > 0) {
                    return 2;
                } else {
                    if (absis < 0 && ordinat < 0) {
                        return 3;
                    } else {
                        return 4;
                    }
                }
            }
        }
    }
        }
           


