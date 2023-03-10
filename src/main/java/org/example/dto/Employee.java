package org.example.dto;

public class Employee {
    private String nombreDeUsuario;
    private String correoElectronico;
    private String perfilUsuario;

    public Employee(){};
    public Employee(String nombre, String correo, String perfil){
        this.nombreDeUsuario = nombre;
        this.correoElectronico = correo;
        this.perfilUsuario = perfil;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(String perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nombreDeUsuario='" + nombreDeUsuario + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", perfilUsuario='" + perfilUsuario + '\'' +
                '}';
    }
}
