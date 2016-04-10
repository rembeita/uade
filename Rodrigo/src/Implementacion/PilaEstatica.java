package Implementacion;
import TDA.TDAPila;

public class PilaEstatica implements TDAPila
{
	private int[] valores;
	private int cantidad;
	public void inicializar()
	{
		valores = new int[100];
		cantidad = 0;
	}
	public boolean pilaVacia()
	{
		return cantidad == 0;
	}
	public int tope()
	{
		return valores[cantidad-1];
	}
	public void apilar(int valor)
	{
		valores[cantidad] = valor;
		cantidad++;
	
	}
	public void desapilar()
	{
		cantidad--;
	}
	
	
}