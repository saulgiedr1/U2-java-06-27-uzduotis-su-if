public class Programa {

    public static void main(String[] args) {

        int x = 200;
        int y = 105;

        int gautasRezultatas = rezultatas(x, y);

        System.out.println("Rezultatas = " + gautasRezultatas);

    }

    public static int rezultatas(int a, int b) {
        if ((a % 2 != 0) && (b > 100)) {
            return b - a;
        }
        if ((a % 2 !=0 ) && (b < 100)) {
            return a - b;
        }
        if (b == 100) {
            return 0;
        }
        else  {
            return a * b;


        }
    }
}





