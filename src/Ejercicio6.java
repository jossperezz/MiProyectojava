import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ingresa un numero entero");
        int numero=input.nextInt();
        if (numero>0) {
            System.out.println("el numero es positivo");
        }else if (numero<0) {
            System.out.println("el numero es negativo");
        }else{
            System.out.println("el numero es nulo");
        }
        input.close();
    }
}