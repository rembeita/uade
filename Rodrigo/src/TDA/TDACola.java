package TDA;

public interface TDACola 
{
	/** estructura inicializada */
	/** Guarda un elemento al final de la cola */
	public void encolar (int valor);
	/**Elimina el primer elemento de la cola */
	public void desencolar();
	/**obtiene el primer elemento de la cola*/
	public int primerElemento();
	/**Devuelve verdadero si la cola esta vacia*/
	public boolean colaVacia();
	/**Inicia la cola */
	public void inicializarCola();
	/**Imprimir cola*/
	public void imprimirCola();
}
