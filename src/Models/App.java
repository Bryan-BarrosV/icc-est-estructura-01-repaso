package Models;

import Controllers.PersonaController;
import Models.Persona;
import Views.ViewsConsole;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglo de personas instanciado
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
        };

        // Instanciando las clases necesarias
        PersonaController pC = new PersonaController();
        ViewsConsole vC = new ViewsConsole();

        // Imprimir arreglo original
        vC.printMessage("Personas", true);
        vC.printPersonaArray(personas);

        // Ordenar arreglo por edad
        vC.printMessage("Personas Ordenadas por edad", true);
        pC.ordenarPorEdad(personas);
        vC.printPersonaArray(personas);

        // Buscar persona con edad 40
        vC.printMessage("Buscar persona  con una edad de 40", true);
        Persona pB = pC.buscarPorEdad(personas, 40);
        if (pB == null) {
            vC.printMessage("\tno hay persona con esa edad", false);
        } else {
            vC.printMessage("\tSe encontró: " + pB.getNombre() + ", edad: " + pB.getEdad(), false);
        }

        // Buscar persona con edad 99
        vC.printMessage("Buscar persona  con una edad de 99", true);
        Persona pC99 = pC.buscarPorEdad(personas, 99);
        if (pC99 == null) {
            vC.printMessage("\tno hay persona con esa edad", false);
        } else {
            vC.printMessage("\tSe encontró: " + pC99.getNombre() + ", edad: " + pC99.getEdad(), false);
        }

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD
        /// instanciar las clase necesarias
        /// imprimir arreglo
        // ordenar
        // buscar edad 40
        // imprimir resultado
        //buscar 99
        // imprimir resultado
    }
}