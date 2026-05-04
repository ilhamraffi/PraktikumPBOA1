public class Data<T> {
    private Object[] ruang = new Object[100]; 
    private int banyak = 0;                

    public int getSize() {
        return banyak;
    }

    public void setIsi(int posisi, T objekbaru) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null) {
                banyak++;
            }
            ruang[posisi - 1] = objekbaru;
        } else {
            System.out.println("Error: Posisi harus antara 1 sampai 100.");
        }
    }
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return (T) ruang[posisi - 1]; 
        } else {
            System.out.println("Error: Posisi di luar jangkauan.");
            return null;
        }
    }
}