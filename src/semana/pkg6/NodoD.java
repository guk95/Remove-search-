/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg6;

public class NodoD {

    private String dato;
    private NodoD sig;
    private NodoD ant;

    public NodoD(String dato) {

        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

}
