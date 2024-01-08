import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float b, h, a, p;
        double d;
        Scanner in;

        in=new Scanner(System.in);

        System.out.print("Scrivi la base: ");
        b=in.nextFloat();

        System.out.print("Scrivi l'altezza: ");
        h=in.nextFloat();

        Rettangolo r1=new Rettangolo(b, h);

        a=r1.area();
        p=r1.perimetro();
        d=r1.diagonale();

        System.out.println("L'area è: "+a);
        System.out.println("Il perimetro è: "+p);
        System.out.println("La diagonale è: "+d);
    }
}