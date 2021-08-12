package aulasJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2); //Adiciona n�mero 2 na posi��o 0 da lista
		minhaLista.add(1); //Adiciona n�mero 1 na posi��o 1 da lista
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos); //Percorre todos os elementos do ArrayList
		}
		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();
		
		minhaLista.remove(0); //Remove o elemento da posi��o 0 e ajusta as posi��es
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0); //Pega o elemento da posi��o 0
		
		System.out.println("\nO primeiro elemento � " + primeiroElemento);

		System.out.println();
		
		for(int i=0; i < minhaLista.size(); i++) { //size = verifica o tamanho da lista // Semelhante ao Lenght
			System.out.println("\nElemento: " + minhaLista.get(i));
		}
		
		Collections.sort(minhaLista); // Coloca em ordem crescente os itens da ArrayList
		System.out.println("\nDepois de ordenado...");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>(); //Cria��o de um objeto do tipo Set instanciado para HashSet
	
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(5);
		meuSet.add(2);
		meuSet.add(5);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) { //percorre o iterator at� a ultima posi��o
			System.out.println(iMeuSet.next()); //Dispara o pr�ximo elemento do meu iterator
			
		}
	}
}
