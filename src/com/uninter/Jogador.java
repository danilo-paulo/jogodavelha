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
        if (tab.mat[linha-1][coluna-1] == "-") {//o valor -1 tem o int�ito de fazer com que o valor de linhas e colunas das matrizes sejam a partir de 1 e n�o 0 como � de padr�o
            tab.mat[linha-1][coluna-1] = sinal;  
        } else {
            System.out.println("Voc� deve jogar em um espa�o livre, digite novamente a posi��o desejada:");
            jogar(tab);
        }
    }
	public String getNome() {
		
		return nome;
	}
	
	

}

