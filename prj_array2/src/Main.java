import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.print("Inserisci la lunghezza della lista: ");
        int l=in.nextInt();

        int [] a = new int[l];
        int minimo;

        for (int i = 0; i<a.length; i++){
            System.out.print("Inserisci il numero all'indice "+i+": ");
            a[i]=in.nextInt();
        }

        minimo=a[1];
        for (int i = 0; i<a.length; i++) {
            if (minimo>a[i]){
                minimo=a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Minimo: "+minimo);
    }
}