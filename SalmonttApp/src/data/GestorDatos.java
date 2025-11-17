
package data;

/**
 *
 * @author Konny Lagos Morales
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import model.CentroCultivo;

public class GestorDatos {
    public ArrayList<CentroCultivo> cargarCentros(String rutaArchivo) {
        ArrayList<CentroCultivo> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                String nombre = partes[0];
                String comuna = partes[1];
                int toneladas = Integer.parseInt(partes[2]);

                CentroCultivo c = new CentroCultivo(nombre, comuna, toneladas);
                lista.add(c);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }

        return lista;
    }
}