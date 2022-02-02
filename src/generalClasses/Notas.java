package generalClasses;

public class  Notas {
	
	//attributes
	private float notas []= new float[3];
	
	
	//methods
	
	public void rellenarNotas(float notaEvaluacion1, float notaEvaluacion2, float notaEvaluacion3) {
		this.notas[0]=notaEvaluacion1;
		this.notas[1]=notaEvaluacion2;
		this.notas[2]=notaEvaluacion3;
		
	}
	
	//toString
	
	public String toString () {
		return "Notas:"+notas[0]+", "+notas[1]+", "+notas[2];  
	}
	
	//getters & setters
	
	public void setNotas(float [] notas) {
		this.notas=notas;
	}
	public float [] getNotas () {
		return this.notas;
	}
	
	
}
