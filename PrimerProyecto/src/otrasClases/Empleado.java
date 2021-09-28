package otrasClases;

public class Empleado extends Personita implements SerHumano, Mamifero {

	@Override
	public String decirNombre(String nom, String ap) {
		String msj = "Soy el empleado " + nom + " " + ap;
		return msj;
	}

	@Override
	public void caminar() {
		System.out.println("Soy un empleado caminado.");
	}

	@Override
	public void respirar() {
		System.out.println("Soy ser humano y respiro por ello");
	}

	@Override
	public String[] derechos() {
		String arr[] = new String[3];
		arr[0] = "Derecho a la vida";
		arr[1] = "Derecho al agua";
		arr[2] = "Derecho a la salud";
		
		return arr;
	}

	@Override
	public void metodoMisterioso(String a, int b) {
		System.out.println(a + " "+b);
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int cantidadOjos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
