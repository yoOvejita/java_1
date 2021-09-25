package PrimerModulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Comentario de una sola linea
		
		// TODO Comentario de una sola linea para remarcar tareas a hacer (TO DO)
		
		/*
		  comentario de
		  múltiples líneas
		*/
		
		System.out.println(2 + 2);//Mostrando datos en la consola/terminal
		
		int nutella;//Declaración de una variable (tipo entero)
		
		nutella = 2203040; //Asignación de un valor a una veriable
		
		float flotante =5.6f;//Declaración e inicialización de una variable (tipo flotante)
		
		double doble = 5.6;//Tipo de dato double (doble presición)
		
		boolean valor = true;
		
		String texto = "El numero telefonico es: ";//Asignación de una cadena
		
		//Mostrando distintos tipos de datos en consola/terminal
		System.out.println(nutella);
		System.out.println(flotante);
		System.out.println(doble);
		System.out.println(texto + nutella);
		System.out.println(valor);
		valor = false;
		System.out.println(valor);
		
		//Operaciones aritméticas entre variables
		doble = 4;
		double doble2 = 3.1415;
		double resultado = doble / doble2;
		//El casteo (cast) para reducir presición numérica
		float resultadoF = (float) (doble / doble2);
		int resultadoE = (int) (doble / doble2);
		
		//Entendiendo que hay varios tipos de divisiones (entre enteros, flotantes y doubles)
		int num = 302;
		int num2 = 400;
		int  res = num / num2;
		float resf = num / num2;
		double resd = num / num2;
		
		/******************************************
		 *               SELECTIVOS               *
		 ******************************************
		 */
		System.out.println("Ya inició la selectiva.");
		if(num == 3) {
			System.out.println("Se cumple la condición.");
			num = 0;
		}
			
		System.out.println("Ya acabó la selectiva y num tiene valor: " + num);
		
		/*******************************************
		 *               SELCETIVA                 *
		 *                COMPLETA                 *
		 ******************************************* 
		 */
		System.out.println("Ya inició la selectiva completa.");
		if(num == 3) {
			System.out.println("Se cumple la condición.");
			num = 0;
		}else {
			num = -1;
		}
			
		System.out.println("Ya acabó la selectiva completa y num tiene valor: " + num);
		
		int rr = 4 + 6 - 3 * 3;
		
		/********************************************************
		 * 				PRIORIDAD DE OPERADORES					*
		 * ******************************************************
		 * 			()   			Parentesis     				*
		 * 			^    			Potencia					*
		 * 		  * / %  			Mult/Div/Mod 				*
		 *      +       -  			Sum/Resta					*
		 *     ---------->			Misma prioridad: izq a der	*
		 *******************************************************/
		
		System.out.println("ES: " +rr);
		if((num > 5 || num2 > -1) && doble == 7) {
			//
		}
		
		/****************************************************
		 * 					ANIDAMIENTO						*
		 ***************************************************/
		
		int dia = 1;//lunes; 2= martes, etc.
		dia = 4;
		
		if(dia == 1)
			System.out.println("Lunes");
		else if(dia == 2)
			System.out.println("Martes");
		else {
			if(dia == 3) {
				System.out.println("Miercoles");
			}else {
				if(dia == 4) {
					System.out.println("Jueves");
				}else {
					if(dia == 5) {
						System.out.println("Viernes");
					}else {
						if(dia == 6) {
							System.out.println("Sábado");
						}else {
							if(dia == 7) {
								System.out.println("Domingo");
							}else {
								System.out.println("No es un dia de la semana");
							}
						}
					}
				}
			}
		}
		System.out.println("FIN Anidamiento, viene Switch");
		
		switch(dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("No es un día de la semana");
				break;
		}
		
		/************************************************
		 *		 Lectura de datos desde terminal		*
		 ***********************************************/
		
		String nombre = "";
		Scanner leer = new Scanner(System.in);
		
		//System.out.println("Ingrese su nombre porfavor");
		//nombre = leer.nextLine();
		//System.out.println("¡Hola " + nombre + "!");
		
		System.out.println("Ingrese numero 1:");
		int numero1 = leer.nextInt();
		//System.out.println("Ingrese numero 2:");
		int numero2 = 5;//leer.nextInt();
		int resp = numero1 + numero2;
		System.out.println("La suma es: " + resp);
		
		/********************************************
		 ********************************************
		 * 			ITERACIONES (BUCLES)			*
		 ********************************************
		 *******************************************/
		
		
		/********************************************
		 * 			WHILE (mientras)				*
		 *******************************************/
		if(resp > 10)
			System.out.println("Es mayor a 10");
		else
			System.out.println("Es menor o igual a 10");
		System.out.println("Fin de la ejecucion");
		
		while(resp > 1) {
			System.out.println("Estoy vivo >:D");
			resp = resp - 1;
		}
		System.out.println("Jajaja se murió.");
		
		/********************************************
		 * 			DO WHILE (hacer mientras)		*
		 *******************************************/
		resp = 8;
		do {
			System.out.println("Estoy en el DO - WHILE");
			resp--;//resp = resp - 1;
		}while(resp > 5);
		
		/********************************************
		 * 				  FOR (para)				*
		 *******************************************/
		int i;
		for(i=0; i<10; i++) {
			System.out.println("En FOR: "+ i);
			if(5 > 2) {
				
			}else {
				for(int j= 1; j<4;j++) {
					
				}
			}
		}
		System.out.println("Este es i: "+ i);
		
		/********************************************
		 ********************************************
		 * 					MÉTODOS					*
		 ********************************************
		 *******************************************/
		
		//Método que no devuelve nada
		saludo();
		
		//Método que devuleve un valor
		String txt = obtenerSaludo();
		System.out.println(txt);
		
		//Método que recibbe parámetros
		decirEdad(18);
		restar(15,4);
		int r = sumar(14,6);
		System.out.println("La suma es: " + r);
		
		mostrarInformacion("Pepe", 21, 1.8, 59.2);
		mostrarInformacion("Asd3456", 5600, 1.79, 234);
		/********************************************
		 ********************************************
		 * 	  PROGRAMACIÓN ORIENTADA A OBJETOS		*
		 ********************************************
		 *******************************************/
		Persona p = new Persona();
		p.setNombre("Pepe");
		System.out.println(p.getNombre() + ", " + p.getEdad());
		
		Persona q = new Persona();
		q.setNombre("Ana");
		p.caminar();
		q.caminar();
		
		Persona q2 = new Persona("Pepito");
		Persona q3 = new Persona(20, 123456);
		System.out.println(q2.getNombre() + ", " + p.getCi());
		
		//Herencia
		
		Estudiante est1;
		est1 = new Estudiante();
		est1.setNombre("Diana");
		est1.caminar();
		Estudiante est2 = new Estudiante(654321, false);
		est2.caminar();
		
		Estudiante est3 = new Estudiante(131313, false, "Erick", "Ya volví.");
		est3.decirAntiguedad();
		est3.estudiar();
		
		Persona personaX = q3;
		Persona personaY = est3;
		est3.caminar();
		((Persona)est3).caminar();
		//Estudiante estX = (Estudiante) q;//error de cast
		((Estudiante)personaY).estudiar();
		
	}

	private static void mostrarInformacion(String nombre, int edad, double estatura, double peso) {
		String msg = "Nombre: ";
		msg += nombre;
		msg += ", edad: " + edad;
		msg += ", tiene una estatura de: " + estatura + " metros";
		msg += " y su peso es de " + peso + "Kg.";
		System.out.println(msg);
	}

	private static int sumar(int n1, int n2) {
		//int resultado = n1 + n2;
		return n1 + n2;
	}

	private static void restar(int num1, int num2) {
		System.out.println("La resta es: " + (num1 - num2));
	}

	private static void decirEdad(int edad) {
		System.out.println("Tu edad es " + edad);
	}

	private static String obtenerSaludo() {
		String hola = "Hola a todos!!!";
		return hola;
	}

	private static void saludo() {
		String hola = "Hola a todos!";
		System.out.println(hola);
	}

	

}
