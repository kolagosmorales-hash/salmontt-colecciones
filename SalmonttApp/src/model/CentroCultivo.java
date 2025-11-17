
package model;

/**
 *
 * @author Konny Lagos Morales
 */
public class CentroCultivo {
    
 private String nombre;
    private String comuna;
    private int produccion;

    public CentroCultivo(String nombre, String comuna, int produccion) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.produccion = produccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    @Override
    public String toString() {
        return nombre + " - " + comuna + " - " + produccion + " toneladas";
    }
}
