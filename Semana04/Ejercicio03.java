package Semana04;
import java.util.Scanner;

public class Ejercicio03 {
    static float tarifaBase;
    static float costoPorKm;

    public static void main(String[] args) {
        float montoAPagar;
        int opcion;
        opcion = opciones();
        montoAPagar = leerNumero();
        imprimir(montoAPagar);
    }
    
    static float leerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilómetros recorridos por día:");
        float kmRecorridos = scanner.nextFloat();
        
        float montoAPagar = tarifaBase + (costoPorKm * kmRecorridos);
        
        if (kmRecorridos > 10) {
            montoAPagar *= 1.025f; // Aumento del 2.5%
        }
        
        return montoAPagar;
    }
    
    static int opciones() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a Renta Car");
        System.out.println("Ingrese la clase de auto que desea rentar:");
        System.out.println("1. Pequeño");
        System.out.println("2. Mediano");
        System.out.println("3. Grande");
        int opcion = teclado.nextInt();
        costos(opcion);
        return opcion;
    }
    
    static void costos(int opcion) {
        if (opcion == 1) {
            tarifaBase = 15.00f;
            costoPorKm = 0.20f;
        } else if (opcion == 2) {
            tarifaBase = 20.00f;
            costoPorKm = 0.30f;
        } else if (opcion == 3) {
            tarifaBase = 30.00f;
            costoPorKm = 0.40f;
        } else {
            System.out.println("Opción no válida. Saliendo del programa.");
        }
    }
    
    static void imprimir(float montoAPagar) {
        System.out.println("El monto a pagar es: S/ " + montoAPagar);
    }
}