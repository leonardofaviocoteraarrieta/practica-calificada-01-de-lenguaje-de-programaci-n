package Semana04;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        float soles;
        int opcion;
        soles = leerNumero();
        opcion = opciones();
        resultados(opcion, soles);
    }
    
    static float leerNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a Cambio Rápido");
        System.out.println("Ingrese la cantidad en soles que desea cambiar:");
        float soles = Float.parseFloat(teclado.next());
        return soles;
    }
    
    static int opciones() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione a qué moneda desea cambiar:");
        System.out.println("1. Dólares");
        System.out.println("2. Euros");
        System.out.println("3. Marcos");
        System.out.println("4. Yenes");
        int opcion = teclado.nextInt();
        return opcion;
    }
    
    static void resultados(int opcion, float soles) {
        float resultado = 0;
        String moneda = "";

        if (opcion == 1) {
            resultado = soles * 3.30f;
            moneda = "dólares";
        } else if (opcion == 2) {
            resultado = soles * 3.57f;
            moneda = "euros";
        } else if (opcion == 3) {
            resultado = soles * 1.83f;
            moneda = "marcos";
        } else if (opcion == 4) {
            resultado = soles * 0.03f;
            moneda = "yenes";
        } else {
            System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            return; // Salir del método si la opción no es válida
        }
        
        imprimir(resultado, moneda);
    }
    
    static void imprimir(float resultado, String moneda) {
        System.out.println("Usted recibirá " + resultado + " " + moneda + ".");
    }
}