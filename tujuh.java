
public class tujuh {
    public static void main(String args[]){
        double awal = 1;
        double akhir = 10;
        double jumlah = 0;
        double rata;
        System.out.println("angka yang pertama" + awal);
        System.out.println("angka yang terakhir" + akhir);
        System.out.println("jumlah dari deretan di atas= ");

        while (awal <= akhir) {
            jumlah = jumlah + awal;
            awal++;
        }
        System.out.println(jumlah);
        rata = jumlah / akhir;
        System.out.println("rata-rata dari deretan di atas= " + rata);
    }
}