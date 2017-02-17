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
public class empleado extends Usuario {

    private String empleo;

    public empleado() {
        super();
    }

    public empleado(String empleo, String Nombre, int Edad, int ID, int ID_BL, String departamento, int dinero) {
        super(Nombre, Edad, ID, ID_BL, departamento, dinero);
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return super.toString()+"empleado{" + "empleo=" + empleo + '}';
    }

}
