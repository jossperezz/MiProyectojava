import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primera nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingrese segunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingrese tercera nota");
        double nota3 = scanner.nextDouble();
        double promedio = (nota1+nota2+nota3)/3;
        System.out.println("El promedio total del alumno es de " + promedio);
        if (promedio>=7) {
            System.out.println("promocionado");
        } else {
            System.out.println("No promocionado");
        }
        scanner.close();
    }
}
