package Algoritmos;

import TDA.TDAConjunto;

public class AlgoConjunto 
{
	public boolean comparo(TDAConjunto c1, TDAConjunto c2)
	{
		int valor;
		while (!c1.conjuntoVacio())
		{
			valor = c1.elegir();
			if (!c2.pertenece(valor))
			{
				return false;
			}
			c2.sacar(valor);
			c1.sacar(valor);
			
		}
		
		if (c2.conjuntoVacio())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
