package PrimerModulo;

public class Persona {
	private String nombre;
	private double estatura;
	private int edad;
	private double peso;
	private int ci;
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
