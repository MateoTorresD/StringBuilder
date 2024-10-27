public class Automovil {
    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje;

    /*public void detalleauto(){
        double cilindraje = 8.10 ;
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Cilindraje: " + this.cilindraje);

    }*/
    public String detalleauto() {
        StringBuilder sb = new StringBuilder();
        sb.append("La marca del auto es: "+ this.marca + " ");
        sb.append("auto.modelo = " + this.modelo + " ");
        sb.append("auto.color = " + this.color + " ");
        sb.append("auto.cilindraje = " + this.cilindraje + " ");
        return sb.toString();
    }
}
