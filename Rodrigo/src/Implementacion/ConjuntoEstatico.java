package Implementacion;

import TDA.TDAConjunto;
import java.util.Random;


public class ConjuntoEstatico implements TDAConjunto {

	private int cantidad;
	private int[] valores;
	
	@Override
	public void agregar(int valor) 
	{
		// TODO Auto-generated method stub
		if (!pertenece(valor))
		{
			valores[cantidad] = valor;
			cantidad++;
		}
	}

	@Override
	public void sacar(int valor) 
	{
		// TODO Auto-generated method stub
		for (int i=0; i < cantidad; i++)
		{
			if(valor == valores[i])
			{
				valores[i] =valores[cantidad-1];
				cantidad--;
				break;
			}
		}
	}

	@Override
	public int elegir() 
	{
		// TODO Auto-generated method stub

		Random r = new Random();
		return valores[r.nextInt(cantidad)];
		
	}

	@Override
	public boolean pertenece(int valor) 
	{
		// TODO Auto-generated method stub
		for (int i =0; i < cantidad; i++)
		{
			if (valor == valores[i])
			{
				return true;
			}
			
		}
		return false;
	}

	@Override
	public void inicializar() 
	{
		// TODO Auto-generated method stub
		cantidad =0;
		valores = new int[100];
	}

	@Override
	public boolean conjuntoVacio() 
	{
		// TODO Auto-generated method stub
		return cantidad == 0;
	}

}
