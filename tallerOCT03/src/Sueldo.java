import java.util.Scanner;

public class Sueldo {
    Scanner sc = new Scanner(System.in);
    double sueldo,nuevo_sueldo;

    public void leerdato() {
        System.out.println("Ingrese sueldo: ");
        sueldo = sc.nextDouble();
    }
    public double calcularSueldo(){
        //sueldo=999;
        leerdato();
        if(sueldo<1000){
            nuevo_sueldo=sueldo+(sueldo*0.15);
            System.out.println(nuevo_sueldo);
        }
        else {
            nuevo_sueldo=sueldo+(sueldo*0.12);
        }
        return(nuevo_sueldo);
    }

}
