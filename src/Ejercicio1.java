import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero1 = input.nextInt();
        System.out.println("ingrese su segundo numero ");
        int numero2 = input.nextInt();
        if (numero1 > numero2) {
            System.out.println("la suma es:" + (int) (numero1 +numero2) );
            System.out.println("la diferencia es:"+ (int)(numero1 - numero2));
        }else{
            System.out.println("el producto es:" + (int)(numero1 * numero2));
            System.out.println("la dsivision es:" + (int)(numero1 / numero2));
        }
        input.close();
    }
    
}