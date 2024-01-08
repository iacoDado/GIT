public class Televisore {
    int risoluzione, pollici;
    String classe;

    public Televisore(int risoluzione, String classe, int pollici) {
        this.risoluzione = risoluzione;
        this.classe = classe;
        this.pollici = pollici;
    }

    public int getRisoluzione() {
        return risoluzione;
    }

    public String getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return "Televisore{" +
                "risoluzione=" + risoluzione +
                ", classe='" + classe + '\'' +
                '}';
    }

    public float calcolaPrezzo(){
        float moltiplicatore;
        switch(classe) {
            case "A":
                moltiplicatore=1;
                break;
            case "A+":
                moltiplicatore=3/2;
                break;
            case "A++":
                moltiplicatore=2;
                break;
            default:
                moltiplicatore=0;
        }
        float prezzo=2*risoluzione*moltiplicatore*pollici;
        return prezzo;
    }
    public boolean checkClass(){
        boolean giusto=false;
        if (classe.equals("A") || classe.equals("A+") || classe.equals("A++")){
            giusto=true;
        }
        return giusto;
    }
}
