
public class enam {
    public static void main(String args[]) {
        int awal=2;
        int akhir=25;
        int jumlah=0;
        System.out.println("angka yang pertama = "+awal);
        System.out.println("angka yang terakhir ="+akhir);
        System.out.println("jumlah dari deretan di atas = ");

        while(awal<=akhir){
            jumlah=jumlah+awal;
            awal++;
        }
        System.out.println(jumlah);
    }
}