package examenFinal;
Cara polla puedes leerme????

import java.util.Arrays;

public class Examen1 {

	public static void main(String[] args) {
		int a[]=new int[10], b[]=new int[10], c[]=new int[10];
		
		for(int i=0; i<a.length;i++) {
			a[i]=(int)(Math.random()*30);
		}
		for(int i=0; i<a.length;i++) {
			b[i]=(int)(Math.random()*30);
		}
		for(int i=0; i<a.length;i++) {
			c[i]=(int)(Math.random()*30);
		}
		for(int i=0; i<a.length;i++) {
			if(a[i]==b[i]||a[i]==c[i]) {
				a[i]=(int)(Math.random()*30);
			}
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]||a[i]==b[j]||a[i]==c[j]) {
				a[i]=(int)(Math.random()*30);
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}
}
