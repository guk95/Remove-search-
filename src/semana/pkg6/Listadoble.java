package semana.pkg6;

public class Listadoble {

    private int size;
    private NodoD cabeza;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodoD getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoD cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isEmpty() {

        return cabeza == null;
    }

    public boolean add(String dato) {
        NodoD nuevo = new NodoD(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.setAnt(nuevo);
            nuevo.setSig(nuevo);

        } else {
            NodoD aux = cabeza;
            int cont = 0;
            while (cont < size - 1) {
                aux = aux.getSig();
                cont++;
            }
            nuevo.setAnt(aux);
            aux.setSig(nuevo);

        }
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - ");

        NodoD aux = cabeza;
        int cont = 0;

        while (cont < size) {
            builder.append(aux.getDato());
            builder.append(" ");
            ++cont;
            aux = aux.getSig();
        }
        builder.append("-");

        return builder.toString();
    }

    public boolean remove(String dato) {
        NodoD aux = cabeza;
        NodoD auxultimo = cabeza;
        int cont = 0;
        while (auxultimo.getDato() != dato) {
            auxultimo = auxultimo.getSig();

        }

        if (cabeza.getDato() == dato) {
            cabeza = cabeza.getSig();

        } else if (dato==auxultimo.getDato()) {
            aux.getAnt().setSig(null);
            aux.setAnt(null);

        } else {

            aux.getAnt().setSig(aux.getSig());
            aux.getSig().setAnt(aux.getAnt());
        }
        size--;
        return true;

    }

}
