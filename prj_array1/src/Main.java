import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Inserisci la lunghezza della lista: ");
        int l=in.nextInt();

        int [] a =new int[l];
        int somma=0;

        for (int i = 0; i<a.length; i++){
            System.out.print("Inserisci il numero all'indice "+i+": ");
            a[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(a));

        for (int i = 0; i<a.length; i++){
            somma+=a[i];
        }

        float media=somma/10;

        System.out.println("Media: "+media);
    }
}