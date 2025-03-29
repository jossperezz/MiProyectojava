import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese cantidad de empleados");
        int n=input.nextInt();
        int numero=0;
        int numero2=0;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese su sueldo");
            int sueldo=input.nextInt();
            if (sueldo>=100 && sueldo<=300) {
                numero++;
            }else if (sueldo>300) {
                numero2++;
            }
        }
        System.out.println("empleados que tiene un sueldo entre 100 y 300 " + numero);
        System.out.println("empleados que tiene un sueldo mayor a 300 " + numero2);
        input.close();
    }
}
