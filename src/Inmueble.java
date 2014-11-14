

public class Inmueble {
	//atributos
		private String pueblo;
		private String calle;
		private int numPortal;
		private int piso;
		private String puerta;
		private boolean habitable;
		private String tipoLocal;
		private double metros;
		
		
		//getters
		public String getPueblo(){
			return this.pueblo;
		}
		public String getCalle(){
			return this.calle;
		}
		public int getNumPortal(){
			return this.numPortal;
		}
		public int getPiso(){
			return this.piso;
		}
		public String getPuerta(){
			return this.puerta;
		}
		public boolean getHabitable(){
			return this.habitable;
		}
		public String getTipoLocal(){
			return this.tipoLocal;
		}
		public double getMetros(){
			return this.metros;
		}
		
		//setters
		public void setPueblo(String nombrePueblo){
			this.pueblo=nombrePueblo;
		}
		public void setCalle(String nombreCalle){
			this.calle=nombreCalle;
		}
		public void setNumPortal(int portal){
			this.numPortal=portal;
		}
		public void setPiso(int numPiso){
			this.piso=numPiso;
		}
		public void setPuerta(String letra){
			this.puerta=letra;
		}
		public void setHabitable(String esHabitable){
			if (esHabitable.equalsIgnoreCase("si")){
				this.habitable=true;
			}else{
				this.habitable=false;
			}
			
		}
		public void setTipoLocal(String tipo){
			this.tipoLocal=tipo;
		}
		public void setMetros(double area){
			this.metros=area;
		}
}

