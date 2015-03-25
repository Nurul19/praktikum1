public class duabelas {
    public static void main(String args[]) {

        int x;
        int y;
        int panjang=10;
        int lebar=5;
        for(x=1;x<=lebar;x++) {
            if (x % 2 == 0) {
                System.out.print(" ");
            }
            for(y = 1; y<=panjang; y++) {
                System.out.print("#");
            }
            System.out.println("\n");
        }
    }
}