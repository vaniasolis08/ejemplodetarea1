
package base.de.datos;

public class estudiante {
    private int clave;
    private String nombre,grado;

    public estudiante(int clave, String nombre, String grado) {
        this.clave = clave;
        this.nombre = nombre;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getClave() {
        return clave;
    }
    
    
}
