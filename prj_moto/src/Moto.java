public class Moto {
    String marca, modello;
    float capSerbatoio, benzSerbatoio, kmFatti;
    boolean motoAccesa;
    float kmLitro;

    public Moto(String marca, String modello, int capSerbatoio, int benzSerbatoio, int kmFatti, boolean motoAccesa) {
        this.marca = marca;
        this.modello = modello;
        this.capSerbatoio = capSerbatoio;
        this.benzSerbatoio = benzSerbatoio;
        this.kmFatti = kmFatti;
        this.motoAccesa = motoAccesa;
    }

    public float statoSerbatoio(){
        float stato;
        stato=((float)benzSerbatoio/(float)capSerbatoio)*100;
        return stato;
    }

    public float kmRimanenti(){
        float km;
        km=kmLitro*benzSerbatoio;
        return km;
    }

    public void accendiSpegni(){
        if (motoAccesa){
            motoAccesa=false;
        }else{
            motoAccesa=true;
        }
    }
}
