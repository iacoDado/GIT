public class Telefono {
    private int anno, gb;
    private String marca;
    private float coefficienteGB, prezzoStorico;

    public Telefono(int anno, int gb, String marca, float prezzoStorico) {
        this.anno = anno;
        this.gb = gb;
        this.marca = marca;
        this.prezzoStorico = prezzoStorico;
        this.coefficienteGB=0.05f;
    }

    @Override
    public String toString() {
        return "Telefono" + '\n' +
                "anno: " + anno + '\n' +
                "gb: " + gb + '\n' +
                "marca: " + marca + '\n' +
                "prezzoStorico: " + prezzoStorico+ '\n' +
                "prezzo: "+ calcolaPrezzo(2023);
    }

    public int getAnno() {
        return anno;
    }

    public int getGb() {
        return gb;
    }

    public String getMarca() {
        return marca;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCoefficienteGB() {
        return coefficienteGB;
    }

    public void setCoefficienteGB(float coefficienteGB) {
        this.coefficienteGB = coefficienteGB;
    }

    public float calcolaCoefficiente(){
        float coefficiente=0;
        switch (marca){
            case "Samsung":
            case "samsung":
                coefficiente=0.7f;
                break;
            case "Huawei":
            case "huawei":
                coefficiente=0.5f;
                break;
            case "Apple":
            case "apple":
                coefficiente=1;
                break;
            case "Oppo":
            case "oppo":
                coefficiente=0.3f;
                break;
            default:
                System.out.println("Non accettiamo altre marche");
        }

        if (2023-anno>5){
            coefficiente=coefficiente/(2*(float)((2023-anno)/5));
        }

        return coefficiente;
    }

    public float calcolaPrezzo(int annoAttuale){
        float prezzo=prezzoStorico*gb*coefficienteGB*(calcolaCoefficiente()/(annoAttuale-anno));
        return prezzo;
    }
}