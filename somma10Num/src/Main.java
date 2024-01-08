import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int somma;
       int n;
       int contatore;
       Scanner in;

       in=new Scanner(System.in);

       contatore=0;
       somma=0;

       while(contatore<10){

           System.out.print("Scrivi il "+(contatore+1)+"° numero: ");
           n=in.nextInt();

           somma+=n;

           contatore+=1;
       }

        System.out.print("La somma è "+somma);
    }
}