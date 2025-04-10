package org.example;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String edad;
    private int telefono;

//    public Persona(String nombre, String apellidos, String dni, String edad, int telefono) {
//    }
public String getNombre(){
    return nombre;
}

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos= apellidos;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni= dni;
    }

    public String getEdad(){
        return edad;
    }

    public void setEdad(String edad){
        this.edad= edad;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono= telefono;
    }

    public void mostrarDatos(){
        System.out.println(getNombre());
        System.out.println(getApellidos());
        System.out.println(getDni());
        System.out.println(getEdad());
        System.out.println(getTelefono());
    }
}
