package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Paciente {
    private String nombre;
    private String apellidos;
    private String dni;
    private String edad;
    private int telefono;

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

    //metodos
    public void mostrar(){
        ArrayList<Persona> paciente = new ArrayList<>();

        Persona persona= new Persona();
        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        persona.setNombre(entrada.next());

        System.out.println("Ingrese su apellido: ");
        persona.setApellidos(entrada.next());

        System.out.println("Ingrese su DNI: ");
        persona.setDni(entrada.next());

        System.out.println("Ingrese su Edad: ");
        persona.setEdad(entrada.next());

        System.out.println("Ingrese su telefono: ");
        persona.setTelefono(Integer.parseInt(entrada.next()));

        paciente.add(persona);
//        for (int i = 0; i < paciente.size(); i++) {
//            persona.mostrarDatos();
//        }
        for (int i = 0; i < paciente.size(); i++) {
            Persona p= paciente.get(0);
            System.out.println("El valor del indice "+ i +"es: "+ p.getNombre());
            System.out.println("-- "+ paciente.size());
        }
    }

    public static void main(String[] args) {
        Paciente paciente= new Paciente();
        paciente.mostrar();
    }

}
