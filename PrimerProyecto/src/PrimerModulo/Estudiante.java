package PrimerModulo;

public class Estudiante extends Persona{
	private int matricula;
	private boolean antiguo;
	
	public Estudiante() {
		matricula = -1;
		antiguo = false;
	}

	public Estudiante(int matricula, boolean antiguo) {
		super();
		this.matricula = matricula;
		this.antiguo = antiguo;
	}

	public Estudiante(String nombre, double estatura, int edad, double peso, int ci) {
		super(nombre, estatura, edad, peso, ci);
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(int mat, boolean ant, String nom, String mensaje) {
		super(nom);
		matricula = mat;
		antiguo = ant;
		System.out.println(mensaje);
	}

	public void decirAntiguedad() {
		if(antiguo) {
			System.out.println("Soy antiguo con todo orgullo.");
		}else {
			System.out.println("Soy nuevo ¿Dónde está mi aula?");
		}
	}
	
	public void estudiar() {
		System.out.println("Soy " + nombre + " y estoy estudiando.");
	}
	
	@Override
	public  void caminar() {
		System.out.println("Soy " + nombre + " y camino jorobadito porque soy estudiante.");
	}
	
}
