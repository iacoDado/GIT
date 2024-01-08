import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sec, min, ore, secAdd;

        ore=0;
        min=0;
        sec=0;

        secAdd= input();

        ore=(secAdd/3600)%24;
        min=(secAdd/60)%60;
        sec=secAdd%60;

        System.out.println("Le ore sono "+ore+", i minuti sono "+min+" e i secondi sono "+sec+".");
    }
    public static int input() {
        int sec;
        Scanner in;

        in=new Scanner(System.in);

        System.out.print("Inserisci un numero di secondi: ");
        sec=in.nextInt();

        while (sec<0){
            System.out.print("Inserisci un numero di secondi positivo: ");
            sec=in.nextInt();
        }

        return sec;

    }
}