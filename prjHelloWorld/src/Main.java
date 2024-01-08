import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b;
        float c;
        double d;
        char m;
        boolean p;

        a=10;
        Scanner numero=new Scanner(System.in);
        System.out.println("Dammi un numero");
        b=numero.nextInt();
        d=5.78;
        m='k';
        p=true;


        if (b!=0){
            d=(double)(a+d)/b+d;
            System.out.println(d);
        }

        if (b==0){
            System.out.println("Divisione per zero, impossibile");
        }

    }
}