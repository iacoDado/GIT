import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, mcm;
        Scanner in;

        in=new Scanner(System.in);

        System.out.print("Scrivi il primo numero: ");
        a=in.nextInt();

        System.out.print("Scrivi il primo numero: ");
        b=in.nextInt();

        CoppiaNumeri coppia1 = new CoppiaNumeri(a, b);

        coppia1.setN1(a);
        coppia1.setN2(b);

        mcm=coppia1.calcMCM();

        System.out.println("Il massimo comun moltiplicatore è: "+mcm);
    }
}