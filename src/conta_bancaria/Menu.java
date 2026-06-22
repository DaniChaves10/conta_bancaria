package conta_bancaria; 

import java.util.Scanner;
import conta_bancaria.model.Conta;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String opcao;
		
		/* Instanciar Objetos da Classe Conta */
		
		Conta c1 = new Conta(1, 123, 1, "Daniel", 200000.00f);
		c1.visualizar();
		
		Conta c2 = new Conta(2, 123, 2, "Thiago", 100000.00f);
		c2.visualizar();
		
		/* Alteração do Saldo */
		c1.setSaldo(300000.00f);
		c1.setTitular("Daniel Araujo");
		c1.visualizar();
		
		// if ternário
		// condição ? ação se for verdadeiro : ação se for falso
		
		System.out.println("Sacar R$ 1.000,00 da conta C2: " + (c2.sacar(1000.00f) ? "Saque efetuado com sucesso!" : "Saldo Insuficiente"));
		c2.visualizar();
		
		System.out.println("Sacar R$ 300.000,00 da conta C2: " + (c2.sacar(300000.00f) ? "Saque efetuado com sucesso!" : "Saldo Insuficiente"));
		c2.visualizar();
		
		// Depósito na Conta c2
		
		c2.depositar(50000.00f);
		c2.visualizar();
		
		System.out.println("                                                     ");
		System.out.println("                    BANCO DO BRAZIL                  ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar Conta                          ");
		System.out.println("            2 - Listar todas as Contas               ");
		System.out.println("            3 - Buscar Conta por Numero              ");
		System.out.println("            4 - Atualizar Dados da Conta             ");
		System.out.println("            5 - Apagar Conta                         ");
		System.out.println("            6 - Sacar                                ");
		System.out.println("            7 - Depositar                            ");
		System.out.println("            8 - Transferir valores entre Contas      ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");

		while (true) {

			System.out.print("Entre com a opção desejada: "); 
			
			opcao = leia.next().trim(); 

			if (opcao.equals("0")) {
				System.out.println("\nBanco do Brazil - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case "1":
					System.out.println("Criar Conta\n\n");
					break;
				case "2":
					System.out.println("Listar todas as Contas\n\n");
					break;
				case "3":
					System.out.println("Consultar dados da Conta - por número\n\n");
					break;
				case "4":
					System.out.println("Atualizar dados da Conta\n\n");
					break;
				case "5":
					System.out.println("Apagar a Conta\n\n");
					break;
				case "6":
					System.out.println("Saque\n\n");
					break;
				case "7":
					System.out.println("Depósito\n\n");
					break;
				case "8":
					System.out.println("Transferência entre Contas\n\n");
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Daniel Araujo");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conta_bancaria");
		System.out.println("*********************************************************");
	}
}