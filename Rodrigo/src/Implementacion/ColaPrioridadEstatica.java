package Implementacion;
import TDA.TDAColaPrioridad;

public class ColaPrioridadEstatica implements TDAColaPrioridad 
{	
	private int cantidad;
	private int[] valores;
	private int[] prioridad;
	
	@Override
	public void inicializar() 
	{
		// TODO Auto-generated method stub
		valores = new int[100];
		prioridad = new int[100];
		cantidad = 0;
	}

	@Override
	public void desacolar() 
	{
		// TODO Auto-generated method stub
		for (int j= 0; j < cantidad-1; j++)
		{
			valores[j] = valores[j+1];
			prioridad[j] =prioridad[j+1];
		}
		cantidad--;
	}

	@Override
	public void acolar(int valor, int prioridad) 
	{
		int i=0;
		// TODO Auto-generated method stub
		for (i = 0; i < cantidad; i++)
		{
			if ( prioridad > this.prioridad[i] )
			{
				break;
			}
			
		}
		//System.out.println("este es i: " + i );
		//System.out.println("cantidad: " + cantidad);
		
		if ( i < cantidad)
		{
			for (int j = cantidad; j > i ; j--)
			{
			//System.out.println("entre: " + j );
				this.prioridad[j] = this.prioridad[j-1];
				this.valores[j] = this.valores[j-1];
			}
		}
		//System.out.println("no entre: " + i );
		this.prioridad[i] = prioridad;
		this.valores[i] = valor;
		cantidad++;

	}

	@Override
	public int prioridad() {
		// TODO Auto-generated method stub
		return prioridad[0];
	}

	@Override
	public int primero() {
		// TODO Auto-generated method stub
		return valores[0];
	}

	@Override
	public boolean colaVacia() {
		// TODO Auto-generated method stub
		return cantidad == 0;
	}

}
