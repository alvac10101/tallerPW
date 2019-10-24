import java.util.Scanner;

public class condicion {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Sueldo sueldo = new Sueldo();
        Nota nota = new Nota();
        NumeroMayor mayor = new NumeroMayor();
        System.out.println("Hello World");
        sueldo.calcularSueldo();
        nota.calcularNota();
        nota.EstadoA_D();
        mayor.calcularMayor();



    }
}
