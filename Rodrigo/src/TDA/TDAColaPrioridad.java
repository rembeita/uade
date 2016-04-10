package TDA;

public interface TDAColaPrioridad 
{
	public void inicializar();
	
	public void desacolar();
	
	public void acolar(int valor, int prioridad);
	
	public int prioridad();
	
	public int primero();
	
	public boolean colaVacia();
	
}
