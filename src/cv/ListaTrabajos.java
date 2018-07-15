package cv;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaTrabajos {
	 static ArrayList<Trabajos> trabajos;
	 
	 @SuppressWarnings("unused")
	public ListaTrabajos(){
		 trabajos = new <Trabajos> ArrayList<Trabajos>();
	 }
	 public void agregarNuevoTrabajo(Trabajos nTrabajo){
		 trabajos.add(nTrabajo);
	 }
	 public static void verTrabajos(){
		 Trabajos trabajo;
		 Iterator<Trabajos> continuar = trabajos.iterator();
		 int contador = 0;
		 while (continuar.hasNext()) {
	        	contador++;
	        	trabajo = continuar.next();
	        	System.out.print(contador);
	    		System.out.print(". "+trabajo.getWeb()+" ");
	    		System.out.println("-->  "+trabajo.getFecha());
		 }
		 
		 
	 }
}
