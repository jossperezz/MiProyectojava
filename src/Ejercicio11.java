import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        for (int i=1; i<=10; i++){
            System.out.println("ingrese la nota del alumno " + i + ": ");
        int nota=input.nextInt();
        if (nota>=7) {
            numero1++;
        }else if (nota<7) {
            numero2++;
        }
        }
        System.out.println("el numero de estudiantes con notas superiore es: " + numero1);
        System.out.println("el numero de estudiantes con notas superiore es: " + numero2);
        input.close();
    }
}