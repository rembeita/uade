package Implementacion;
import TDA.TDACola;

public class ColaEstatica implements TDACola
{
	private int valores[];
	private int cantidad;
	@Override
	public void inicializarCola() 
	{
		valores = new int[100];
		cantidad = 0;
	}
	@Override
	public void encolar(int valor) 
	{
		valores[cantidad] = valor;
		cantidad++;
	}
	@Override
	public void desencolar() 
	{
		int i = 0;
		while (i < cantidad && cantidad > 1)
		{
			valores[i] = valores[i+1];
			i++;
		}
			
		cantidad--;
	}
	@Override
	public int primerElemento() {
		// TODO Auto-generated method stub
		return valores[0];
	}
	@Override
	public boolean colaVacia() {
		// TODO Auto-generated method stub
		return cantidad==0;
	}
	public void imprimirCola() {
		// TODO Auto-generated method stub
		int i=0;
		for (i=0; i < 5; i++)
		{
			System.out.println(valores[i]);
		}
		
	}
	
	
}
