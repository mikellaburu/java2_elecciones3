import java.util.*;
import java.io.*;

public class Elecciones {

	public static void main(String[] args) {
	
		Scanner tecla=new Scanner(System.in);
		
		String opcion=" ";
		System.out.println("ELECCIONES");
		
		do{
			System.out.println();
			System.out.println("Elige una opcion:");
			System.out.println("\ta) Habitante");
			System.out.println("\tb) Ayuntamiento");
			System.out.println("\tc) Partido");
			System.out.println("\td) Inmueble");
			System.out.println("\te) Espacio Publico");
			System.out.println("\tf) Leer nombres de los partidos desde 'listadoPartidos.txt'");
			System.out.println("\tg) ");
			System.out.println("\tx) Salir");
			
			opcion=tecla.next();
			switch (opcion){
				case "a": 
					String nombre=" ";
					String apellido1=" ";
					
					String dni=" ";
					int edad=0;
					boolean mayor=false;
										
					System.out.println("DATOS DEL HABITANTE");
					System.out.println(" ");
					System.out.println("Ingresa tus datos");
					System.out.print("Nombre: ");
					nombre=tecla.next();
					System.out.print("Primer apellido: ");
					apellido1=tecla.next();
					
					System.out.print("DNI: ");
					dni=tecla.next();
					System.out.print("Edad: ");
					edad=tecla.nextInt();
					
					Habitante h1=new Habitante();
					h1.setNombre(nombre);
					h1.setApellido1(apellido1);
					h1.setDni(dni);
					h1.setEdad(edad);
					
					
					
					System.out.println("Datos introducidos del  habitante");
					System.out.println("Nombre: "+h1.getNombre());
					System.out.println("Apellido 1: "+h1.getApellido1());
					System.out.println("DNI: "+h1.getDni());
					System.out.println("Edad: "+h1.getEdad());
					if (h1.getMayor()){
						System.out.println("El habitante es mayor de edad. ");
					}else{
						System.out.println("El habitante es menor.");
					}
					break;
				
				case "b":
					System.out.println("Ayuntamiento");
	
					String pueblo=" ";
					String tipo=" ";
					int habitatantes=0;
					int votantes=0;
					double area=0;
					String alcalde=" ";
					int codPost=0;
					String provincia=" ";
					System.out.println("DATOS DEL AYUNTAMIENTO");
					System.out.println(" ");
					System.out.println("Ingresa los datos");
					System.out.print("Pueblo: ");
					pueblo=tecla.next();
					System.out.print("Tipo de localidad( ciudad, villa, etc): ");
					tipo=tecla.next();
					System.out.print("Numero de habitatantes: ");
					habitatantes=tecla.nextInt();
					System.out.print("Numero de votantes: ");
					votantes=tecla.nextInt();
					System.out.print("Extension en km2: ");
					area=tecla.nextDouble();
					System.out.print("Nombre del alcalde: ");
					alcalde=tecla.next();
					System.out.print("Codigo Postal: ");
					codPost=tecla.nextInt();
					System.out.print("Provincia: ");
					provincia=tecla.next();

					Ayuntamiento a1=new Ayuntamiento();
					a1.setNombre(pueblo);
					a1.setTipo(tipo);
					a1.setPopulacion(habitatantes);
					a1.setCenso(votantes);
					a1.setExtension(area);
					a1.setAlcalde(alcalde);
					a1.setCp(codPost);
					a1.setProvincia(provincia);
					
					System.out.println("Datos del ayuntamiento");
					System.out.println("Pueblo: "+a1.getNombre());
					System.out.println("Tipo de pueblo: "+a1.getTipo());
					System.out.println("Habitantes: "+a1.getPopulacion());
					System.out.println("Censo: "+a1.getCenso());
					System.out.println("Area: "+a1.getExtension());
					System.out.println("Alcalde: "+a1.getAlcalde());
					System.out.println("Codigo Postal: "+a1.getCp());
					System.out.println("Provincia: "+a1.getProvincia());
					break;
				
				case "c":
				try{
					System.out.println("Partido");
					String nomPartido=" ";
					String siglas=" ";
					String idea=" ";
					int miembros=0;
					String candidato=" ";
					
					System.out.println("DATOS DEL PARTIDO");
					System.out.println(" ");
					System.out.println("Ingresa los datos");
					System.out.print("Nombre del partido: ");
					nomPartido=tecla.next();
					System.out.print("Siglas: ");
					siglas=tecla.next();
					System.out.print("Ideologia: ");
					idea=tecla.next();
					System.out.print("Numero de afiliados: ");
					miembros=tecla.nextInt();
					System.out.print("Nombre del candidato: ");
					candidato=tecla.next();
					
					Partido p1=new Partido();
					p1.setNombre(nomPartido);
					p1.setSiglas(siglas);
					p1.setIdeologia(idea);
					p1.setMiembros(miembros);
					p1.setCandidato(candidato);
					
					System.out.println("Datos introducidos del partido");
					System.out.println("Partido: "+p1.getNombre());
					System.out.println("Siglas: "+p1.getSiglas());
					System.out.println("Ideologia: "+p1.getIdeologia());
					System.out.println("Numero de afiliados: "+p1.getMiembros());
					System.out.println("Candidato: "+p1.getCandidato());
				}catch(Exception e){
					System.out.println("Error: "+e);
				}


					break;
				
				case "d":
				
					System.out.println("Inmueble");
					String nomPueblo=" ";
					String calle=" ";
					int portal=0;
					int piso=0;
					String puerta=" ";
					String habitable=" ";
					String tipoLocal=" ";
					double metros2=0;
					System.out.println("DATOS DEL INMUEBLE");
					System.out.println(" ");
					System.out.println("Ingresa los datos");
					System.out.print("Pueblo: ");
					nomPueblo=tecla.next();
					System.out.print("Calle o Barrio: ");
					calle=tecla.next();
					System.out.print("Nº de portal: ");
					portal=tecla.nextInt();
					System.out.print("Piso: ");
					piso=tecla.nextInt();
					System.out.print("Puerta: ");
					puerta=tecla.next();
					System.out.print("Es habitable?(si/no) ");
					habitable=tecla.next();
					System.out.print("Tipo de local(piso,apartamento,villa,garaje...): ");
					tipoLocal=tecla.next();
					System.out.print("Cuantos metros cuadrados tiene? ");
					metros2=tecla.nextDouble();
					
					Inmueble i1=new Inmueble();
					i1.setPueblo(nomPueblo);
					i1.setCalle(calle);
					i1.setNumPortal(portal);
					i1.setPiso(piso);
					i1.setPuerta(puerta);
					i1.setHabitable(habitable);
					i1.setTipoLocal(tipoLocal);
					i1.setMetros(metros2);
					System.out.println("Datos introducidos del Inmueble");
					System.out.println("Pueblo: "+i1.getPueblo());
					System.out.println("Barrio o calle: "+i1.getCalle());
					System.out.println("Portal: "+i1.getNumPortal());
					System.out.println("Piso: "+i1.getPiso());
					System.out.println("Puerta: "+i1.getPuerta());
					System.out.println("Es habitable: ");
					if (i1.getHabitable()){
						System.out.println("SI");
					}else{
						System.out.println("NO ");
					}
					System.out.println("Tipo de local: "+i1.getTipoLocal());
					System.out.println("Metros cuadrados: "+i1.getMetros());
					break;

				
				case "e":
					System.out.println("Espacio Publico");
					String tipoEspacio=" ";
					String municipio=" ";
					String donde=" ";
					double extension=0;
					System.out.println("DATOS DEL ESPACIO PUBLICO");
					System.out.println(" ");
					System.out.println("Ingresa los datos");
					System.out.print("Tipo: ");
					tipoEspacio=tecla.next();
					System.out.print("Pueblo: ");
					municipio=tecla.next();
					System.out.print("Direccion: ");
					donde=tecla.next();
					System.out.print("Extension en metros2: ");
					extension=tecla.nextDouble();
															
					EspacioPublico e1=new EspacioPublico();
					e1.setTipo(tipoEspacio);
					e1.setMunicipio(municipio);
					e1.setDireccion(donde);
					e1.setExtension(extension);
					System.out.println("Datos introducidos del espacio publico");
					System.out.println("Tipo de espacio: "+e1.getTipo());
					System.out.println("Pueblo: "+e1.getMunicipio());
					System.out.println("Direccion: "+e1.getDireccion());
					System.out.println("Extension: "+e1.getExtension());
					break;
					
				case "f":
				   try{
				   	System.out.println("Leer nombres de partidos desde el fichero");
					String ruta="/home/zubiri/ProyectosJava/java2_elecciones3/src/";
					String nombreFichero="listadoPartidos.txt";
					//fitxategiko lerroak irakurri
						try{
						
								File fichero = new File(ruta,nombreFichero);
								Scanner leerFichero=new Scanner (fichero);
								//FileReader leerFichero=new FileReader(fichero);
								//BufferedReader bf=new BufferedReader(leerFichero);
								ArrayList <Partido> partidos=new ArrayList <Partido>();
								//String fila=bf.readLine();
								String fila=leerFichero.nextLine();

								//while ((fila=bf.readLine())!=null) {
								while (leerFichero.hasNextLine()) {
									fila=leerFichero.nextLine();//lerro bat irakurri fitxategitik eta string moduan gorde
									String [] dividirAtributos = fila.split(",");//atributuak komaz bereiztu eta string array batean gorde 
									//lista.add(fila);//fitxategiko lerroaren edukia ArrayListean gehitu
									Partido p = new Partido();
									p.setNombre(dividirAtributos[0]);
									p.setSiglas(dividirAtributos[1]);
									p.setIdeologia(dividirAtributos[2]);
									p.setMiembros(Integer.parseInt(dividirAtributos[3]));
									p.setCandidato(dividirAtributos[4]);
									//objetu bakoitza bere atributuekin arraylist-ean gehitu
									partidos.add(p);
									//memoria garbitu
									//partidos.clear();


								}

								//ArrayList-aren edukia pantailaratu
								System.out.println("listadoPartidos.txt");
								for(int i=0;i<partidos.size();i++){
									System.out.println("\t1. "+partidos.get(i).getNombre());
									System.out.println("\t2. "+partidos.get(i).getSiglas());
									System.out.println("\t3. "+partidos.get(i).getIdeologia());
									System.out.println("\t4. "+partidos.get(i).getMiembros());
									System.out.println("\t5. "+partidos.get(i).getCandidato());
								}
						}catch(FileNotFoundException fnfe){
								System.out.println("Error: "+fnfe);
						}
					}catch(Exception ioe){
						System.out.println("Error "+ioe);
					}
					
					break;

				case "g":
				try{
					System.out.println("Leer Habitantes");
					String ruta2="/home/zubiri/ProyectosJava/java2_elecciones3/src/";
					String nombreFichero2="listaHabitantes.txt";
					File  fichero2= new File(ruta2, nombreFichero2);
					//FileReader leerFichero2 = new FileReader (fichero2);
					//BufferedReader bf2 = new BufferedReader(leerFichero2);
					Scanner leerFichero2=new Scanner (fichero2);
					ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
					//String fila2 = bf2.readLine();
					String fila2=leerFichero2.nextLine();
					do{
						
						String [] cortarString = fila2.split(",");	
						Habitante h = new Habitante(); 
						
						h.setNombre(cortarString[0]);
						h.setApellido1(cortarString[1]);
						h.setDni(cortarString[2]);
						h.setEdad(Integer.parseInt(cortarString[3]));
						//si el habitante introducido es mayor de edad lo añadira al censo
						if (Integer.parseInt(cortarString[3])>=18){

							//el valor que se le ha dado a cada atributo se lo pasa al objeto de tipo arraylist de partido
							habitantes.add(h);
						}

								
					} while (leerFichero2.hasNextLine());
					//} while ((fila2 = bf2.readLine()) != null);

					System.out.println("Censados: ");

		//imprimira la informacion del array de habitantes
					for(int j=0; j<habitantes.size(); j++){
			            System.out.println(" ");
			            System.out.println("\tDni "+habitantes.get(j).getDni() );
			            System.out.println("\tNombre:: "+habitantes.get(j).getNombre());
			            System.out.println("\tApellido 1: "+ habitantes.get(j).getApellido1());
			            System.out.println("\tEdad: "+ habitantes.get(j).getEdad());
			        }	
			    }catch(Exception e){
			    	System.out.println("Error: "+e);
			    }

					break;
 					

				case "x":
					System.out.println("Salir");
					break;


					
				default:
					System.out.println("Opcion incorrecta, teclea otra opcion");
					break;
			}
			
		}while(!opcion.equalsIgnoreCase("x"));
		
		System.out.println("Programa terminado");
		
		
		
		tecla.close();
	}
	

}

