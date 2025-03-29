import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ingresa la primera nota");
        float nota1 = input.nextInt();
        System.out.println("ingrese segunda nota");
        float nota2 = input.nextInt();
        System.out.println("ingrese tercera nota ");
        float nota3 = input.nextInt();
        float promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 7) {
            System.out.println("promocionado");
        }else if (promedio>=4 && promedio<7) {
            System.out.println("regular");
        }else if (promedio<4) {
            System.out.println("reprobado");
        }
        input.close();
    }
}
