package com.uninter;

import java.util.Random;

public class ComputadorB extends Computador {

	public void jogar(Tabuleiro tab) {
		
		int linha;
		int coluna;
		
		
		if ((tab.mat[1][1] == "O" && tab.mat[2][2] == "O" && tab.mat[0][0] == " ")
                ||(tab.mat[0][1] == "O" && tab.mat[0][2] == "O" && tab.mat[0][0] == "-")
                ||(tab.mat[1][0] == "O" && tab.mat[2][0] == "O" && tab.mat[0][0] == "-")) {
           linha = 0;
           coluna = 0;
           tab.mat[linha][coluna] = sinal;
       }

       else if ((tab.mat[0][0] == "O" && tab.mat[2][0] == "O" && tab.mat[1][0] == "-")
                ||(tab.mat[1][1] == "O" && tab.mat[1][2] == "O" && tab.mat[1][0] == "-")) {
           linha = 1;
           coluna = 0;
           tab.mat[linha][coluna] = sinal;
       }

       else if ((tab.mat[0][0] == "O" && tab.mat[1][0] == "O" && tab.mat[2][0] == "-")
                ||(tab.mat[2][1] == "O" && tab.mat[2][2] == "O" && tab.mat[2][0] == "-")
                ||(tab.mat[1][1] == "O" && tab.mat[0][2] == "O" && tab.mat[2][0] == "-")) {
           linha = 2;
           coluna = 0;
           tab.mat[linha][coluna] = sinal;
       }

       else if ((tab.mat[0][0] == "O" && tab.mat[0][2] == "O" && tab.mat[0][1] == "-")
               ||(tab.mat[2][1] == "O" && tab.mat[1][1] == "O" && tab.mat[0][1] == "-")) {
           linha = 0;
           coluna = 1;
           tab.mat[linha][coluna] = sinal;
       }
       else if ((tab.mat[0][0] == "O" && tab.mat[2][2] == "O" && tab.mat[1][1] == "-")
                ||(tab.mat[2][0] == "O" && tab.mat[0][2] == "O" && tab.mat[1][1] == "-")
                ||(tab.mat[0][1] == "O" && tab.mat[2][1] == "O" && tab.mat[1][1] == "-")
                ||(tab.mat[1][0] == "O" && tab.mat[1][2] == "O" && tab.mat[1][1] == "-")) {
           linha = 1;
           coluna = 1;
           tab.mat[linha][coluna] = sinal;
       }

       else if ((tab.mat[2][0] == "O" && tab.mat[2][2] == "O" && tab.mat[2][1] == "-")
                ||(tab.mat[1][1] == "O" && tab.mat[0][1] == "O" && tab.mat[2][1] == "-")) {
           linha = 2;
           coluna = 1;
           tab.mat[linha][coluna] = sinal;
       }

       else if ((tab.mat[0][0] == "O" && tab.mat[0][1] == "O" && tab.mat[0][2] == "-")
                ||(tab.mat[1][1] == "O" && tab.mat[2][0] == "O" && tab.mat[0][2] == "-")
                ||(tab.mat[1][2] == "O" && tab.mat[2][2] == "O" && tab.mat[0][2] == "-")) {
           linha = 0;
           coluna = 2;
           tab.mat[linha][coluna] = sinal;
       }

       else if ((tab.mat[1][1] == "O" && tab.mat[1][0] == "O" && tab.mat[1][2] == "-")
                ||(tab.mat[0][2] == "O" && tab.mat[2][2] == "O" && tab.mat[1][2] == "-")) {
           linha = 1;
           coluna = 2;
           tab.mat[linha][coluna] = sinal;
       }

       else if ((tab.mat[0][0] == "O" && tab.mat[1][1] == "O" && tab.mat[2][2] == "-")
               ||(tab.mat[1][2] == "O" && tab.mat[0][2] == "O" && tab.mat[2][2] == "-")
               ||(tab.mat[2][1] == "O" && tab.mat[2][0] == "O" && tab.mat[2][2] == "-")) {
           linha = 2;
           coluna = 2;
           tab.mat[linha][coluna] = sinal;
}
       else {
    	   Random random = new Random();
            linha = random.nextInt(3);
            coluna = random.nextInt(3);

           if (tab.mat[linha][coluna] == "-") {
           tab.mat[linha][coluna] = sinal;
           }
           else {
               jogar(tab);
           }
       }
	}

}
