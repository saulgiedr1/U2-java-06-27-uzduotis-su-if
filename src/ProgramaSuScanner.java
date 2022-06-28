import java.util.Scanner;

public class ProgramaSuScanner {

    public static void main(String[] args) {

        int x ;
        int y ;

        System.out.println((int)'A');

        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite x: ");
        x = skaitytuvas.nextInt();
        System.out.println("x = " + x);

        System.out.println("Įveskite y: ");
        y = skaitytuvas.nextInt();
        System.out.println("x = " + y);

        int gautasRezultatas = rezultatas(x, y);

        System.out.println("Rezultatas = " + gautasRezultatas);

        System.out.println("--------------Mano variantai:----------------");
        System.out.println("nestedIfPavyzdys(x, y) = " + nestedIfPavyzdys(x, y));
        System.out.println("elseIfPavyzdys(x, y) = " + elseIfPavyzdys(x, y));


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


    public static int nestedIfPavyzdys(int a, int b) {
        if (a % 2 == 0) {
            return a * b;
        }
        else {
            if (b > 100) {
                return b - a;
            }
            else {
                if (b < 100) {
                    return a - b;
                }
                else {
                    return 0;
                }
            }
        }
    }


    public static int elseIfPavyzdys(int a, int b) {
        if (a % 2 == 0) {
            return a * b;
        }
        else if (b > 100) {
            return b - a;
        }
        else if (b < 100) {
            return a - b;
        }
        else {
            return 0;
        }
    }
}
