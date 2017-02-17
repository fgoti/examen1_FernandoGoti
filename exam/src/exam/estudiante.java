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

    public estudiante(String carrera, String Nombre, long Edad, long ID, long ID_BL, String departamento, long dinero) {
        super(Nombre, Edad, ID, ID_BL, departamento, dinero);
        this.carrera = carrera;
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
