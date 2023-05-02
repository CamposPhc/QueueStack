package pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args)  {
		
		
		Scanner ler = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();

		String nome;
		int op = 1;

		while (op != 0) {
			System.out.print("""
	                \n ________________________________________________
	                |                                               |
	                |                                               |
	                |        1 - Adicionar Cliente Na Fila          |
	                |        2 - Listar Todos Clientes              |
	                |        3 - Retirar Cliente da Fila            |
	                |        0 - Sair                               |
	                |                                               |
	                |_______________________________________________|
	                Entre com a opção desejada: """);
			op = ler.nextInt();
			ler.nextLine();
			
			switch (op) {
			case 1:
				System.out.print("Digite um Nome: ");
				nome = ler.nextLine();
				fila.add(nome);

				for (String cliente : fila) {
					System.out.println(cliente);
				}
				System.out.println("Cliente adicionado");

				break;

			case 2:
				if (fila.isEmpty())
					System.out.println("A fila esta vazia!");
				else {
					System.out.println("Lista de clientes:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("A fila esta vazia!");
				else {
					fila.remove();
					System.out.println("fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					} System.out.println("O cliente foi chamado!");
				}
				break;

			case 0:
				System.out.println("O programa foi finalizado!");
				break;

			default: 
				System.out.println("Opção invalida!");
				break;
			}
		}

	}

}