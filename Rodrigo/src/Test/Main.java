package Test;
import java.util.Random;

import Implementacion.ColaPrioridadEstatica;
import TDA.TDAColaPrioridad;

public class Main 
{
	public static void main(String[] args) 
	{
		/*
		// TODO Auto-generated method stub
		System.out.println("Cargando Pila");
		TDAPila mipila = new PilaEstatica();
		TDAPila otrapila;
		TDAPila pila_inversa;
		int rta;
		float rta_float;
		
		Random rand = new Random();
		int num_aleatorio,max=20, min=0, valorpilavieja, valorpilanueva;
		float imprimir_resultado= 0;
		mipila.inicializar();
		Procesos proceso = new Procesos();
		System.out.println("-");
		
		for(int i=0; i < 5; i++)
		{
			num_aleatorio = rand.nextInt(max-min)+min;
		//	System.out.println(num_aleatorio);
			mipila.apilar(num_aleatorio);
		}
		
		System.out.println("Esta es mi pila:");
		pila_inversa = proceso.invertir(mipila);
		proceso.imprimir_pila(mipila);
		System.out.println("Esta es mi pila inversa:");
		proceso.imprimir_pila(pila_inversa);
		System.out.println("Contar elementos:");
		rta = proceso.contar_pila(mipila);
		System.out.println(rta);
		
		System.out.println("Sumador de elementos:");
		rta = proceso.suma_pila(mipila);
		System.out.println(rta);
		
		System.out.println("Promedio:");
		rta_float = proceso.promedio(mipila);
		System.out.println(rta_float);
		
		
		mipila.apilar(12);
		System.out.println("12");
		mipila.apilar(16);
		System.out.println("16");
		mipila.apilar(17);
		System.out.println("17");
		mipila.apilar(4);
		System.out.println("4");
		mipila.apilar(2);
		System.out.println("2");

		System.out.println("-");
		
		//System.out.println("tope pila vieja: " + mipila.tope());
		Procesos copiapila = new Procesos();
		otrapila = copiapila.copiar(mipila);
		//System.out.println("tope pila nueva: " + otrapila.tope());
		
		//imprimir_resultado = proceso.promedio(mipila);
		//System.out.println("Promedio de la pila: " + imprimir_resultado);
		mipila = copiapila.ordenar(mipila);
		
		//otrapila.tope();
		
		#####################################################################
*/		/*		
		TDACola micola = new ColaEstatica();
		micola.inicializarCola();
		TDACola micoladestino = new ColaEstatica();
		micoladestino.inicializarCola();
		
		ProcesosCola proceso_cola = new ProcesosCola();
		
		Random rand = new Random();
		int num_aleatorio,max=20, min=0;
		int rta;
		
		for(int i=0; i < 5; i++)
		{
			num_aleatorio = rand.nextInt(max-min)+min;
			System.out.println(num_aleatorio);
			micola.encolar(num_aleatorio);
			
		}
		
		System.out.println("Mi primer elemento");
		rta = micola.primerElemento();
		System.out.println(rta);
		
		proceso_cola.pasarColas(micola, micoladestino);
		
		System.out.println("Mi primer elemento de mi cola");
		rta = micola.primerElemento();
		System.out.println(rta);
		
		System.out.println("Mi primer elemento de mi cola destino");
		rta = micoladestino.primerElemento();
		System.out.println(rta);
			
		System.out.println("###########Invertir cola con pilas #####################");
	    proceso_cola.invertirColas(micola);
	    micola.imprimirCola();
		System.out.println("Invierto cola");
		rta = micola.primerElemento();
		//System.out.println(rta);
		System.out.println("################################");
		micola.imprimirCola();
	
		
		System.out.println("############Invertir cola sin pilas####################");
		micola.imprimirCola();
		System.out.println("Invierto cola");
		proceso_cola.invertirColas_sinpilas(micola);
//		rta = micola.primerElemento();
		//System.out.println(rta);
		System.out.println("################################");
	//	micola.imprimirCola();
		
		System.out.println("############Chequear fin de cola####################");
		TDACola colaprueba1 = new ColaEstatica();
		colaprueba1.inicializarCola();
		TDACola colaprueba2 = new ColaEstatica();
		colaprueba2.inicializarCola();
		boolean imprimir_resultado;
		ProcesosCola proceso_cola = new ProcesosCola();
		Random rand = new Random();
		int num_aleatorio,max=20, min=0;
		for(int i=0; i < 5; i++)
		{
			num_aleatorio = rand.nextInt(max-min)+min;
			System.out.println(num_aleatorio);
			colaprueba1.encolar(num_aleatorio);
			colaprueba2.encolar(num_aleatorio);
		}
		imprimir_resultado = proceso_cola.checkFinCola(colaprueba1, colaprueba2);
		System.out.println("los ultimos elementos son iguales? " + imprimir_resultado);
		System.out.println("################################");
	
		
		System.out.println("############Es capicua####################");
		TDACola colaprueba1 = new ColaEstatica();
		colaprueba1.inicializarCola();
		
		boolean imprimir_resultado;
		ProcesosCola proceso_cola = new ProcesosCola();
		
		colaprueba1.encolar(3);
		colaprueba1.encolar(6);
		colaprueba1.encolar(3);
		colaprueba1.encolar(6);
		colaprueba1.encolar(3);
		
		imprimir_resultado = proceso_cola.escapicua(colaprueba1);
		System.out.println("Es Capicua? " + imprimir_resultado);
		System.out.println("################################");
		
		
		
		/*
		
		System.out.println("############Chequear fin inverso####################");
		TDACola colaprueba1 = new ColaEstatica();
		colaprueba1.inicializarCola();
		TDACola colaprueba2 = new ColaEstatica();
		colaprueba2.inicializarCola();
		boolean imprimir_resultado;
		ProcesosCola proceso_cola = new ProcesosCola();
		
		colaprueba1.encolar(5);
		colaprueba1.encolar(3);
		colaprueba1.encolar(6);
		colaprueba1.encolar(9);
		colaprueba1.encolar(1);
		
		colaprueba2.encolar(1);
		colaprueba2.encolar(6);
		colaprueba2.encolar(6);
		colaprueba2.encolar(3);
		colaprueba2.encolar(5);
		
		imprimir_resultado = proceso_cola.checkColaInversa(colaprueba1, colaprueba2);
		System.out.println("Cola1 y Cola2 es inversa? " + imprimir_resultado);
		System.out.println("################################");
		
		*/
		
		
		System.out.println("############Cola Prioritaria####################");
		int primerValor, primeraPrioridad;
		TDAColaPrioridad colaPrioridad = new ColaPrioridadEstatica();
		colaPrioridad.inicializar();
		colaPrioridad.acolar(5, 5);
		colaPrioridad.acolar(4, 4);
		colaPrioridad.acolar(2, 2);
		colaPrioridad.acolar(1, 1);
		
		primerValor = colaPrioridad.primero();
		primeraPrioridad = colaPrioridad.prioridad();
		
		System.out.println("PrimerValor:  "+ primerValor + " Prioridad: " + primeraPrioridad);
		System.out.println("Esta vacia? " + colaPrioridad.colaVacia());

		colaPrioridad.desacolar();
		primerValor = colaPrioridad.primero();
		primeraPrioridad = colaPrioridad.prioridad();

		System.out.println("PrimerValor:  "+ primerValor + " Prioridad: " + primeraPrioridad);

	}
	
}


