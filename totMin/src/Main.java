import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ore;
        int min;
        int sec;
        int secTot;
        Scanner in;

        in=new Scanner(System.in);

        do {
            System.out.print("Scrivi il numero di ore: ");
            ore = in.nextInt();
        } while(ore<0 || ore>=24);

        do {
            System.out.print("Scrivi il numero di minuti: ");
            min = in.nextInt();
        } while(min<0 || min>=60);

        do {
            System.out.print("Scrivi il numero di secondi: ");
            sec = in.nextInt();
        } while(sec<0 || sec>=60);

        secTot=3600*ore+60*min+sec;
        System.out.print("Il numero di secondi totale è "+secTot);
    }
}