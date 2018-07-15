package cv;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaLenguajes {
	ArrayList<Lenguajes> lengua;
	
	@SuppressWarnings("unused")
	public ListaLenguajes(){
		lengua = new <Lenguajes>ArrayList<Lenguajes>();
	}
	public void agregarNuevoLenguaje(Lenguajes NuevoLeng){
		lengua.add(NuevoLeng);
	}
	public void verLenguajes(){
		Lenguajes leng;
		Iterator<Lenguajes> continuar = lengua.iterator();
		int contador = 0;
		while (continuar.hasNext()) {
		contador++;
        leng = continuar.next();
        System.out.print(contador);
		System.out.print(". "+leng.getNombre()+" - ");
		System.out.println(leng.getNivel()+" ");
	}
	
}
	}
