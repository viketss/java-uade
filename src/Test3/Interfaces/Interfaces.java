package Test3.Interfaces;

public class Interfaces {
    // INTERFACES: "contrato" de trabajo
    // SINTAXIS:
    // public interface INombreInterfaz {}
    public interface IEjArregloEnteros {
        //Lista de tareas:
        // DOCUMENTACION:

        // - Pre:
        // - Post:
        // - Axiomas:
        public int ingresarEntero();

        // - Pre: el arreglo tiene que existir + el tamaño del arreglo tiene que ser un num positivo
        // - Post: el arreglo se va a mostrar por pantalla
        // - Axiomas: el formato es con corchetes
        public void mostrarArregloDeEnteros(int[] arreglo, int tam);

        // - Pre:
        // - Post:
        // - Axiomas:
        public void cargarArregloEnterosPorTeclado(int[] arreglo, int tam);

        // @Override --> indica que lo que se esta haciendo SOBREESCRIBE algo que ya estaba hecho
    }
}
