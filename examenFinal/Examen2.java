package examenFinal;

import java.util.Arrays;

public class Examen2 {

	public static void main(String[] args) {
		int array[][]=new int[10][10];
		for (int i=0;i<array.length;i++) {
			for(int j= 0; j<array.length; j++) {
			array[i][j]=(int)(Math.random()*2);
			}
		}
		for (int i=0;i<array.length;i++) {
		System.out.println(Arrays.toString(array[i]));
		}
		for (int i=0;i<array.length;i++) {
			int ceros=0, unos=0;
			for(int j= 0; j<array.length; j++) {
				if (array[i][j]==0) {
					ceros++;
				}
				if (array[i][j]==1) {
					unos++;
				}
			}
			System.out.println("La fila " +(i+1)+ " tiene "+ceros+ " ceros y " +unos+ " unos");
}
}
}