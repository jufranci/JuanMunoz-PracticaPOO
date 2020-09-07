package juanmunoz.practicapoo;
public class auto {

    String marca = "", modelo = "";
    int kilometraje = 0;

    public auto() {
        this.marca = "";
        this.modelo = "";
        this.kilometraje = 0;
    }

    public auto(String marca) {
        this();
        this.marca = marca;
    }

    public auto(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

    public auto(String marca, String modelo, int kilometraje) {
        this(marca, modelo);
        this.kilometraje = kilometraje;
    }

    public void estadoAuto(){
        if (kilometraje > 100000){
            System.out.println("Bastante usado");
        } else if(kilometraje < 100000 && kilometraje > 10000){
            System.out.println("Usado");
        } else if (kilometraje < 10000 && kilometraje > 0){
            System.out.println("Poco usado");
        } else System.out.println("Nuevo");
    }
    public void imprimir(){
        if(!marca.equals("") && !modelo.equals("")){
            System.out.println("Marca: " + marca + " Modelo: " + modelo);
        }
    }
}