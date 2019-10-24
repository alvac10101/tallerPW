import java.util.Scanner;

public class ConsultaEdad {
    Scanner sc = new Scanner(System.in);

    public int leerEdad() {
        System.out.println("edad:  ");
        int num = sc.nextInt();
        return (num);
    }
    public void validarEdad(){
        int edad = leerEdad();
        if (edad > 0) {
            if (edad > 17) {
                System.out.println("Es mayor de edad");
            } else
                System.out.println("Aun es joven, pida permiso a sus padres:p");
        }
        else
        {
            System.out.println("No es una edad valida!");
        }
    }
    public void superEdad(){
        int edad2=leerEdad();
        if(edad2<=0){
            System.out.println("Error!!");
        }
        else if (edad2 <= 17){
            System.out.println("Joven");
        }
        else if (edad2 < 100){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Inmortal");
        }
    }
}
