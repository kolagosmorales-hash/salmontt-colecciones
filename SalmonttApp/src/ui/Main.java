
package ui;

/**
 *
 * @author Konny Lagos Morales
 */
import data.GestorDatos;
import model.CentroCultivo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
        GestorDatos gestor = new GestorDatos();

        String ruta = "resources/centros.txt";
        ArrayList<CentroCultivo> centros = gestor.cargarCentros(ruta);

        System.out.println("=== TODOS LOS CENTROS ===");
        for (CentroCultivo c : centros) {
            System.out.println(c);
        }

        System.out.println("\n=== CENTROS CON PRODUCCION > 1000 ===");
        for (CentroCultivo c : centros) {
            if (c.getProduccion() > 1000) {
                System.out.println(c);
            }
        }
    }
}
