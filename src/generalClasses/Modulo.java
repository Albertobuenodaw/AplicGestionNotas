package generalClasses;

public class Modulo {
	
	//attributes
	private String nombreModulo;
	private Notas notasModulo;
	private Alumno alumnosModulo [] = new Alumno [10];

	//constructor
	
	public Modulo (String nombreModulo) {
		this.nombreModulo=nombreModulo;
		
		
	}
	//getters & setters
	
	public String getNombreModulo() {
		return this.nombreModulo;
	}
	
	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo=nombreModulo;
	}
	
}
