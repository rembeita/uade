package TDA;

public interface TDAConjunto 
{
	/** inicializada */
	public void agregar (int valor);
	
	/** inicializada */
	public void sacar (int valor);
	
	/** inicializada y no vacia */
	public int elegir ();
	
	/** inicializada */
	public boolean pertenece (int valor);
	
	
	public void inicializar ();
	
	/** inicializada */
	public boolean conjuntoVacio ();
	
}
