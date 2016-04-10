package Test;
import TDA.TDACola;
import TDA.TDAColaPrioridad;
import Implementacion.*;
import Algoritmos.*;

public class TPEjercicio6 
{

	public static void main(String[] args) 
	{
		/*
		// TODO Auto-generated method stub
		System.out.println("#####Convertir una Cola en una cola Priorizada ######");
		int dato=0;
		TDACola nueva_cola = new ColaEstatica();
		TDAColaPrioridad nueva_cola_prioridad = new ColaPrioridadEstatica();
		nueva_cola_prioridad.inicializar();
		nueva_cola.inicializarCola();
		nueva_cola.encolar(4);
		nueva_cola.encolar(2);
		nueva_cola.encolar(1);
		nueva_cola.encolar(4);
		nueva_cola.encolar(2);
		nueva_cola.encolar(2);
		nueva_cola.encolar(3);
		nueva_cola.encolar(4);
		nueva_cola.encolar(5);
		nueva_cola.encolar(1);
		nueva_cola.encolar(4);
		
		AlgoColaPrioridad algo_cola_prioridad = new AlgoColaPrioridad();
		algo_cola_prioridad.ConvierteEnColaConPrioridad(nueva_cola, nueva_cola_prioridad);
		while (!nueva_cola_prioridad.colaVacia())
		{
			System.out.println("elem: " + nueva_cola_prioridad.primero());
			System.out.println("prioridad: " + nueva_cola_prioridad.prioridad());
			System.out.println("#########");
			nueva_cola_prioridad.desacolar();
		}
		*/
		/*
		System.out.println("#####Comparar Colas Priorizadas ######");
		boolean respuesta=false;
		TDAColaPrioridad nueva_cola_prioridad1 = new ColaPrioridadEstatica();
		TDAColaPrioridad nueva_cola_prioridad2 = new ColaPrioridadEstatica();
		nueva_cola_prioridad1.inicializar();
		nueva_cola_prioridad2.inicializar();
		nueva_cola_prioridad1.acolar(4,4 );
		nueva_cola_prioridad2.acolar(4,4 );
		nueva_cola_prioridad1.acolar(2,3 );
		nueva_cola_prioridad2.acolar(2,3 );
		nueva_cola_prioridad1.acolar(1,2 );
		nueva_cola_prioridad2.acolar(1,2 );
		nueva_cola_prioridad1.acolar(3,1 );
		nueva_cola_prioridad2.acolar(3,1 );
		nueva_cola_prioridad1.acolar(5,1 );
		nueva_cola_prioridad2.acolar(5,1 );
		AlgoColaPrioridad algo_cola_prioridad = new AlgoColaPrioridad();
		respuesta = algo_cola_prioridad.ColaPrioritariasIdenticas(nueva_cola_prioridad1, nueva_cola_prioridad2);
		System.out.println("La respuesta fue: " + respuesta);
	*/
		System.out.println("#####Comparar Colas Priorizadas ######");
		boolean respuesta=false;
		TDAColaPrioridad nueva_cola_prioridad1 = new ColaPrioridadEstatica();
		TDAColaPrioridad nueva_cola_prioridad2 = new ColaPrioridadEstatica();
		TDAColaPrioridad nueva_cola_combinada = new ColaPrioridadEstatica();
		nueva_cola_prioridad1.inicializar();
		nueva_cola_prioridad2.inicializar();
		nueva_cola_combinada.inicializar();
		nueva_cola_prioridad1.acolar(4,4 );
		nueva_cola_prioridad2.acolar(8,4 );
		nueva_cola_prioridad1.acolar(2,3 );
		nueva_cola_prioridad2.acolar(9,3 );
		nueva_cola_prioridad1.acolar(1,2 );
		nueva_cola_prioridad2.acolar(10,2 );
		nueva_cola_prioridad1.acolar(3,1 );
		nueva_cola_prioridad2.acolar(11,1 );
		nueva_cola_prioridad1.acolar(5,1 );
		nueva_cola_prioridad2.acolar(12,1 );
		AlgoColaPrioridad algo_cola_prioridad = new AlgoColaPrioridad();
		nueva_cola_combinada = algo_cola_prioridad.combinarColas(nueva_cola_prioridad1, nueva_cola_prioridad2);
		System.out.println("termino el proceso");
		while (!nueva_cola_combinada.colaVacia())
		{
			System.out.println("elemento:  "+ nueva_cola_combinada.primero());
			System.out.println("prioridad: "+ nueva_cola_combinada.prioridad());
			nueva_cola_combinada.desacolar();
		}
	}

}
