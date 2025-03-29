import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numero=0;
        for (int i = 1; i <= 100; i++) {
            numero++;
            System.out.println(numero);
        }
        input.close();
    }
}
