public class PruebaBicicleta {
    public static void main(String[] args) {
        Bicicleta bmx = new Bicicleta();
        bmx.color = "Rojo";
        bmx.modelo = "Santa Cruz";
        bmx.peso = 16;
        bmx.tipo = "DownHill";
        /*System.out.println("bici.color = " + bmx.color);
        System.out.println("bici.modelo = " + bmx.modelo);
        System.out.println("bici.tipo = " + bmx.tipo);
        System.out.println("bici.peso = " + bmx.peso);*/
        System.out.println(bmx.detallebici());


        Bicicleta montaña = new Bicicleta();
        montaña.color = "Negro";
        montaña.modelo = "Cube";
        montaña.tipo = "Cross Country";
        montaña.peso = 14;
        //montaña.detallebici();
        System.out.println(montaña.detallebici());

    }
}
