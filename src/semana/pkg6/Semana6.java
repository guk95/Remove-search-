package semana.pkg6;

public class Semana6 {

    public static void main(String[] args) {
        ListadeLista listaL = new ListadeLista();
        Listadoble doble = new Listadoble();
        listaL.addSorted("1");
        listaL.addSorted("2");
        listaL.addSorted("3");
        listaL.addSorted("A");
        listaL.addSorted("Araya");
        listaL.addSorted("Arias");
        listaL.addSorted("!");
        listaL.addSorted("E");
        listaL.addSorted("B");
   
////        System.out.println(listaL.toString());
        System.out.println(listaL.search("Ar"));

    }

}
