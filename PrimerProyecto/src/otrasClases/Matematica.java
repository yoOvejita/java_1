package otrasClases;

public class Matematica {
	public static int potencia(int x, int n) {
		int res = 1;
		
		for(int i = 0; i < n ; i++) {
			res *= x;
		}
		return res;
	}
}
