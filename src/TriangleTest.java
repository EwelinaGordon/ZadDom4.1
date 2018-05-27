import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj A: ");
        int a = scan.nextInt();

        System.out.println("Podaj B: ");
        int b = scan.nextInt();

        System.out.println("Podaj C: ");
        int c = scan.nextInt();

        Max max = new Max();
        Triangle trg = max.findMax(a, b, c);


        System.out.println("A: " + trg.max);
        System.out.println("B: " + trg.bokB);
        System.out.println("C: " + trg.bokC);


        RightTriangle rth = new RightTriangle();
        System.out.println(rth.isRightTriangle(trg));


    }
}
