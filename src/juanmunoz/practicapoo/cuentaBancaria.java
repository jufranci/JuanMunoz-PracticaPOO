package juanmunoz.practicapoo;
import java.util.Scanner;
public class cuentaBancaria {

    String nombreTitular = "", tipoDeCuenta = "";
    float saldo = 0;
    Scanner leer = new Scanner(System.in);

    public cuentaBancaria() {
        this.nombreTitular = "";
        this.tipoDeCuenta = "";
        this.saldo = 0;
    }
    public cuentaBancaria(String nombreTitular){
        this();
        this.nombreTitular = nombreTitular;
    }
    public cuentaBancaria (String nombreTitular, String tipoDeCuenta){
        this(nombreTitular);
        this.tipoDeCuenta = tipoDeCuenta;
    }
    public cuentaBancaria (String nombreTitular, String tipoDeCuenta, float saldo){
        this(nombreTitular, tipoDeCuenta);
        this.saldo = saldo;
    }
    public void extraer(){
        System.out.println("Su saldo es de: $" + saldo +"\n¿Cuanto desea retirar?");
        float extraer = leer.nextFloat();
        if (extraer > saldo){
            System.out.println("No posee suficiente saldo para realizar esta operacion");
        }else{
            saldo = saldo-extraer;
            System.out.println("Saldo restante: $" + saldo);
        }
    }
    
}
