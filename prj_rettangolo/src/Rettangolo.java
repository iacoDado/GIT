import java.lang.Math;
public class Rettangolo {
    private float base, altezza;

    public Rettangolo(float base, float altezza) {
        setBase(base);
        setAltezza(altezza);
    }

    public void setBase(float a){
        base=a;
        if (base<0){
            base=1;
        }
    }

    public void setAltezza(float a){
        altezza=a;
        if (altezza<0){
            altezza=1;
        }
    }

    public float getBase(){
        return base;
    }

    public float getAltezza(){
        return altezza;
    }

    public float area(){
        float area;

        area=base*altezza;

        return area;
    }

    public float perimetro(){
        float perimetro;

        perimetro=2*(base+altezza);

        return perimetro;
    }

    public double diagonale(){
        double diagonale;

        diagonale=Math.pow((Math.pow(base, 2)+Math.pow(altezza, 2)),0.5);

        return diagonale;
    }
}
