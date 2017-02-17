/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Goti
 */
public class Nasrallah {
    private String Nombre;
    private String contraseña;

    public Nasrallah() {
    }

    public Nasrallah(String Nombre, String contraseña) {
        this.Nombre = Nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Nasrallah{" + "Nombre=" + Nombre + ", contrase\u00f1a=" + contraseña + '}';
    }    
}
