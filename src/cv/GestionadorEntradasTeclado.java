package cv;

import java.util.Scanner;

public class GestionadorEntradasTeclado {

    private String entradaTeclado;
    Scanner sc = new Scanner(System.in);

    public GestionadorEntradasTeclado() {
        entradaTeclado = "";
    }

    public String recogerPalabra() {
        entradaTeclado = sc.nextLine();
        return entradaTeclado;
    }
   

}