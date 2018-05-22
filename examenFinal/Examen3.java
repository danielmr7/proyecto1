package examenFinal;

import java.util.Arrays;

public class Examen3 {

	public static void main(String[] args) {
		int array[][]=new int[10][10], aux[]=new int[10], aux2[]=new int[10];
		int minimo=Integer.MAX_VALUE, maximo=Integer.MIN_VALUE;
		for (int i=0;i<array.length;i++) {
			for(int j= 0; j<array.length; j++) {
			array[i][j]=(int)(Math.random()*10);
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		for (int i=0;i<array.length;i++) {
			int filas=0;
			for(int j= 0; j<array.length; j++) {
				filas+=array[i][j];
			}
			System.out.println("La fila " +(i+1)+ " suma " +filas);
		}
			//intento de ordenar filas
		for (int i=0;i<array.length;i++) {
			int filas=0;
			for(int j= 0; j<array.length; j++) {
				filas+=array[i][j];
			}
				if (filas>maximo) {
					aux=array[i];
				}
				if (filas<minimo) {
					aux2=array[i];
				}
		
		}
		array[0]=aux2;
		array[9]=aux;
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]));
	}
	}
}