package Views;

import Models.Persona;

public class ViewsConsole {

    // Imprime un mensaje en consola, con opción a línea vacía antes del mensaje
    public void printMessage(String message, boolean newLineBefore) {
        if (newLineBefore) {
            System.out.println();
        }
        System.out.println(message);
    }

    // Imprime cada persona en el arreglo recibido
    public void printPersonaArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println("\t" + persona.getNombre() + ", edad: " + persona.getEdad());
        }
    }
}