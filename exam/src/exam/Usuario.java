package exam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando Goti
 */
public class Usuario {

    private String Nombre;
    private long Edad;
    private long ID;
    private long ID_BL;
    private String departamento;
    private long dinero;

    public Usuario() {
    }

    public Usuario(String Nombre, long Edad, long ID, long ID_BL, String departamento, long dinero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;
        this.ID_BL = ID_BL;
        this.departamento = departamento;
        this.dinero = dinero;
    }

    public long getEdad() {
        return Edad;
    }

    public void setEdad(long Edad) {
        this.Edad = Edad;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getID_BL() {
        return ID_BL;
    }

    public void setID_BL(long ID_BL) {
        this.ID_BL = ID_BL;
    }

    public long getDinero() {
        return dinero;
    }

    public void setDinero(long dinero) {
        this.dinero = dinero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setID_BL(int ID_BL) {
        this.ID_BL = ID_BL;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", ID=" + ID + ", ID_BL=" + ID_BL + ", departamento=" + departamento + ", dinero=" + dinero + '}';
    }

}
