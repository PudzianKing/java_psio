package tablice;

import java.util.Scanner;

public class zad1 {
	
	public static void load_0(){
		for(int i=0;i<=tab.length;i++){
			tab[i]=0;
		}
	}
	
	public static void load(){
		for(int i=0;i<=tab.length;i++){
			System.out.println("Podaj liczbe "+i);
			tab[i]=cin.nextInt();
			System.out.println(tab[i]);
		}
	}
	
	public static int suma(int[]tab){
		tab=new int[5];
		int suma=0;
		for(int i=0;i<=tab.length;i++){
			suma+=tab[i];
		}
		return suma;
	}
	
	public static Scanner cin;
	
	public static int[]tab=new int[5];
	
	public static void main(String[] args) {
		load_0();
		load();
		for(int i=0;i<=tab.length;i++){
			System.out.printf("%4d",tab[i]);
		}
		System.out.println("oto suma: "+suma(tab));	
		
		
		
		
		/*int l=0;
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				tab[i][j]=l++;
			}
		}
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				System.out.print(tab[i][j]+" ");
			}
			System.out.println();
		}*/
	}
	
}
