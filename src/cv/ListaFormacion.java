package cv;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaFormacion {

    ArrayList<Formacion> estudios;

    @SuppressWarnings({ "unused" })
	public ListaFormacion() {
        estudios = new <Formacion> ArrayList<Formacion>();
    }

    public void agregarNuevoEstudio(Formacion Estudios) {
        estudios.add(Estudios);
    }

    public void verEstudios() {
        Formacion estudio;
        Iterator<Formacion> continuar = estudios.iterator();
        int contador = 0;
        while (continuar.hasNext()) {
        	contador++;
            estudio = continuar.next();
            System.out.print(contador);
    		System.out.print(". "+estudio.getNombre()+",");
    		System.out.print(" "+estudio.getLugar()+" ");
            System.out.println(" ["+estudio.getFechaFin()+"] ");
        }
    }

}