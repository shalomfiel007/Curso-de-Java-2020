
package Agenda;

public class Contacto {
    
    private String nombre;
    private String telefono;
    private int id;

    
    public Contacto(int id, String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId () {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(Contacto c){
        
        if(this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())){
            return true;
        }
        
        return false;
        
    }
    
    @Override
    public String toString() {
        System.out.println("----------------------------------------------------");
        return "Id = "+id+" "+"nombre ="+" "+ nombre +" "+ "telefono ="+" "+ telefono;

    }
    
    
}
