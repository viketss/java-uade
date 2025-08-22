package Test2;

import Test3.Interfaces.Interfaces;

import java.util.Scanner;
// implements: clase que implementa otra clase --> cumplir interfaz
public class EjArregloEnteros implements Interfaces.IEjArregloEnteros {
    // clase que implementa el contrato de la interfaz

    public static void main(String[] args) {
        /*
        int nuevoDato = ingresarEntero();
        System.out.println("DATO: " + nuevoDato);

        // 1. cargar arreglo
        int cantidad = 5;
        int[] arreglo = new int[cantidad];
        cargarArregloEnterosPorTeclado(arreglo, cantidad);
        // 2. mostrar arreglo
        mostrarArregloDeEnteros(arreglo, cantidad);
        // 3. calcular promedio --> funcion + return float
        */

    }

    static Scanner ingreso = new Scanner(System.in);

    //FUNCIONES
    // Sintaxis:
    // static datoDeRetorno nombreDeLaFuncion(parametros) { return dato; }

    // Ejercicio: pedir un entero por teclado
    public int ingresarEntero() { // iniciar funcion
        System.out.println("Por favor ingresar un entero: ");
        int numero = ingreso.nextInt(); //ingreso del numero
        return numero; // return dato
    }

    // PROCEDIMIENTOS
    // Sintaxis:
    // void nombreProcedimiento(parametros) {}
    // void = no retorna nada
    // parametros --> (tipoDato nombre)

    // Ej funcion que cargue el array, muestre el array y sume el array
    // 1. cargar array --> procedimiento (no retorna nada)
    public void cargarArregloEnterosPorTeclado(int[] arreglo, int tam) {
        for (int i = 0; i < tam; i++) {
            // llamado a la funcion
            arreglo[i] = ingresarEntero(); // guardar cada ingreso de teclado en la posicion actual del recorrido por el arreglo

        }
    }

    public void mostrarArregloDeEnteros(int[] arreglo, int tam) {
        System.out.print("ARREGLO: [");
        for (int i = 0; i < tam; i++) {
            System.out.print("-" + arreglo[i]);
        }
        System.out.println("]");
    }

}
