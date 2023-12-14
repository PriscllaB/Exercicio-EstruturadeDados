package estruturasDedaos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio__1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<String> fila = new  LinkedList<String> ();
		Scanner leia = new Scanner(System.in);
		int  contador=0; 
		int opcao; 
		String cliente;
		
		System.out.println(" Escreva uma opcao===================\n"+
				"1 para adicionar cliente na fila\n"+
				"2 para mostrar a lista de clientes\n"+
				"3 para retirar cliente da fila");
		
		while (contador==0) {
			System.out.println("Escolha uma opção");
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1:
				
				System.out.println("Adicione um novo cliente na fila ");
				cliente=leia.next();
				fila.add(cliente);
				break;
			case 2:
				System.out.println(fila);
				break;
			case 3:
				System.out.println("O cliente :" + fila.poll()+ "foi retirado da fila ");
			case 0 :
				System.out.println("O programa sera finalizado");
				contador++;
				
			break;
			
			default:
				System.out.println("Opção invalida!");
				
				
	
				
				
				
			
			}
		}
		
		
	}

}
