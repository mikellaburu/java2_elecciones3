

public class Partido {
	//atributos
	private String nombre;
	private String siglas;
	private String ideologia;
	private int miembros;
	private String candidato;
	
	//getters
	public String getNombre(){
		return this.nombre;
	}
	public String getSiglas(){
		return this.siglas;
	}
	public String getIdeologia(){
		return this.ideologia;
	}
	public int getMiembros(){
		return this.miembros;
	}
	public String getCandidato(){
		return this.candidato;
	}
	
	//setters
	public void setNombre(String denominacion){
		this.nombre=denominacion;
	}
	public void setSiglas(String iniciales){
		this.siglas=iniciales;
	}
	public void setIdeologia(String idea){
		this.ideologia=idea;
	}
	public void setMiembros(int afiliados){
		this.miembros=afiliados;
	}
	public void setCandidato(String presidente){
		this.candidato=presidente;
	}
	
}

