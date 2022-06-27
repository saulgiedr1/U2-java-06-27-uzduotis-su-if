import java.util.Scanner;

public class ProgramaSuScanner {

    public static void main(String[] args) {

        int x ;
        int y ;

        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite x: ");
        x = skaitytuvas.nextInt();
        System.out.println("x = " + x);

        System.out.println("Įveskite y: ");
        y = skaitytuvas.nextInt();
        System.out.println("x = " + y);

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
