public class Main {
    public static void main(String[] args) {
        Telefono cell1=new Telefono(2022, 4, "Samsung", 500);

        System.out.println(cell1.toString());

        System.out.println("\n\nAnno: "+cell1.getAnno());
        System.out.println("GB: "+cell1.getGb());
        System.out.println("Marca: "+cell1.getMarca());

        cell1.setCoefficienteGB(0.09f);

        System.out.println("\n\n"+cell1.calcolaPrezzo(2023));
    }
}