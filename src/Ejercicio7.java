import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = input.nextInt();
        if (numero <= 9 ) {
            System.out.println("el numero tiene una sifra");
        } else if (numero > 9 && numero <= 99) {
            System.out.println("el numero tiene dos sifras");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("el numero tiene tres cifras");
        }else if (numero >1000 ) {
            System.out.println("numero no valido");
        }
        input.close();
    }
}