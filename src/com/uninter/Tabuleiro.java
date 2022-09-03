package com.uninter;

public class Tabuleiro {
	public String mat[][] = new String[3][3];

	public Tabuleiro() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = "-";
			}
		}
	}

	public void visualizar() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int situacao() {
        if ((mat[0][0] == "X" && mat[1][1] == "X" && mat[2][2] == "X")
                 ||(mat[0][0] == "X" && mat[0][1] == "X" && mat[0][2] == "X")
                 ||(mat[0][0] == "X" && mat[1][0] == "X" && mat[2][0] == "X")
                 ||(mat[1][0] == "X" && mat[1][1] == "X" && mat[1][2] == "X")
                 ||(mat[2][0] == "X" && mat[2][1] == "X" && mat[2][2] == "X")
                 ||(mat[2][0] == "X" && mat[1][1] == "X" && mat[0][2] == "X")
                 ||(mat[0][2] == "X" && mat[1][2] == "X" && mat[2][2] == "X")
                 ||(mat[0][1] == "X" && mat[1][1] == "X" && mat[2][1] == "X")) {
            return 1;
        } else if ((mat[0][0] == "O" && mat[1][1] == "O" && mat[2][2] == "O")
                 ||(mat[0][0] == "O" && mat[0][1] == "O" && mat[0][2] == "O")
                 ||(mat[0][0] == "O" && mat[1][0] == "O" && mat[2][0] == "O")
                 ||(mat[1][0] == "O" && mat[1][1] == "O" && mat[1][2] == "O")
                 ||(mat[2][0] == "O" && mat[2][1] == "O" && mat[2][2] == "O")
                 ||(mat[2][0] == "O" && mat[1][1] == "O" && mat[0][2] == "O")
                 ||(mat[0][2] == "O" && mat[1][2] == "O" && mat[2][2] == "O")
                 ||(mat[0][1] == "O" && mat[1][1] == "O" && mat[2][1] == "O")) {
            return 2;
        } else if (mat[0][0] != "-" && mat[0][1] != "-" && mat[0][2] != "-" && mat[1][0] != "-" && mat[1][1] != "-"
                && mat[1][2] != "-" && mat[2][0] != "-" && mat[2][1] != "-" && mat[2][2] != "-") {
            return 3;
        } else {
            return 0;
        }
    }

}
