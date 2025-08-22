package Test2;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        int nuevoDato = ingresarEntero();
        System.out.println("DATO: " + nuevoDato);

        // 1. cargar arreglo
        int cantidad = 5;
        int[] arreglo = new int[cantidad];
        cargarArregloEnterosPorTeclado(arreglo, cantidad);
        // 2. mostrar arreglo
        mostrarArregloDeEnteros(arreglo, cantidad);
        // 3. calcular promedio --> funcion + return float


    } //cierra el main

    static Scanner ingreso = new Scanner(System.in);

    // FUNCIONES Y PROCEDIMIENTOS
    // Funcion: retorna un valor
    // Procedimiento: no retorna nada
    // + para elegir cual --> primero analizar si necesito que devuelva o no

    //FUNCIONES
    // Sintaxis:
    // static datoDeRetorno nombreDeLaFuncion(parametros) { return dato; }

    // Ejercicio: pedir un entero por teclado
    static int ingresarEntero() { // iniciar funcion
        System.out.println("Por favor ingresar un entero: ");
        int numero = ingreso.nextInt(); //ingreso del numero
        return numero; // return dato
    }
    // STATIC:

    // PROCEDIMIENTOS
    // Sintaxis:
    // void nombreProcedimiento(parametros) {}
    // void = no retorna nada
    // parametros --> (tipoDato nombre)

    // Ej funcion que cargue el array, muestre el array y sume el array
    // 1. cargar array --> procedimiento (no retorna nada)
    public static void cargarArregloEnterosPorTeclado(int[] arreglo, int tam) {
        for (int i = 0; i < tam; i++) {
            // llamado a la funcion
            arreglo[i] = ingresarEntero(); // guardar cada ingreso de teclado

        }
    }

    static void mostrarArregloDeEnteros(int[] arreglo, int tam) {
        System.out.print("ARREGLO: [");
        for (int i = 0; i < tam; i++) {
            System.out.print("-" + arreglo[i]);
        }
        System.out.println("]");
    }

    /*static float calcularPromedio() {
        2.29.05
    }*/
}
