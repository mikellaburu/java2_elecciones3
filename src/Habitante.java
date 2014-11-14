

public class Habitante {
	//atributos
		private String nombre;
		private String apellido1;
		private String apellido2;
		private String dni;
		//private int anoNacimiento;
		//private int mesNacimiento;
		//private int diaNacimiento;
		private int edad;
		private boolean mayorEdad;
		private String sexo;
		private String direccion;
		private long tlfFijo;
		private long tlfMovil;
		
		//getters
		public String getNombre(){
			return this.nombre;
		}
		public String getApellido1(){
			return this.apellido1;
		}
		public String getApellido2(){
			return this.apellido2;
		}
		public String getDni(){
			return this.dni;
		}
		/*public int getAno(){
			return this.anoNacimiento;
		}
		public int getMes(){
			return this.mesNacimiento;
		}
		public int getDia(){
			return this.diaNacimiento;
		}*/
		public int getEdad(){
			return this.edad;
		}
		public boolean getMayor(){
			return this.mayorEdad;
		}
		public String getSexo(){
			return this.sexo;
		}
		public String getDireccion(){
			return this.direccion;
		}
		public long getFijo(){
			return this.tlfFijo;
		}
		public long getMovil(){
			return this.tlfMovil;
		}
		
		//setters
		public void setNombre(String nombreHabitante){
			this.nombre=nombreHabitante;
		}
		public void setApellido1(String apel1){
			this.apellido1=apel1;
		}
		public void setApellido2(String apel2){
			this.apellido2=apel2;;
		}
		public void setDni(String numIdentificacion){
			this.dni=numIdentificacion;
		}
		/*public void setAno(int ano){
			this.anoNacimiento=ano;
		}
		public void setMes(int mes){
			this.mesNacimiento=mes;
		}
		public void setDia(int dia){
			this.diaNacimiento=dia;
		}*/
		public void setEdad(int anos){
			this.edad=anos;
			this.esMayor();
		}
		/*public void setMayor(int this.getEdad()){
			if (this.edad>=18){
				this.mayorEdad=true;
			}else{
				this.mayorEdad=false;
			}
		}*/
		public void setSexo(String sex){
			this.sexo=sex;
		}
		public void setDireccion(String sitio){
			this.direccion=sitio;
		}
		public void setFijo(long fijo){
			this.tlfFijo=fijo;
		}
		public void setMovil(long movil){
			this.tlfMovil=movil;
		}
		
		public void esMayor(){
			if (this.edad>=18){
				this.mayorEdad=true;
			}else{
				this.mayorEdad=false;
			}
		}


}

