package cv;

public class Lenguajes {
	private String nombre;
    private String nivel;
    
    public Lenguajes(){
    	nombre=" ";
    	nivel=" ";
    }
    public Lenguajes(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
    
}
