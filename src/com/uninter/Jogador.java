package com.uninter;

import java.util.Scanner;

public class Jogador {
	private static Scanner sc = new Scanner(System.in);
	String nome;
	String sinal = "X";
	public Jogador(String nome) {
		this.nome = nome;
	}
	public void jogar(Tabuleiro tab) {
        System.out.print("Linha de 1 a 3: ");
        int linha = sc.nextInt();
        System.out.print("Coluna de 1 a 3: ");
        int coluna = sc.nextInt();
        if (tab.mat[linha-1][coluna-1] == "-") {//o valor -1 tem o intúito de fazer com que o valor de linhas e colunas das matrizes sejam a partir de 1 e não 0 como é de padrão
            tab.mat[linha-1][coluna-1] = sinal;  
        } else {
            System.out.println("Você deve jogar em um espaço livre, digite novamente a posição desejada:");
            jogar(tab);
        }
    }
	public String getNome() {
		
		return nome;
	}
	
	

}

