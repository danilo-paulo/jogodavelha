package com.uninter;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro(); 

		Scanner sc = new Scanner(System.in);
		System.out.println(" :::   Jogo da velha   ::: ");
		System.out.print("Insira seu nome: ");
		String nome = sc.nextLine();

		Jogador jogador = new Jogador(nome);// Variavel para a qual ser� atribuida o nome do jogador

		System.out.print("Escolha a dificuldade 1,2 ou 3:  ");
		int opcao = sc.nextInt();
		Computador comp = null;
		if (opcao == 1) {// Estrutura condicional com o intu�to de verificar qual a dificuldade desejada de jogo
			comp = new ComputadorA();// Cpu joga aleatoriamente
		} else if (opcao == 2) {
			comp = new ComputadorB();// Cpu com mecanismos de vit�ria
		} else if (opcao == 3) {
			comp = new ComputadorC();// Cpu com padr�es avan�ados de movimentos
		}

		int vencedor = tab.situacao(); // Vari�vel vencedor sob qual ser� aplicado o m�todo para verificar quem venceu
		int vez = 1;
		tab.visualizar();


		while (vencedor == 0) {
			if (vez == 1) {
				jogador.jogar(tab);
				vez++;
			} else {
				comp.jogar(tab);
				vez--;
				tab.visualizar();
			}
			vencedor = tab.situacao();
		}


		switch (vencedor) { //Switch case para verificar quem ganhou e imprimir a mensagem
		case 1:
			tab.visualizar();
			System.out.print(jogador.getNome() + " venceu!");
			break;
		case 2:
			System.out.print("Voc� perdeu!");
			break;
		case 3:
			tab.visualizar();
			System.out.print("Empate!");
			break;
		}

		sc.close();
	}
}