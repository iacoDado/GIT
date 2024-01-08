import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Scrivi la lunghezza della lista: ");
        int l=in.nextInt();

        int [] a = new int[l];

        for (int i = 0; i<a.length; i++){
            System.out.print("Inserisci il numero all'indice "+i+": ");
            a[i]=in.nextInt();
        }

        System.out.println("Prima: \n"+Arrays.toString(a));

        for (int i = 0; i<a.length; i++) {
            if (i==(a.length-1)){
                a[i]=0;
            }else{
                a[i]=a[i+1];
            }
        }

        System.out.println("Dopo: \n"+Arrays.toString(a));
    }
}