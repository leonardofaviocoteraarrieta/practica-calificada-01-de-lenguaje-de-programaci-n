package Semana04;
import java.util.Scanner;

public class CEjemplo01 {
    public static void main(String[] args) {
        float num;
        num = LeerNumero();
        valorAbsoluto(num);
    }
    
    static float LeerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    
    static void valorAbsoluto(float num){
        if (num < 0) {
            num = num * -1;
        }
        System.out.println("El valor absoluto es : " + num);
    }
}
