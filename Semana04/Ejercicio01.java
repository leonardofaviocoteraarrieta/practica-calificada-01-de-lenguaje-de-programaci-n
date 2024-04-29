package Semana04;
import java.util.Scanner;

public class Ejercicio01 {
    static float num1, num2, num3; // Variables de clase para almacenar los números y hacerlas accesibles en todos los métodos
    static float mayor, menor, intermedio; // Variables de clase para almacenar el resultado

    public static void main(String[] args) {
        LeerNumero();
        hallarmayormediomenor(num1, num2, num3);
        imprimir();
    }
    
    static void LeerNumero(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        num1 = teclado.nextFloat();

        System.out.println("Ingrese el segundo número:");
        num2 = teclado.nextFloat();

        System.out.println("Ingrese el tercer número:");
        num3 = teclado.nextFloat();
    }
    
    static void hallarmayormediomenor(float num1, float num2, float num3){
        // Determinar el mayor
        mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        // Determinar el menor
        menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Determinar el intermedio
        intermedio = num1 + num2 + num3 - mayor - menor;
    }
    
    static void imprimir(){
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El número intermedio es: " + intermedio);
    }
}
