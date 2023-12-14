package estruturasDedaos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pilha = new  LinkedList<String> ();
		Scanner leia = new Scanner(System.in);
		int  contador=0; 
		int opcao=0; 
		String livro;
		
		
		System.out.println(" Escreva uma opcao===================\n"+
				"1 para adicionar livro na pilha\n"+
				"2 para mostrar a  pilha\n"+
				"3 para retirar livro da pilha");
		
		while (contador==0);
		System.out.println("Escolha uma opção:");
		
		switch (opcao) {
			case 1 :
			System.out.println("Adicione um livro na pilha");
			livro = leia.nextLine();
			pilha.add(livro); 
			break;
			
			case 2 :
			System.out.println(pilha);			
			break;
			
			case 3:
			System.out.println("O livro foi removido"+pilha.poll());
			break;
			
			case 0:				
				System.out.println("O programa será finalizado");
				contador++;
				
			default :
				System.out.println("Opção invalida");
				
		
			
		}
		
		
		
		
	}
	

}
