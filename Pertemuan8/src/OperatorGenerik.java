public class OperatorGenerik {
    public static <T> void Tukar(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
        System.out.println("Hasil penukaran -> a=" + a + ", b=" + b);
    }
    public static <T extends Kucing, U extends Kucing> double Bobot2(T kucing1, U kucing2) {
        return kucing1.getBobot() + kucing2.getBobot();
    }
}