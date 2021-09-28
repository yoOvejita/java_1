package otrasClases;

final class Colegial extends Personita{
	int peso;
	final int edad = 15;
	@Override
	public String decirNombre(String nom, String ap) {
		return "Soy el colegial " +nom +" " + ap;
	}

	@Override
	public void caminar() {
		System.out.println("Abran paso al futuro del pais");
	}
	
}
