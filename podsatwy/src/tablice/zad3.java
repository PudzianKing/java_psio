package tablice;

import java.util.Scanner;
import java.util.Random;

public class zad3 {
	
	public static Scanner cin;
	
	public static void load_0(){
		for(int i=0;i<index;i++){
			tab[i]=0;
		}
	}
	
	public static void load_r(int z1,int z2){
		for(int i=0;i<tab.length;i++){
			tab[i]=(rng.nextInt(z1))-z2;
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
	
	public static int suma_p(){
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]%2==0)
			suma+=tab[i];
		}
		return suma;
	}
	public static int suma_np(){
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]%2!=0)
			suma+=tab[i];
		}
		return suma;
	}
	
public static int suma_d(){
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]>0)
			suma+=tab[i];
		}
		return suma;
	}
	public static int suma_u(){
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]%2<0)
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
	
	public static int index=10;
	public static int[]tab=new int[index];
	public static Random rng;
	
	public static void main(String[] args) {
		cin = new Scanner(System.in);
		rng = new Random();
		load_0();
		load_r(200,100);
		out();
		System.out.println("oto suma dodatnich: "+suma_d());
		System.out.println("oto suma ujemnych: "+suma_u());
	}
	
}
