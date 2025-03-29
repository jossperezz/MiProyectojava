import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese el primer nombre");
        String nombre1=input.nextLine();
        System.out.println("ingrese el segundo nombre");
        String nombre2=input.nextLine();
        if (nombre1.compareToIgnoreCase(nombre2)<0) {
            System.out.println("nombres ordenados alfabeticamente");
            System.out.println(nombre1);
            System.out.println(nombre2);
        }else{
            System.out.println("nombres ordenados alfabeticamente");
            System.out.println(nombre2);
            System.out.println(nombre1);
        }
        input.close();
    }
}