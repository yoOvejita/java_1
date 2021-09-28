package otrasClases;

abstract class Personita {
	public abstract String decirNombre(String nom, String ap);
	public abstract void caminar();
	public void hablar() {
		System.out.println("Hola, estoy hablando");
	}
}
