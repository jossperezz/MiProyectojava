import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero =input.nextInt();
        if (numero >=1 && numero < 9 ) {
            System.out.println("numero de una cifra");
        }else if (numero >= 10 && numero <99) {
            System.out.println("numero de dos cifras");
        }
        input.close();
    }
}
