package tarea1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celio D
 */
public class Persona {
 private String Nombre;
 private String Apellido;
 private int Edad;
 private int DNI;
 private String Departamento;
 private String Provincia;

    public Persona(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public Persona(int DNI, String Departamento, String Provincia) {
        this.DNI = DNI;
        this.Departamento = Departamento;
        this.Provincia = Provincia;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public int getDNI() {
        return DNI;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getProvincia() {
        return Provincia;
    }

}

 
 

