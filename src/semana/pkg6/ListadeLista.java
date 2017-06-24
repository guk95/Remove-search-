package semana.pkg6;

import javax.swing.JOptionPane;

public class ListadeLista {

    private int size;
    private Nodo cabeza;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public ListadeLista() {
        this.cabeza = null;

        this.size = 0;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ");

        Nodo aux = cabeza;

        int cont = 0;

        while (cont < size) {
            builder.append(aux.getDato());
            builder.append(aux.getLista().toString());
            builder.append(System.getProperty("line.separator"));
            builder.append(" ");
            ++cont;
            aux = aux.getSig();
        }
        builder.append("-");

        return builder.toString();
    }

    public int size() {

        return size;
    }

    public boolean addSorted(String dato) {
        Nodo nuevo = new Nodo(dato);
        Nodo aux = cabeza;
        Nodo auxultimo = cabeza;
        int cont2 = 0;
        while (cont2 < size - 1) {
            auxultimo = auxultimo.getSig();
            cont2++;
        }

        if (dato.trim().length() < 2) {
            if (size == 0) {
                cabeza = nuevo;
                nuevo.setSig(nuevo);
                nuevo.setAnt(nuevo);

            } else if (dato.compareTo(cabeza.getDato()) < 0) {
                nuevo.setSig(aux);
                aux.setAnt(nuevo);
                cabeza = nuevo;

            } else if (dato.compareTo(auxultimo.getDato()) > 0) {
                auxultimo.setSig(nuevo);
                nuevo.setAnt(auxultimo);

            } else {
                int cont = 0;
                while (aux.getSig() != null && cont < size) {

                    if (dato.compareTo(aux.getSig().getDato()) <= 0) {
                        aux.getSig().setAnt(nuevo);
                        nuevo.setSig(aux.getSig());
                        nuevo.setAnt(aux);
                        aux.setSig(nuevo);
                        break;

                    }

                    aux = aux.getSig();
                    cont++;
                }

            }
            size++;
        } else {

            Nodo aux2 = cabeza;
            Nodo aux3 = cabeza;
            int cont3 = 0;
            if (size == 0) {
                cabeza = nuevo;
                nuevo.setSig(nuevo);
                nuevo.setAnt(nuevo);
                nuevo.setDato(dato.substring(0, 1));
                nuevo.getLista().add(dato);
                size++;

            } else {
                int cont = 0;
                while (cont < size) {

                    if (dato.substring(0, 1).compareTo(aux2.getDato()) == 0) {
                        break;

                    } else {
                        aux2 = aux2.getSig();
                    }
                    cont++;
                }

                aux2.getLista().add(dato);

            }

        }

        return true;

    }

    public boolean remove(String dato) {
        Nodo aux = cabeza;
        int cont = 0;
        int cont2 = 0;
        if (dato.length() < 2) {
            while (cont < size) {
                if (dato.compareTo(aux.getDato()) == 0) {

                    if (aux.getLista().getSize() > 1) {
                        int respuesta = JOptionPane.showConfirmDialog(null, "La "
                                + "lista contiene elementos seguro que desea borrarla");
                        if (respuesta == 0) {
                            aux.getAnt().setSig(aux.getSig());
                            aux.getSig().setAnt(aux.getAnt());
                            break;
                        } else {
                            break;

                        }

                    } else {
                        aux.getAnt().setSig(aux.getSig());
                        aux.getSig().setAnt(aux.getAnt());
                    }

                } else {

                    aux = aux.getSig();
                }

                cont++;

            }
            size--;

        } else {
            while (cont2 < size) {
                if (dato.substring(0, 1).compareTo(aux.getDato()) == 0) {
                    aux.getLista().remove(dato);
                    break;
                } else {
                    aux = aux.getSig();

                }

                cont2++;

            }

        }

        return true;
    }

    public String search(String dato) {

        Nodo aux = cabeza;
       
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        String resultado = "";

        if (dato.length() < 2) {
            while (cont3 < size) {
                if (dato.compareTo(aux.getDato()) == 0) {
                    resultado = aux.getLista().toString();

                } else {

                    aux = aux.getSig();
                }

                cont3++;
            }

        } else {
             
            while (cont < size) {
                NodoD aux2 = aux.getLista().getCabeza();

                if (dato.substring(0, 1).contains(aux.getDato())) {
                    while (cont2 < aux.getLista().getSize()) {

                        if (aux2.getDato().contains(dato)) {
                            resultado =" "+ aux2.getDato() + resultado + " ";
                            aux2 = aux2.getSig();

                        } else {
                            aux2 = aux2.getSig();

                        }
                        cont2++;
                    }

                } else {

                    aux = aux.getSig();

                }
                cont++;
            }

        }

        return resultado;
    }
}
