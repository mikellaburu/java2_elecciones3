

public class EspacioPublico {
	//atributos
	private String tipo;//tipo de espacio, escuela, playa, parque, ...
	private String municipio;
	private String direccion;
	private double extension;//m2
	
	//getters
	public String getTipo(){
		return this.tipo;
	}
	public String getMunicipio(){
		return this.municipio;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public double getExtension(){
		return this.extension;
	}
	
	//setters
	public void setTipo(String tipoEspacio){
		this.tipo=tipoEspacio;
	}
	public void setMunicipio(String pueblo){
		this.municipio=pueblo;
	}
	public void setDireccion(String sitio){
		this.direccion=sitio;
	}
	public void setExtension(Double metros){
		this.extension=metros;
	}
}

