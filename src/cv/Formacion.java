package cv;

public class Formacion {

    private String nombre;
    private String lugar;
    private String fechaFin;

    public Formacion() {
        nombre = "";
        lugar="";
        fechaFin = "";
    }

    public Formacion(String nombre, String lugar, String fechaFin) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaFin = fechaFin;
    }

    public String getLugar() {
		return lugar;
	}

	public String getFechaFin() {
        return fechaFin;
    }

    public String getNombre() {
        return nombre;
    }
}