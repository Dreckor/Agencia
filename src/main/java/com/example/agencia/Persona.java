package com.example.agencia;

public class Persona {
    public String Id;
    public String Nombre;
    public String Apellidos;
    public  String Genero;
    public  int Edad;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Persona(){}
    public Persona(String id, String nombre, String apellidos, String genero, int edad) {
        Id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        Genero = genero;
        Edad = edad;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (Id != null && !Id.isEmpty()) {
            sb.append("ID: ").append(Id).append("\n");
        }
        if (Nombre != null && !Nombre.isEmpty()) {
            if (sb.length() > 0) sb.append(", ");
            sb.append("Nombre: ").append(Nombre).append("\n");
        }
        if (Apellidos != null && !Apellidos.isEmpty()) {
            if (sb.length() > 0) sb.append(", ");
            sb.append("Apellidos: ").append(Apellidos).append("\n");
        }
        if (Genero != null && !Genero.isEmpty()) {
            if (sb.length() > 0) sb.append(", ");
            sb.append("Genero: ").append(Genero).append("\n");
        }
        if (Edad > 0) {
            if (sb.length() > 0) sb.append(", ");
            sb.append("Edad: ").append(Edad).append("\n");
        }
        return sb.toString();
    }
}
