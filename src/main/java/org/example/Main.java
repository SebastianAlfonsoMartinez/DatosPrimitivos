package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir y leer los datos de entrada
        String nombreProducto = obtenerEntradaString(scanner, "Ingrese el nombre del producto: ");
        int cantidadProducto = obtenerEntradaInt(scanner, "Ingrese la cantidad de productos: ");
        long precioProducto = obtenerEntradaLong(scanner, "Ingrese el precio del producto: ");
        boolean compraHoy = obtenerEntradaBoolean(scanner, "El producto se compra hoy (true/false): ");
        byte dia = obtenerEntradaByte(scanner, "En qué día se realiza la compra: ");
        byte mes = obtenerEntradaByte(scanner, "En qué mes se realiza la compra: ");
        short anio = obtenerEntradaShort(scanner, "En qué año se realiza la compra: ");

        // Mostrar los datos ingresados
        System.out.println("El nombre del producto es: " + nombreProducto);
        System.out.println("La cantidad de productos comprados son: " + cantidadProducto);
        System.out.println("Precio total de los productos: " + (precioProducto * cantidadProducto));
        System.out.println("El producto se compra hoy: " + compraHoy);
        System.out.println("Fecha de compra del producto: " + dia + "/" + mes + "/" + anio);

        scanner.close();
    }

    // Métodos para obtener entradas de diferentes tipos
    private static String obtenerEntradaString(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    private static int obtenerEntradaInt(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    private static long obtenerEntradaLong(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLong();
    }

    private static boolean obtenerEntradaBoolean(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextBoolean();
    }

    private static byte obtenerEntradaByte(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextByte();
    }

    private static short obtenerEntradaShort(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextShort();
    }
}
