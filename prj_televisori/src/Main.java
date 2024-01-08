import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int risoluzione1, risoluzione2, pollici1, pollici2;
        String classe1, classe2;
        float prezzo1, prezzo2;

        System.out.print("Inserisci la risoluzione della prima TV: ");
        risoluzione1=in.nextInt();
        while(risoluzione1<0){
            System.out.print("Inserisci la risoluzione della prima TV (maggiore di zero): ");
            risoluzione1=in.nextInt();
        }

        System.out.print("Inserisci la classe della prima TV: ");
        classe1=in.next();

        System.out.print("Inserisci i pollici della prima TV: ");
        pollici1=in.nextInt();
        while(pollici1<0){
            System.out.print("Inserisci i pollici della prima TV (maggiore di zero): ");
            pollici1=in.nextInt();
        }

        Televisore tv1=new Televisore(risoluzione1, classe1, pollici1);

        while (!tv1.checkClass()){
            System.out.println("Classe invalida");
            System.out.print("Inserisci la classe della prima TV: ");
            classe1=in.next();
            tv1=new Televisore(risoluzione1, classe1, pollici1);
        }

        System.out.print("Inserisci la risoluzione della seconda TV: ");
        risoluzione2=in.nextInt();
        while(risoluzione2<0){
            System.out.print("Inserisci la risoluzione della seconda TV (maggiore di zero): ");
            risoluzione2=in.nextInt();
        }

        System.out.print("Inserisci la classe della seconda TV: ");
        classe2=in.next();

        System.out.print("Inserisci i pollici della seconda TV: ");
        pollici2=in.nextInt();
        while(pollici2<0){
            System.out.print("Inserisci i pollici della seconda TV (maggiore di zero): ");
            pollici2=in.nextInt();
        }

        Televisore tv2=new Televisore(risoluzione2, classe2, pollici2);

        while (!tv2.checkClass()){
            System.out.println("Classe invalida");
            System.out.print("Inserisci la classe della seconda TV: ");
            classe2=in.next();
            tv2=new Televisore(risoluzione2, classe2, pollici2);
        }

        prezzo1=tv1.calcolaPrezzo();
        prezzo2=tv2.calcolaPrezzo();

        System.out.println("Il prezzo della prima TV è: "+prezzo1);
        System.out.println("Il prezzo della seconda TV è: "+prezzo2);
    }
}