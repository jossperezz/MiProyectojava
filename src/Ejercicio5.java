import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double num1 = scanner.nextDouble();
        System.err.println("Ingrese segundo numero");
        double num2 = scanner.nextDouble();
        if (num1>num2) {
            System.out.println("El numero mayor es " + num1);
        } else {
            System.out.println("El numero mayor es " + num2);
        }
        scanner.close();
    }
    
}
