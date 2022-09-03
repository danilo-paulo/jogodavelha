package com.uninter;

public class ComputadorC extends Computador {

	public void jogar(Tabuleiro tab) {

		int linha;
		int coluna;

		if ((tab.mat[1][1] == "X" && tab.mat[2][2] == "X" && tab.mat[0][0] == " ")
				|| (tab.mat[0][1] == "X" && tab.mat[0][2] == "X" && tab.mat[0][0] == "-")
				|| (tab.mat[1][0] == "X" && tab.mat[2][0] == "X" && tab.mat[0][0] == "-")) {
			linha = 0;
			coluna = 0;
			tab.mat[linha][coluna] = sinal;
		}

		else if ((tab.mat[0][0] == "X" && tab.mat[2][0] == "X" && tab.mat[1][0] == "-")
				|| (tab.mat[1][1] == "X" && tab.mat[1][2] == "X" && tab.mat[1][0] == "-")) {
			linha = 1;
			coluna = 0;
			tab.mat[linha][coluna] = sinal;
		}

		else if ((tab.mat[0][0] == "X" && tab.mat[1][0] == "X" && tab.mat[2][0] == "-")
				|| (tab.mat[2][1] == "X" && tab.mat[2][2] == "X" && tab.mat[2][0] == "-")
				|| (tab.mat[1][1] == "X" && tab.mat[0][2] == "X" && tab.mat[2][0] == "-")) {
			linha = 2;
			coluna = 0;
			tab.mat[linha][coluna] = sinal;
		}

		else if ((tab.mat[0][0] == "X" && tab.mat[0][2] == "X" && tab.mat[0][1] == "-")
				|| (tab.mat[2][1] == "X" && tab.mat[1][1] == "X" && tab.mat[0][1] == "-")) {
			linha = 0;
			coluna = 1;
			tab.mat[linha][coluna] = sinal;
		} else if ((tab.mat[0][0] == "X" && tab.mat[2][2] == "X" && tab.mat[1][1] == "-")
				|| (tab.mat[2][0] == "X" && tab.mat[0][2] == "X" && tab.mat[1][1] == "-")
				|| (tab.mat[0][1] == "X" && tab.mat[2][1] == "X" && tab.mat[1][1] == "-")
				|| (tab.mat[1][0] == "X" && tab.mat[1][2] == "X" && tab.mat[1][1] == "-")) {
			linha = 1;
			coluna = 1;
			tab.mat[linha][coluna] = sinal;
		}

		else if ((tab.mat[2][0] == "X" && tab.mat[2][2] == "X" && tab.mat[2][1] == "-")
				|| (tab.mat[1][1] == "X" && tab.mat[0][1] == "X" && tab.mat[2][1] == "-")) {
			linha = 2;
			coluna = 1;
			tab.mat[linha][coluna] = sinal;
		}

		else if ((tab.mat[0][0] == "X" && tab.mat[0][1] == "X" && tab.mat[0][2] == "-")
				|| (tab.mat[1][1] == "X" && tab.mat[2][0] == "X" && tab.mat[0][2] == "-")
				|| (tab.mat[1][2] == "X" && tab.mat[2][2] == "X" && tab.mat[0][2] == "-")) {
			linha = 0;
			coluna = 2;
			tab.mat[linha][coluna] = sinal;
		}

		else if ((tab.mat[1][1] == "X" && tab.mat[1][0] == "X" && tab.mat[1][2] == "-")
				|| (tab.mat[0][2] == "X" && tab.mat[2][2] == "X" && tab.mat[1][2] == "-")) {
			linha = 1;
			coluna = 2;
			tab.mat[linha][coluna] = sinal;
		}

		else if ((tab.mat[0][0] == "X" && tab.mat[1][1] == "X" && tab.mat[2][2] == "-")
				|| (tab.mat[1][2] == "X" && tab.mat[0][2] == "X" && tab.mat[2][2] == "-")
				|| (tab.mat[2][1] == "X" && tab.mat[2][0] == "X" && tab.mat[2][2] == "-")) {
			linha = 2;
			coluna = 2;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[1][1] == "-") {
			linha = 1;
			coluna = 1;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[0][0] == "-") {
			linha = 0;
			coluna = 0;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[0][2] == "-") {
			linha = 0;
			coluna = 2;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[2][0] == "-") {
			linha = 2;
			coluna = 0;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[1][0] == "-") {
			linha = 1;
			coluna = 0;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[0][1] == "-") {
			linha = 0;
			coluna = 1;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[1][2] == "-") {
			linha = 1;
			coluna = 2;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[2][1] == "-") {
			linha = 2;
			coluna = 1;
			tab.mat[linha][coluna] = sinal;
		} else if (tab.mat[2][2] == "-") {
			linha = 2;
			coluna = 2;
			tab.mat[linha][coluna] = sinal;
		}

	}

}
