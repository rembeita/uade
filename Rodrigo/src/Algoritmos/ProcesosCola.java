package Algoritmos;
import Implementacion.ColaEstatica;
import Implementacion.PilaEstatica;
import TDA.TDACola;
import TDA.TDAPila;

public class ProcesosCola 
{
	//Se pasan una cola origen y una destino, la cola origen se copia en la destino
	public void pasarColas(TDACola origen, TDACola destino)
	{
		TDACola trabajo = new ColaEstatica();
		trabajo.inicializarCola();
		int valor;
		while (!origen.colaVacia())
		{
			valor = origen.primerElemento();
			destino.encolar(valor);
			trabajo.encolar(valor);
			origen.desencolar();
		}
		while (!trabajo.colaVacia())
		{
			valor = trabajo.primerElemento();
			origen.encolar(valor);
			trabajo.desencolar();
		}
	}
	
	public void invertirColas(TDACola origen)
	{
		TDAPila trabajo_pila = new PilaEstatica();
		trabajo_pila.inicializar();
		int valor;
		while (!origen.colaVacia())
		{
			valor = origen.primerElemento();
			trabajo_pila.apilar(valor);
			origen.desencolar();
		}
		while (!trabajo_pila.pilaVacia())
		{
			valor = trabajo_pila.tope();
			origen.encolar(valor);
			trabajo_pila.desapilar();
		}
	}
	
	public void invertirColas_sinpilas(TDACola origen)
	{
		int valor=0, contador=0, acumulador=0, i =0;
		TDACola trabajo = new ColaEstatica();
		TDACola resultado = new ColaEstatica();

		trabajo.inicializarCola();
		resultado.inicializarCola();
		this.pasarColas(origen, trabajo);
		
		while (!trabajo.colaVacia())
		{
			trabajo.desencolar();
			contador++;
		}
		
		while (contador > 0)
		{
			trabajo.inicializarCola();
			this.pasarColas(origen, trabajo);
			acumulador = contador;
			for (i=0; i < acumulador; i++ )
			{
				valor = trabajo.primerElemento();
				trabajo.desencolar();
				
			}
			
			resultado.encolar(valor);
			contador--;
			
		}
		System.out.println("####Imprimir Cola dada vuelta###");
		resultado.imprimirCola();
		this.pasarColas(resultado, origen);
	
	}
	
	public boolean checkFinCola(TDACola cola1, TDACola cola2)
	{
		TDACola copia_cola1 = new ColaEstatica();
		TDACola copia_cola2 = new ColaEstatica();
		boolean resultado=false;
		int ultimo_cola1 = 0, ultimo_cola2 = 0;
		copia_cola1.inicializarCola();
		copia_cola2.inicializarCola();
		
		this.pasarColas(cola1, copia_cola1);
		this.pasarColas(cola2, copia_cola2);
		
		while (!copia_cola1.colaVacia())
		{
			ultimo_cola1 = copia_cola1.primerElemento();
			copia_cola1.desencolar();
		}
		
		while (!copia_cola2.colaVacia())
		{
			ultimo_cola2 = copia_cola2.primerElemento();
			copia_cola2.desencolar();
		}
		
		if ( ultimo_cola1 == ultimo_cola2)
			resultado = true;
		
		return resultado;
	}
	
	public boolean checkColaInversa(TDACola cola1, TDACola cola2)
	{
		TDACola copia_cola1 = new ColaEstatica();
		TDACola copia_cola2 = new ColaEstatica();
		TDAPila cola2_inversa = new PilaEstatica();
		
		int compara_cola1 = 0, compara_pila2 = 0, valor=0;
		copia_cola1.inicializarCola();
		copia_cola2.inicializarCola();
		cola2_inversa.inicializar();
		
		this.pasarColas(cola1, copia_cola1);
		this.pasarColas(cola2, copia_cola2);
		
		while (!copia_cola2.colaVacia())
		{
			valor = copia_cola2.primerElemento();
			cola2_inversa.apilar(valor);
			copia_cola2.desencolar();
		}
		
		while (!copia_cola1.colaVacia())
		{
			compara_cola1 = copia_cola1.primerElemento();
			compara_pila2 = cola2_inversa.tope();
			copia_cola1.desencolar();
			cola2_inversa.desapilar();
			if (compara_cola1 != compara_pila2)
				return false;
		}
		
		return true;
	}
	
	public boolean escapicua(TDACola cola1)
	{
		TDACola copia_cola1 = new ColaEstatica();
		TDACola copia_cola2 = new ColaEstatica();
		TDAPila cola2_inversa = new PilaEstatica();
		int compara_cola1 = 0, compara_pila2 = 0, valor=0;
		copia_cola1.inicializarCola();
		copia_cola2.inicializarCola();
		cola2_inversa.inicializar();
		
		this.pasarColas(cola1, copia_cola1);
		this.pasarColas(cola1, copia_cola2);
		
		while (!copia_cola2.colaVacia())
		{
			valor = copia_cola2.primerElemento();
			cola2_inversa.apilar(valor);
			copia_cola2.desencolar();
		}
		
		while (!copia_cola1.colaVacia())
		{
			compara_cola1 = copia_cola1.primerElemento();
			compara_pila2 = cola2_inversa.tope();
			copia_cola1.desencolar();
			cola2_inversa.desapilar();
			if (compara_cola1 != compara_pila2)
				return false;
		}
		
		return true;
	}
	
	public void eliminarElementoEnCola(TDACola cola, int valor)
	{
		int traspaso;
		TDACola trabajo = new ColaEstatica();
		trabajo.inicializarCola();

		while (!cola.colaVacia())
		{
			traspaso = cola.primerElemento();
			if ( traspaso != valor)
			{
				trabajo.encolar(traspaso);
			}
			cola.desencolar();
		}
		while (!trabajo.colaVacia())
		{
			traspaso = trabajo.primerElemento();
			cola.encolar(traspaso);
			trabajo.desencolar();
		}
	}
	
	public int cantidadDeUnElemento(TDACola cola, int valor)
	{
		int traspaso, resultado=0;
		TDACola trabajo = new ColaEstatica();
		trabajo.inicializarCola();
		this.pasarColas(cola, trabajo);
		while (!trabajo.colaVacia())
		{
			traspaso = trabajo.primerElemento();
			if ( traspaso == valor)
			{
				resultado++;
			}
			trabajo.desencolar();
		}
		
		return resultado;
	}
}
