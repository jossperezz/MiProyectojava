import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ingrese total de preguntas realisadas");
        int  totalpreguntas =input.nextInt();
        System.out.println("ingrese total de preguntas respondidas correctamente");
        int preguntascorrectas =input.nextInt();
        if (totalpreguntas < preguntascorrectas||totalpreguntas <= 0 ||preguntascorrectas < 0) {
        }else{
            double total =((double) preguntascorrectas / totalpreguntas) * 100;
            if (total >= 90) {
                System.out.println("nivel maximo");
            }else if (total >= 75 && total <90) {
                System.out.println("nivel medio");
            }else if (total >=50 && total <75) {
                System.out.println("nivel regular");
            }else if (total <50) {
                System.out.println("fuera de nivel");
            }
        }
        input.close();
    }
}