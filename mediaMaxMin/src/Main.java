import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float media,mass,mini,n1,n2,n3,n4,n5;
        Scanner in;

        in=new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        n1=in.nextFloat();

        System.out.print("Inserisci il secondo numero: ");
        n2=in.nextFloat();

        System.out.print("Inserisci il terzo numero: ");
        n3=in.nextFloat();

        System.out.print("Inserisci il quarto numero: ");
        n4=in.nextFloat();

        System.out.print("Inserisci il quinto numero: ");
        n5=in.nextFloat();

        media=media(n1,n2,n3,n4,n5);

        mini=min(n1,n2,n3,n4,n5);

        mass=0;
        if (n1>n2 && n1>n3 && n1>n4 && n1>n5){
            mass=n1;
        }
        if (n2>n1 && n2>n3 && n2>n4 && n2>n5){
            mass=n2;
        }
        if (n3>n1 && n3>n2 && n3>n4 && n3>n5){
            mass=n3;
        }
        if (n4>n1 && n4>n2 && n4>n3 && n4>n5){
            mass=n4;
        }
        if (n5>n2 && n5>n3 && n5>n4 && n5>n1){
            mass=n5;
        }
        System.out.println("Il numero maggiore è "+mass);

        System.out.println("Il numero minore è "+mini);

        System.out.println("La media è "+media);
    }
    public static float media(float n1, float n2, float n3, float n4, float n5) {
        float media;

        media=(n1+n2+n3+n4+n5)/5;

        return media;
    }
    public static float min(float n1, float n2, float n3, float n4, float n5){
        float mini;

        mini=0;
        if (n1<n2 && n1<n3 && n1<n4 && n1<n5){
            mini=n1;
        }
        if (n2<n1 && n2<n3 && n2<n4 && n2<n5){
            mini=n2;
        }
        if (n3<n1 && n3<n2 && n3<n4 && n3<n5){
            mini=n3;
        }
        if (n4<n1 && n4<n2 && n4<n3 && n4<n5){
            mini=n4;
        }
        if (n5<n2 && n5<n3 && n5<n4 && n5<n1){
            mini=n5;
        }
    return mini;
    }
}