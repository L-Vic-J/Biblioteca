
package cr.ac.ufidelitas.practicados.casocuatro;

public class Material {
    
    
    private String nombre;
    private String material;

    public Material(String nombre, String material) {
        this.nombre = nombre;
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material:" + "nombre=" + nombre + ", material=" + material;
    }
    
    
    
}
