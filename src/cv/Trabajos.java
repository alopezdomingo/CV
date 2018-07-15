package cv;

public class Trabajos {
	private String web , fecha;
	
	public Trabajos(){
		web="";
		fecha="";
	}
	public Trabajos(String web, String fecha){
		this.web=web;
		this.fecha=fecha;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
