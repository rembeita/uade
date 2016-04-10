package Algoritmos;
import Implementacion.ColaPrioridadEstatica;
import Implementacion.ColaEstatica;

import TDA.TDACola;
import TDA.TDAColaPrioridad; 

public class AlgoColaPrioridad 
{
	public void ConvierteEnColaConPrioridad(TDACola cola_comun, TDAColaPrioridad cola_prioridad)
	{
		int cant_valor = 0;
		int elemento;
		ProcesosCola procesos_cola = new ProcesosCola();
		TDACola trabajo_cola = new ColaEstatica();
		trabajo_cola.inicializarCola();
		procesos_cola.pasarColas(cola_comun, trabajo_cola);
		while (!trabajo_cola.colaVacia())
		{
			elemento = trabajo_cola.primerElemento();
			cant_valor = procesos_cola.cantidadDeUnElemento(trabajo_cola, elemento);
			cola_prioridad.acolar(elemento, cant_valor);
			procesos_cola.eliminarElementoEnCola(trabajo_cola, elemento);

		}
	}
	
	public boolean ColaPrioritariasIdenticas(TDAColaPrioridad cola_prioridad1, TDAColaPrioridad cola_prioridad2)
	{
		boolean resultado = true;
		TDAColaPrioridad trabajo_prioridad1 = new ColaPrioridadEstatica();
		TDAColaPrioridad trabajo_prioridad2 = new ColaPrioridadEstatica();
		trabajo_prioridad1.inicializar();
		trabajo_prioridad2.inicializar();
		this.pasarColasPrioridad(cola_prioridad1, trabajo_prioridad1);
		this.pasarColasPrioridad(cola_prioridad2, trabajo_prioridad2);
		
		while (!cola_prioridad1.colaVacia())
		{
			if (cola_prioridad1.primero() != cola_prioridad2.primero() 
			|| cola_prioridad1.prioridad() != cola_prioridad2.prioridad())
			{
				return false;
				
			}
			cola_prioridad1.desacolar();
			cola_prioridad2.desacolar();
			
		}
		
		return resultado;
		
	}
	
	public void pasarColasPrioridad(TDAColaPrioridad origen, TDAColaPrioridad destino)
	{
		TDAColaPrioridad trabajo = new ColaPrioridadEstatica();
		trabajo.inicializar();
		int elemento,prioridad;
		while (!origen.colaVacia())
		{
			elemento = origen.primero();
			prioridad = origen.prioridad();
			trabajo.acolar(elemento, prioridad);
			destino.acolar(elemento, prioridad);
			
			origen.desacolar();
		}
		while (!trabajo.colaVacia())
		{
			elemento = trabajo.primero();
			prioridad = trabajo.prioridad();
			origen.acolar(elemento, prioridad);
			trabajo.desacolar();
		}
	}
	
	public TDAColaPrioridad combinarColas(TDAColaPrioridad cola_prioridad1, TDAColaPrioridad cola_prioridad2)
	{
		int elemento, prioridad;
		TDAColaPrioridad cola_combinada = new ColaPrioridadEstatica();
		TDAColaPrioridad trabajo_prioridad1 = new ColaPrioridadEstatica();
		TDAColaPrioridad trabajo_prioridad2 = new ColaPrioridadEstatica();
		trabajo_prioridad1.inicializar();
		trabajo_prioridad2.inicializar();
		cola_combinada.inicializar();
		this.pasarColasPrioridad(cola_prioridad1, trabajo_prioridad1);
		this.pasarColasPrioridad(cola_prioridad2, trabajo_prioridad2);
		while (!trabajo_prioridad1.colaVacia())
		{
			elemento = trabajo_prioridad1.primero();
			prioridad = trabajo_prioridad1.prioridad();
			cola_combinada.acolar(elemento, prioridad);
			trabajo_prioridad1.desacolar();
		}
		
		while (!trabajo_prioridad2.colaVacia())
		{
			elemento = trabajo_prioridad2.primero();
			prioridad = trabajo_prioridad2.prioridad();
			cola_combinada.acolar(elemento, prioridad);
			trabajo_prioridad2.desacolar();
		}
		
		return cola_combinada;
	}
	
	
}
