/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Fernando Goti
 */
public class estudiante extends Usuario {

    private String carrera;

    public estudiante() {
        super();
    }

    public estudiante(String estudiante, String Nombre, int Edad, int ID, int ID_BL, String departamento, int dinero) {
        super(Nombre, Edad, ID, ID_BL, departamento, dinero);
        this.carrera = estudiante;
    }

    public String getEstudiante() {
        return carrera;
    }

    public void setEstudiante(String estudiante) {
        this.carrera = estudiante;
    }

    @Override
    public String toString() {
        return super.toString() + "estudiante{" + "estudiante=" + carrera + '}';
    }

}
