package generalClasses;

public class Alumno {
	
	//attributes
		private String nombre;
		private String apellidos;
		private String dni;
		private Modulo modulosAlumno []=new Modulo [7];
		private Notas notasAlumno []= new Notas [7];
	
	//constructor
	public Alumno (String nombre, String apellidos, String dni) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		
		
		for (int i=0; i< notasAlumno.length;i++) {
			notasAlumno[i] = new Notas();
		}
		
		
			this.modulosAlumno[0]= new Modulo("ED");
			this.modulosAlumno[1]= new Modulo("SINF");
			this.modulosAlumno[2]= new Modulo("PROG");
			this.modulosAlumno[3]= new Modulo("FOL");
			this.modulosAlumno[4]= new Modulo("LM");
			this.modulosAlumno[5]= new Modulo("BD");
			this.modulosAlumno[6]= new Modulo("ING");
			
		
		
		
		
	}
	
	
	//methods
	
		public void matriculaModulo(Modulo modulo, int posicionModulo) {
			if (posicionModulo<7)
				this.modulosAlumno[posicionModulo]=modulo;
			else
				System.out.println("Lo sentimos, ha alcanzado el n?mero m?ximo de matr?culas.");		
		}
		

		//Metodo para asignar notas a cada asignatura, una a una por nombre
		/*public void asignaNotas(float notasEvaluacion1, float notasEvaluacion2, float notasEvaluacion3,  String nombreAsignatura) {
			for (int i=0;i<modulosAlumno.length;i++) {
				if( modulosAlumno[i].getNombreModulo()==nombreAsignatura)
						notasAlumno[i].rellenarNotas(notasEvaluacion1, notasEvaluacion2, notasEvaluacion3);
			}
		}*/
		
		//Metodo que muestra todas las asignaturas en las que esta matriculado un alumno
		public void mostrarAsignaturas() {
			System.out.println("\nAsignaturas:");
			for(int i=0;i<modulosAlumno.length;i++)
				System.out.println(modulosAlumno[i].getNombreModulo());
		}
		
		//Metodo que muestra la nota de una asignatura segun su nombre
		public void mostrarNotas(String nombreAsignatura) {
			for(int i=0;i<modulosAlumno.length;i++) {
				if( nombreAsignatura.equals(modulosAlumno[i].getNombreModulo()))
					System.out.println(notasAlumno[i]);
				}
			
		}
		
		
	//toString
		public String toString() {
			return "Nombre: "+this.nombre+
					"\nApellidos:  "+this.apellidos+
					"\nDNI: "+this.dni;
		}
		
		
	//Getters & setters
	
		public String getNombre() {
			return this.nombre;
		}
		
		public String getApellidos() {
			return this.apellidos;
		}
		
		public String getDni() {
			return this.dni;
		}
		
		public Modulo [] getModulo() {
			return this.modulosAlumno;
		}
		
		
		public Notas [] getNotasAlumno() {
			return this.notasAlumno;
		}
		
		
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		
		public void setApellidos(String apellidos) {
			this.apellidos=apellidos;
		}
		
		public void setDni(String dni) {
			this.dni=dni;
		}
}
