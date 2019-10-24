import java.util.Scanner;

public class Nota {
    //atributos
    int x, cal;
    Scanner sc = new Scanner(System.in);

    public int leerNota() {
        System.out.println("Ingrese su nota: ");
        int nota = sc.nextInt();
        return (nota);
    }

    public void calcularNota(){
        x = leerNota();
        if (x<20){
            System.out.println("correcto");
        }
        else{
            if (x==10){
                System.out.println("perfecto");
            }

        }

    }

    public void EstadoA_D() {
        cal = leerNota();
        if (cal>=8){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Desaprovado");
        }
    }

}
