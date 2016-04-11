package Test;

import Algoritmos.AlgoConjunto;
import Implementacion.ConjuntoEstatico;
import TDA.TDAConjunto;

public class PruebasTDAConjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean respuesta;
		System.out.println("############Prueba Conjuntos###########");
		TDAConjunto primerconjunto = new ConjuntoEstatico();
		TDAConjunto segundoconjunto = new ConjuntoEstatico();
		primerconjunto.inicializar();
		segundoconjunto.inicializar();
		primerconjunto.agregar(5);
		primerconjunto.agregar(15);
		primerconjunto.agregar(25);
		segundoconjunto.agregar(5);
		segundoconjunto.agregar(15);
		segundoconjunto.agregar(25);
		AlgoConjunto algo_conjunto = new AlgoConjunto();
		respuesta = algo_conjunto.comparo(primerconjunto, segundoconjunto);
		System.out.println("Los conjuntos son iguales? " + respuesta); 
	}

}
