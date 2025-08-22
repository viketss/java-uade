package Test2;
// importar una clase de otro paquete
// import -->
import Test2b.EjImportarModulos;
// import static:
// importar metodos/atributos de una clase --> usarlos sin poner el nombre de la clase delante

public class ImportarModulos {
    // STATIC: pertenece a la clase y no a un objeto --> para no crear variable = new Funcion()
    public static void main(String[] args) {
        // usar las clases
        EjImportarModulos c = new EjImportarModulos(); // c --> no importa el nombre de la variable, solo llama una clase
        c.HelloWorld(); // traer una funcion de esa clase

    }

}
