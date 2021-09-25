package PrimerModulo;

public class Persona {
	protected String nombre;
	private double estatura;
	private int edad;
	private double peso;
	private int ci;
	
	public Persona() {
		estatura = 1.7;
		edad = 19;
		peso= 60;
		nombre = "NN";
	}
	
	public Persona(String nombre, double estatura, int edad, double peso, int ci) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
		this.peso = peso;
		this.ci = ci;
	}

	public Persona(String nnn) {
		nombre = nnn;
		estatura = 1.9;
	}
	public Persona(int ci) {
		this.ci = ci;
		estatura = 1.9;
	}
	public Persona(int edad, int ci) {
		this.edad = edad;
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad>5 && edad<100)
			this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	public void caminar() {
		System.out.println("Soy " + nombre + " y  estoy caminando");
	}
	
}
