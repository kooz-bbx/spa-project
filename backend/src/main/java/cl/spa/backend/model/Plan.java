
package cl.spa.backend.model;
import jakarta.persistence.*;


@Entity
@Table(name="Plan")




public class Plan {
    
    

    public Plan(long id, String nombre, String descripcion, int precip) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precip = precip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecip() {
        return precip;
    }

    public void setPrecip(int precip) {
        this.precip = precip;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Plan() {
    }
    private String nombre;
    private String descripcion;
    private int precip;
}
