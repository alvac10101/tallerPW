import java.util.Scanner;

public class ValidarDia {
    Scanner sc = new Scanner(System.in);
    public int leerNum() {
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        return (num);
    }
    public void queDiaEs(){
        int day= leerNum();
        switch (day){
            case 1:{
                System.out.println("Lunes");
            }
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
}
