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
public class politico extends Usuario {

    private String partido;

    public politico() {
        super();
    }

    public politico(String partido, String Nombre, int Edad, int ID, int ID_BL, String departamento, int dinero) {
        super(Nombre, Edad, ID, ID_BL, departamento, dinero);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return super.toString() + "politico{" + "partido=" + partido + '}';
    }

}
