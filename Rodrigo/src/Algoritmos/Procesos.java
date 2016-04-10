package Algoritmos;
import Implementacion.PilaEstatica;
import TDA.TDAPila;

public class Procesos 
{
	public int contar_pila(TDAPila pila)
	{
		TDAPila trabajo = new PilaEstatica();
		trabajo.inicializar();
		int valor;
		int contador = 0;
		while (!pila.pilaVacia())
		{
			contador++;
			valor = pila.tope();
			pila.desapilar();
			trabajo.apilar(valor);
		}
		while(!trabajo.pilaVacia())
		{
			valor = trabajo.tope();
			pila.apilar(valor);
			trabajo.desapilar();
		}
		return contador;
	}

	public int suma_pila(TDAPila pila)
	{
		TDAPila trabajo = new PilaEstatica();
		trabajo.inicializar();
		int valor;
		int sumador = 0;
		while (!pila.pilaVacia())
		{
			valor = pila.tope();
			sumador = sumador + valor;
			pila.desapilar();
			trabajo.apilar(valor);
		}
		while(!trabajo.pilaVacia())
		{
			valor = trabajo.tope();
			pila.apilar(valor);
			trabajo.desapilar();
		}
		return sumador;
	}

	
	
	
	
	public TDAPila invertir(TDAPila pila)
	{
		TDAPila resultado = new PilaEstatica();
		TDAPila trabajo = new PilaEstatica();
		resultado.inicializar();
		trabajo.inicializar();
		int valor;
		while (!pila.pilaVacia())
		{
			valor = pila.tope();
			pila.desapilar();
			resultado.apilar(valor);
			trabajo.apilar(valor);
		}
		while(!trabajo.pilaVacia())
		{
			valor = trabajo.tope();
			pila.apilar(valor);
			trabajo.desapilar();
		}
		return resultado;
	}

	public void imprimir_pila(TDAPila pila)
	{
		TDAPila trabajo = new PilaEstatica();
		trabajo.inicializar();
		int valor;
		while (!pila.pilaVacia())
		{
			valor = pila.tope();
			System.out.println(valor);
			pila.desapilar();
			trabajo.apilar(valor);
		}
		while(!trabajo.pilaVacia())
		{
			valor = trabajo.tope();
			pila.apilar(valor);
			trabajo.desapilar();
		}
		
	}

	
	public float promedio(TDAPila pila)
	{
		TDAPila trabajo = new PilaEstatica();
		trabajo.inicializar();
		int cantidad = 0;
		int suma = 0;
		int valor;
		float resultado = 0;
		while (!pila.pilaVacia())
		{
			valor = pila.tope();
			suma = suma + pila.tope(); 
			cantidad++;
			pila.desapilar();
			trabajo.apilar(valor);
		}
		if ( cantidad > 0)
		{
			resultado =  (float) suma / cantidad;
		}

		while(!trabajo.pilaVacia())
		{
			valor = trabajo.tope();
			pila.apilar(valor);
			trabajo.desapilar();
		}
		return resultado;

	}
	
	public TDAPila copiar(TDAPila pila)
	{
		TDAPila resultado = new PilaEstatica();
		TDAPila trabajo = new PilaEstatica();
		resultado.inicializar();
		trabajo.inicializar();
		int valor;
		while (!pila.pilaVacia())
		{
			valor = pila.tope();
			pila.desapilar();
			trabajo.apilar(valor);
		}
		while(!trabajo.pilaVacia())
		{
			valor = trabajo.tope();
			resultado.apilar(valor);
			pila.apilar(valor);
			trabajo.desapilar();
		}
		return resultado;
	}

	public TDAPila ordenar(TDAPila pila)
	{
		TDAPila resultado = new PilaEstatica();
		resultado.inicializar();
		int valor = pila.tope();
		pila.desapilar();	
		boolean lanzando=true;
		while (lanzando)
		{
			if (pila.pilaVacia())
			{
				lanzando = false;
			}
			if (resultado.pilaVacia())
			{
				resultado.apilar(valor);
			}			
			else if (valor <= resultado.tope())
			{
				resultado.apilar(valor);	
			}			
			else
			{
				pila.apilar(resultado.tope());
				resultado.desapilar();
				pila.apilar(valor);
			}
			if (!pila.pilaVacia())
			{
				lanzando = true;
				valor = pila.tope();
				pila.desapilar();
			}
		}
		resultado.apilar(valor);
		System.out.println("Este es valor: "+ valor);
		
		return resultado;
	}
}

