package crearBanco;

import cuentaBancaria.cuentaBancaria;
import java.util.Scanner;

public class crearBanco {
    
    private Scanner leer=new Scanner(System.in);
    
    public cuentaBancaria Cuenta(){
        System.out.println("ingrese su numero de cuenta");
        int numeroCuenta=leer.nextInt();
        System.out.println("ingrese su DNI");
        int DNI=leer.nextInt();
        System.out.println("ingrese la operacion a realizar:");
        System.out.println("1-Ingreso de dinero");
        System.out.println("2-Retiro de dinero");
        System.out.println("3-Extraccion rapida");
        System.out.println("4-Consultar saldo");
        System.out.println("5-Consultar datos");
        int operacion=leer.nextInt();
        
        switch (operacion){
            case 1: 
            System.out.println(ingreso());
        break;
            case 2: System.out.println(Retirar());
        break;
            case 3: System.out.println(extraccionRapida());
        break;
            case 4: System.out.println(consultarSaldo());
        break;
            case 5: System.out.println("su numero de cuenta es "+numeroCuenta);
                System.out.println("su DNI es "+DNI);          
        break;    
            default: System.out.println("opcion invalida");
        }  
        return new cuentaBancaria();
}
    public cuentaBancaria ingreso(){
        int saldoActual=150000;
        System.out.println("cuanto dinero desea ingresar");
        int ingreso=leer.nextInt();
        System.out.println("su saldo es de "+(saldoActual+ingreso));
        return new cuentaBancaria(ingreso,saldoActual);
    }
   
    public cuentaBancaria Retirar(){
    double saldoActual=150000;
        System.out.println("ingrese el monto que desea retirar");
        double retiro=leer.nextInt();
        if (retiro<saldoActual){
            System.out.println("en su cuenta le quedan  "+ (saldoActual-retiro)+" pesos");
        }
        else{System.out.println("su saldo actual es de 0 ");}
    return new cuentaBancaria(retiro, saldoActual);
    }
    public cuentaBancaria extraccionRapida(){
            double saldoActual=150000;
            System.out.println("ingrese el porcentaje que desea sacar de su saldo actual ");
            int porcentaje=leer.nextInt();
            if(porcentaje<=20){
                System.out.println("usted sacara "+porcentaje+"% de su sueldo, eso es igual a "+saldoActual*porcentaje/100);}
            else{System.out.println("no es posible extraer ese porcentaje");}
            return new cuentaBancaria(porcentaje,saldoActual);

    }
    public cuentaBancaria consultarSaldo(){
           double saldoActual=150000;
           System.out.println("su saldo actual es de "+saldoActual);
           return new cuentaBancaria();
    }
}
