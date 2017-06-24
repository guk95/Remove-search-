package semana.pkg6;

public class Nodo {

    private String dato;
    private Nodo sig;
    private Nodo ant;
    private Listadoble lista;
    public Nodo(String dato){
    
    this.dato=dato;
    this.lista=new Listadoble();
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Listadoble getLista() {
        return lista;
    }

    public void setLista(Listadoble lista) {
        this.lista = lista;
    }


}
