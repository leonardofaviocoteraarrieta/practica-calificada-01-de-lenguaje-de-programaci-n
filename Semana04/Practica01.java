/*
 * Programa para hallar las ofertas  de ventas de una tienda de camisa
 * teniendo en cuenta descuento 1 y 2
 */
package Semana04;
import java.util.Scanner;
/**
 *
 * @author Leonardo Favio Cotera Arrieta
 */
public class Practica01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario el precio del producto y la cantidad de unidades adquiridas
        System.out.print("Ingrese el precio del producto: ");
        float precio = teclado.nextFloat();

        System.out.print("Ingrese la cantidad de unidades adquiridas: ");
        int cantidad = teclado.nextInt();

        // Calcular los resultados utilizando métodos
        float importeCompra = calcularImporteCompra(precio, cantidad);
        float descuento1 = calcularDescuento1(importeCompra);
        float descuento2 = calcularDescuento2(importeCompra, descuento1);
        float descuentoTotal = calcularDescuentoTotal(descuento1, descuento2);
        float importePagar = calcularImportePagar(importeCompra, descuentoTotal);

        // Mostrar los resultados
        imprimir(importeCompra, descuento1, descuento2, descuentoTotal, importePagar);
    }

    // Método para calcular el importe de la compra
    public static float calcularImporteCompra(float precio, int cantidad) {
        return precio * cantidad;
    }

    // Método para calcular el importe del primer descuento (7%)
    public static float calcularDescuento1(float importeCompra) {
        return 0.07f * importeCompra;
    }

    // Método para calcular el importe del segundo descuento (7% del restante después del primer descuento)
    public static float calcularDescuento2(float importeCompra, float descuento1) {
        float importeRestante = (descuento1 * 0.07f);
        return importeRestante;
    }

    // Método para calcular el importe del descuento total
    public static float calcularDescuentoTotal(float descuento1, float descuento2) {
        return descuento1 + descuento2;
    }

    // Método para calcular el importe a pagar
    public static float calcularImportePagar(float importeCompra, float descuentoTotal) {
        return importeCompra - descuentoTotal;
    }

    // Método para mostrar los resultados
    public static void imprimir(float importeCompra, float descuento1, float descuento2, float descuentoTotal, float importePagar) {
        System.out.println("\nResumen de la compra:");
        System.out.println("Importe de la compra: $" + importeCompra);
        System.out.println("Importe del primer descuento (7%): $" + descuento1);
        System.out.println("Importe del segundo descuento (7%): $" + descuento2);
        System.out.println("Importe del descuento total: $" + descuentoTotal);
        System.out.println("Importe a pagar: $" + importePagar);
    }
}
