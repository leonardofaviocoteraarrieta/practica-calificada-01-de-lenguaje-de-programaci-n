package Semana04;
import java.util.Scanner;

public class Ejercicio04 {
    static float salarioNormal, salarioExtras, salarioTotal; // Variables de clase para almacenar los salarios

    public static void main(String[] args) {
        float horasTrabajadas = leerNumero();
        calcularSalarios(horasTrabajadas); // Llama al método para calcular los salarios
        imprimir(); // Llama al método para imprimir los salarios
    }
    
    static float leerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas:");
        return scanner.nextFloat(); // Devuelve las horas trabajadas leídas
    }
    
    static void calcularSalarios(float horasTrabajadas) {
        float salarioPorHora = 10.00f; // Supongamos que el salario por hora es S/10.00

        salarioNormal = horasTrabajadas <= 40 ? horasTrabajadas * salarioPorHora : 40 * salarioPorHora;

        int horasExtras = (int) horasTrabajadas - 40; // Convertir horas trabajadas a entero para calcular las horas extras
        salarioExtras = 0; // Inicializar salarioExtras
        
        if (horasExtras > 0) {
            if (horasExtras <= 8) {
                salarioExtras = horasExtras * salarioPorHora * 2; // Horas extras al doble
            } else {
                salarioExtras = 8 * salarioPorHora * 2 + (horasExtras - 8) * salarioPorHora * 3; // Primeras 8 horas al doble, el resto al triple
            }
        }

        salarioTotal = salarioNormal + salarioExtras; // Calcular el salario total
    }
    
    static void imprimir() {
        System.out.println("El salario normal es: S/ " + salarioNormal);
        System.out.println("El salario por horas extras es: S/ " + salarioExtras);
        System.out.println("El salario total es: S/ " + salarioTotal);
    }
}
