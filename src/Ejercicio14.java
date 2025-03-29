import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 5; i <= 50; i++) {
            System.out.println("tabla de multiplicar del " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                int resultado=i * j;
                System.out.println(i + " x " + j +"= " + resultado);
            }
        }
        input.close();
    }
}
