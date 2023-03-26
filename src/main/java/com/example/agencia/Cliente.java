package com.example.agencia;

public class Cliente extends Persona {
    private String Ciudad;
    private String Direccion;
    private String Telefono;
    private String Empresa;

    public Cliente() { }

    public Cliente(String id, String nombre, String apellidos, String genero, int edad, String ciudad, String direccion, String telefono, String empresa){
        super(id, nombre, apellidos, genero, edad);
        Ciudad = ciudad;
        Direccion = direccion;
        Telefono = telefono;
        Empresa = empresa;
        }

    @Override
    public String toString() {
        String baseStr = super.toString();
        StringBuilder sb = new StringBuilder(baseStr);
        if (Ciudad != null && !Ciudad.isEmpty()) {
            sb.append(", Ciudad: ").append(Ciudad).append("\n");
        }
        if (Direccion != null && !Direccion.isEmpty()) {
            sb.append(", Direccion: ").append(Direccion).append("\n");
        }
        if (Telefono != null && !Telefono.isEmpty()) {
            sb.append(", Telefono: ").append(Telefono).append("\n");
        }
        if (Empresa != null && !Empresa.isEmpty()) {
            sb.append(", Empresa: ").append(Empresa).append("\n");
        }
        return sb.toString();
        }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }
}
