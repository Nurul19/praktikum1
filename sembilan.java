public class sembilan {
    public static void main(String args[]) {

        int awal=3;
        int akhir=150;
        int b;

        for (awal=1;awal<=akhir;awal++){
            if(awal%5==0) {
                System.out.print("joni");
            } else {
                System.out.print(awal);
            }
            if (awal < akhir) {
                System.out.print(" ");
                if(awal%11==0)
                    System.out.print("\n");
            }
            }
        }

    }

