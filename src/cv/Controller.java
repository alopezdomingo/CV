package cv;

import java.util.Scanner;

public class Controller {

    @SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {


        ListaFormacion listaEstudios = new ListaFormacion();
        GestionadorEntradasTeclado entrada = new GestionadorEntradasTeclado();
        Formacion estudio1 = new Formacion("Bachillerato Ciencias de la Tecnología","Juan Antonio Casto, Talavera", "2005");
        Formacion estudio2 = new Formacion("Gestión y Administración Pública","Universidad Complutense de Madrid", "2009");
        Formacion estudio3 = new Formacion("Confección y Publicación de páginas Web","Infobit, Toledo ","2014");
        Formacion estudio4 = new Formacion("Desarollo de Aplicaciones Web","IES Azarquiel, Toledo", "2016");
        Formacion estudio5 = new Formacion("Programación con Lenguajes Orientados a Objetos y Bases de Datos Relacionales","FOREM, Toledo", "2018");
        
        listaEstudios.agregarNuevoEstudio(estudio1);
        listaEstudios.agregarNuevoEstudio(estudio2);
        listaEstudios.agregarNuevoEstudio(estudio3);
        listaEstudios.agregarNuevoEstudio(estudio4);
        listaEstudios.agregarNuevoEstudio(estudio5);
        
        ListaLenguajes listarLenguajes = new ListaLenguajes();
        Lenguajes leng1= new Lenguajes("JAVA","Medio");
        Lenguajes leng2= new Lenguajes("PHP","Medio");
        Lenguajes leng3= new Lenguajes("SQL","[Medio - Alto]");
        Lenguajes leng4= new Lenguajes("JavaScript","[Medio - Alto]");
        Lenguajes leng5= new Lenguajes("HTML","[Medio - Alto]");
        Lenguajes leng6= new Lenguajes("CSS","[Medio - Alto]");
        Lenguajes leng7= new Lenguajes("BootStrap","[Medio - Alto]");
        listarLenguajes.agregarNuevoLenguaje(leng1);
        listarLenguajes.agregarNuevoLenguaje(leng2);
        listarLenguajes.agregarNuevoLenguaje(leng3);
        listarLenguajes.agregarNuevoLenguaje(leng4);
        listarLenguajes.agregarNuevoLenguaje(leng5);
        listarLenguajes.agregarNuevoLenguaje(leng6);
        listarLenguajes.agregarNuevoLenguaje(leng7);
        
        ListaTrabajos listarTrabajos = new ListaTrabajos();
        Trabajos tra1 = new Trabajos("www.momidj.com", "[feb -2014]");
        Trabajos tra2 = new Trabajos("www.ab-asesoria.es", "[mar - 2014]");
        Trabajos tra3 = new Trabajos("http://telecomclm.net/","[feb - 2016]");
        Trabajos tra4 = new Trabajos("http://bokehestudioaudiovisual.com/","[mar - 2017]");
        Trabajos tra5 = new Trabajos("http://hospitaldediamadrid.es/","[abr - 2017]");
        Trabajos tra6 = new Trabajos("http://israelgalanfotografia.com/","[jun - 2017]");
        Trabajos tra7 = new Trabajos("http://chaismartin.com/","[ago - 2017]");
        Trabajos tra8 = new Trabajos("http://www.alganda.org/","[feb - 2018]");
        listarTrabajos.agregarNuevoTrabajo(tra1);
        listarTrabajos.agregarNuevoTrabajo(tra2);
        listarTrabajos.agregarNuevoTrabajo(tra3);
        listarTrabajos.agregarNuevoTrabajo(tra4);
        listarTrabajos.agregarNuevoTrabajo(tra5);
        listarTrabajos.agregarNuevoTrabajo(tra6);
        listarTrabajos.agregarNuevoTrabajo(tra7);


        String continuar;
        Scanner sc = new Scanner(System.in);

        do {
        	System.out.println("Bienvenida/o al CV de A López "
        			+ "El programa permite consultar: \n"
    				+ "\t1.- Formación\n"
    				+ "\t2.- Lenguajes\n"
    				+ "\t3.- Trabajos realizados\n");
        	 Scanner op=new Scanner(System.in); 
			 int opcion=op.nextInt();
			
			 if (opcion == 1){
        		 System.out.println("--- FORMACION ---");
                 listaEstudios.verEstudios();
                 System.out.println("------");
        	 }
			 if (opcion == 2){
				 System.out.println("--- LENGUAJES / NIVEL ---");
				 listarLenguajes.verLenguajes();
				 System.out.println("------");
			 }
			 if (opcion == 3){
				 System.out.println("--- TRABAJOS REALIZADOS ---");
				 ListaTrabajos.verTrabajos();
				 System.out.println("------");
			 }
			 
            System.out.println("¿Deseas ver mas datos de A López (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        
    }

}