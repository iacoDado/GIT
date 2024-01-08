import java.util.*;
public class Main {
    public static void main(String[] args) {
        int l=10;
        int [] a = new int[l];

        Scanner in=new Scanner(System.in);

        for (int i = 0; i<a.length; i++){
            System.out.print("Inserisci il numero all'indice "+i+": ");
            a[i]=in.nextInt();
        }


        int [] b;
        b=new int[20];


        int [] c={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
    }
}