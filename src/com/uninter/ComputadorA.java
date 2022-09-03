package com.uninter;

import java.util.Random;

public class ComputadorA extends Computador {
	
	public void jogar(Tabuleiro tab) {
		Random random = new Random();
        int linha = random.nextInt(3);
        int coluna = random.nextInt(3);

        if (tab.mat[linha][coluna] == "-") {
        tab.mat[linha][coluna] = sinal;
        }
        else {
            jogar(tab);
        }
	}

}
