package testClass;
import generalClasses.*;

public class testClass {
	public static void main (String [] args) {
		int opcion=0;
		Ciclo daw=new Ciclo();
			//Interfaz
			System.out.println("\nBienvenido al sistema de gestion de notas AppGestionNotas.");
			
			//Menu
					while (opcion!=7) {
							System.out.println("\n"
					 		+ "\n1)Registrar un ciclo."
					 		+ "\n2)Registrar un alumno."
					 		+ "\n3)Registrar las notas de un alumno."
					 		+ "\n4)Mostrar notas un alumno."
					 		+ "\n5)Mostrar notas de los alumnos en una asignatura.(aun no disponible)"
					 		+ "\n6)Mostrar notas de los alumnos de todo un grupo.(aun no disponible)"
					 		+" \n\n7)SALIR."
					 		+ "\n\nIntroduzca opción deseada a continuación:");
					 opcion=Console.readInt();
					 	
					 switch(opcion) {
					 		case 1:{
					 			//Genera instancia del ciclo con idGroup por usuario
					 			System.out.println("\nPor favor, introduce un Id de Grupo para tu ciclo.");
					 			daw.setIdGrupo(Console.readString())  ;
					 		}
					 		break;
					 				
					 		case 2:daw.registrarAlumno();
					 		break;
					
					 		case 3:daw.asignarNotas();
					 		break;
					 		
					 		case 4:daw.mostrarNotasAlumno();
					 		break;
					 		
					 		/*case 5:mostrarNotaModulo();
					 		
					 		case 6:mostrarNotasGrupo(;)
					 		break;*/
					 		case 7:
					 		break;
					 		
					 		default:System.out.println("\n\n** Esta opción aún no ha sido implementada**\n");
					 		}
					 	

					}
			
			
			System.out.print("\n\n**¡Gracias por usar nuestro programa!**");
		
			 
			 

			 
		

			 
	
	
	
	
	}

}