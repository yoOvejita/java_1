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
		System.out.println("Ingrese numero 2:");
		int numero2 = leer.nextInt();
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
		
		/********************************************
		 * 				  FOR (para)				*
		 *******************************************/
		
		
		/********************************************
		 ********************************************
		 * 					MÉTODOS					*
		 ********************************************
		 *******************************************/
		
		/********************************************
		 ********************************************
		 * 	  PROGRAMACIÓN ORIENTADA A OBJETOS		*
		 ********************************************
		 *******************************************/
	}

	

}
