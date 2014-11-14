

public class Ayuntamiento {
	//Atributos
	private String nombre;//del pueblo
	private String tipo; //ciudad,villa,pueblo...
	private int populacion;
	private int censo;//numero de votantes
	private double extension; //km2
	private String alcalde;
	private String gobierno;
	private int cp;
	private String provincia;

	//getters
	public String getNombre(){
		return this.nombre;
	}
	public String getTipo(){
		return this.tipo;
	}
	public int getPopulacion(){
		return this.populacion;
	}
	public int getCenso(){
		return this.censo;
	}
	public double getExtension(){
		return this.extension;
	}
	public String getAlcalde(){
		return this.alcalde;
	}
	public String getGobierno(){
		return this.gobierno;
	}
	public int getCp(){
		return this.cp;
	}
	public String getProvincia(){
		return this.provincia;
	}
	
	//setters
	public void setNombre(String nombrePueblo){
		this.nombre=nombrePueblo;
	}
	public void setTipo(String tipoPueblo){
		this.tipo=tipoPueblo;
	}
	public void setPopulacion(int habitantes){
		this.populacion=habitantes;
	}
	public void setCenso(int votantes){
		this.censo=votantes;
	}
	public void setExtension(double area){
		this.extension=area;
	}
	public void setAlcalde(String nombreAlcalde){
		this.alcalde=nombreAlcalde;
	}
	public void setGobierno(String siglas){
		this.gobierno=siglas;
	}
	public void setCp(int codPostal){
		this.cp=codPostal;
	}
	public void setProvincia(String nombreProvincia){
		this.provincia=nombreProvincia;
	}
}
