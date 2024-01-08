public class CoppiaNumeri {
    private int n1, n2;

    public CoppiaNumeri(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void setN1(int a){
        n1=a;
    }

    public void setN2(int a){
        n2=a;
    }

    public int calcMCM(){
        int mcm, absN1, absN2, max, min;

        if (n1<0){
            absN1=-(n1);
        }else{
            absN1=n1;
        }
        if (n2<0){
            absN2=-(n2);
        }else{
            absN2=n2;
        }

        if (absN1>absN2){
            max=absN1;
            min=absN2;
        }else{
            max=absN2;
            min=absN1;
        }

        mcm=max;
        while (mcm%min!=0){
            mcm=mcm+max;
        }

        return mcm;
    }
}