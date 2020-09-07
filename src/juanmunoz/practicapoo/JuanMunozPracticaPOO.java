package juanmunoz.practicapoo;
public class JuanMunozPracticaPOO {
    public static void main(String[] args) {
        //1- perro
        perro p1;
        p1 = new perro ("Firulais", "Fran");
        p1.ladrar();
        p1.imprimir();
        
        //2- auto
        auto a1;
        a1 = new auto ("Audi", "A8", 100001);
        a1.estadoAuto();
        a1.imprimir();
        
                
    }    
}
