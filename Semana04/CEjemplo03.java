package Semana04;
import java.util.Scanner;

public class CEjemplo03 {
    public static void main(String[] args) {
        float num1, num2, num3, mayor;
        num1 = leerNumero();
        num2 = leerNumero();
        num3 = leerNumero();
        mayor = hallarMayor(num1, num2, num3);
        imprimir(mayor);
    }
    
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num1;
        System.out.print("Ingrese el primer numero: ");
        num1 = Float.parseFloat(teclado.next());
        return num1;
    }
    
    static float hallarMayor(float num1, float num2, float num3){
        float mayor;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else {
            if (num2 > num1 && num2 > num3) {
                mayor = num2;
            }else{
                mayor = num3;
            }
        }
        return mayor;
    }
    
    static void imprimir(float mayor){
        System.out.println("El numero mas grande es: " + mayor);
    }
}
