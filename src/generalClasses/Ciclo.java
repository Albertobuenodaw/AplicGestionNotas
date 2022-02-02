package generalClasses;

public class Ciclo {
	
	//attributes
	private String idGrupo;
	private Alumno [] alumnosCiclo = new Alumno [10];
	private Modulo [] modulosCiclo ;
	private static int contador;
	
	
	//constructor
	
	public Ciclo( ) {
		this.contador=0;
		
		for(int i=0;i<alumnosCiclo.length;i++) {
			this.alumnosCiclo[i]= new Alumno ("UNREGISTERED NAME","UNREGISTERED LASTNAME","UNREGISTERED DNI");
		}
	}
		
	
	//methods

	public void asignarNotas( ) {
		
		System.out.println("Introduzca el DNI del alumno: ");
		String dni=Console.readString();
		System.out.println("Introduzca el nombre del modulo (ED/ING/FOL/BD/PROG/SINF/LM): ");
		String nombreModulo=Console.readString();
		System.out.println("Introduzca la nota de la primera evaluación: ");
		float notaEvaluacion1=Console.readFloat();
		System.out.println("Introduzca la nota de la segunda evaluación: ");
		float notaEvaluacion2=Console.readFloat();
		System.out.println("Introduzca la nota de la tercera evaluación: ");
		float notaEvaluacion3=Console.readFloat();
		float notas [] = {notaEvaluacion1,notaEvaluacion2,notaEvaluacion3};
		
		for(int i=0;i<alumnosCiclo.length;i++)
		if ( dni.equals(this.alumnosCiclo[i].getDni())) {
			for (int j=0; j<this.alumnosCiclo[i].getModulo().length;j++) {
				if( nombreModulo.equals(this.alumnosCiclo[i].getModulo()[j].getNombreModulo())) {
					this.alumnosCiclo[i].getNotasAlumno()[j].setNotas(notas);
				}
			}
		}
	}
	
	//Methods
	public void registrarAlumno() {
		
		if(this.contador<=alumnosCiclo.length-1) {
			System.out.println("Introduce el nombre del Alumno "+(this.contador+1)+": ");
			alumnosCiclo[this.contador].setNombre(Console.readString());
			System.out.println("Introduce los apellidos del Alumno: ");
			alumnosCiclo[this.contador].setApellidos(Console.readString());
			System.out.println("Introduce el DNI del Alumno: ");
			alumnosCiclo[this.contador].setApellidos(Console.readString());
			this.contador++;
		}
		
		else
		{
			System.out.println("No quedan plazas.");
		}
	}
	
	
	//Metodo que muestra notas de un alumno Dado su DNI
	public void mostrarNotasAlumno() {
		System.out.println("De que alumno deseas ver sus notas? (Introduce DNI): ");
		String dni=Console.readString();
		
		System.out.println("De que asignatura deseas saber sus notas? (ED/ING/FOL/BD/PROG/SINF/LM): ");
		String nombreModulo=Console.readString();
	
		
		for(int i=0;i<this.alumnosCiclo.length;i++)
		{
			if(dni.equals(alumnosCiclo[i].getDni())) {
				for (int j=0;j<alumnosCiclo[i].getModulo().length;j++) {
					if(alumnosCiclo[i].getModulo()[j].getNombreModulo().equals(nombreModulo)) {
						System.out.println("Nombre alumno: "+alumnosCiclo[i].getNombre());
						System.out.println("Asignatura:"+alumnosCiclo[i].getModulo()[j].getNombreModulo());
						
						System.out.println("Primera Evaluación: "+alumnosCiclo[i].getNotasAlumno()[j].getNotas()[0]); 
						System.out.println("Segunda Evaluación: "+alumnosCiclo[i].getNotasAlumno()[j].getNotas()[1]); 
						System.out.println("Tercera Evaluación: "+alumnosCiclo[i].getNotasAlumno()[j].getNotas()[2]); 
					}
					else
						System.out.println("No se han encontrado notas para ese modulo");
						
				}
			}else
				System.out.println("No se ha podido alumno con ese DNI");
		}
		
	}
	
	
	
	
	//getters & setters

	public void setIdGrupo (String idGrupo) {
		this.idGrupo=idGrupo;
	}
	
	
}
