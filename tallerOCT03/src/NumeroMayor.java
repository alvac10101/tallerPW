import java.util.Scanner;

public class NumeroMayor {
    Scanner sc = new Scanner(System.in);
    public int leerNum() {
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        return (num);
    }
    public void calcularMayor() {
        int n1,n2,n3,mayor;
        n1=leerNum();
        n2=leerNum();
        n3=leerNum();
        if((n1>n2)&&(n1>n3)){
            mayor=n1;
        }
        else {
            if((n2>n1)&&(n2>n3)){
                mayor=n2;
            }
            else{
                mayor=n3;
            }

        }
        System.out.println(mayor);
    }


}
