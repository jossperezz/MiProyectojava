import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese su sueldo");
        int sueldo=input.nextInt();
        System.out.println("ingrse su antiguedad");
        int antiguedad=input.nextInt();

        double mas=((double)sueldo * 0.20);
        double total=((double)mas+sueldo);

        double mas1=((double)sueldo * 0.05);
        double total1=((double)mas1+sueldo);
        
        if (sueldo<=500 && antiguedad>=10) {
            System.out.println("aumento del sueldo, " + mas + " sueldo total a pagar es: " + total);
        }else if (sueldo<500 &&antiguedad<10) {
            System.out.println("aumento de sueldo, " + mas1 + " sueldo total a pagar es: "+ total1);
        }
        input.close();
    }
}
