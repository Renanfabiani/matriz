package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int [][]mat = new int [n][n];//criando a matriz
		
		for (int i =0; i<n;i++) {//para linha
			for(int j=0;j<mat[i].length;j++){//para coluna
				mat[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length;i++) {
			System.out.print(mat [i][i] + " ");//vai ficar linha 0 coluna 0... 1 1 e 2 2
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length;i++) {
			for (int j = 0; j<mat[i].length;j++) {
				if(mat[i][j] < 0)
					count ++;//para contar os numeros negativos
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		sc.close();
		
		
		
		
	}

}
