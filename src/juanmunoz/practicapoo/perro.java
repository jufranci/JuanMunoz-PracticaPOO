package juanmunoz.practicapoo;
public class perro {
    String nombre = "", dueño = "";
    boolean buenChico = true;
    public perro(){
        this.nombre = "";
        this.dueño = "";
        this.buenChico = true;
    }
    public perro (String nombre){
        this();
        this.nombre = nombre;
    }
    public perro (String nombre, String dueño){
        this(nombre);
        this.dueño = dueño;
    }    
    public void ladrar(){
        System.out.println("¡Guau!");
    }
    public void imprimir(){
        if(!nombre.equals("") && !dueño.equals("")){
            System.out.println("Nombre: " + nombre + " Dueño: " + dueño);
        }        
        if (buenChico && !nombre.equals("") && !dueño.equals("")) System.out.println("Es un buen chico :)");
    }
}
