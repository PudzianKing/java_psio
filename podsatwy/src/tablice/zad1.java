package tablice;

import java.util.Scanner;

public class zad1 {
	
	public static Scanner cin;
	
	public static void load_0(){
		for(int i=0;i<index;i++){
			tab[i]=0;
		}
	}
	
	public static void load(){
		for(int i=0;i<tab.length;i++){
			System.out.println("Podaj liczbe "+(i+1));
			tab[i]=cin.nextInt();
		}
	}
	
	public static int suma(){
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			suma+=tab[i];
		}
		return suma;
	}
	
	public static void out(){
		for(int i=0;i<tab.length;i++){
			System.out.printf("%4d",tab[i]);
		}
		System.out.println();
	}
	
	public static int index=5;
	public static int[]tab=new int[index];
	
	public static void main(String[] args) {
		cin = new Scanner(System.in);
		load_0();
		load();
		out();
		System.out.println("oto suma: "+suma());	
		
		
		
		
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
