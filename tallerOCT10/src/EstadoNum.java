import java.util.Scanner;

public class EstadoNum {
    Scanner sc = new Scanner(System.in);

    public int leerNum() {
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        return (num);
    }

    public void validarSigno(){
        int x= leerNum();
        if ((x==0) || (x>0)) {
            if (x==0){
                System.out.println("El numero es nulo");
            }
            else{
                System.out.println("El numero es positivo");
            }
        }
        else{
            System.out.println("El numero es negativo");
        }
    }
}
