package tablice;

import java.util.Scanner;
import java.util.Random;

public class zad4 {
	
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
	
public static int suma_z(int z1,int z2){
		
		int suma=0;
		for(int i=z1;i<z2;i++){
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
	
	public static void out_2(){
		for(int i=0;i<tab.length;i++){
			System.out.printf("%4d",tab[i]);
			if((i+1)%5==0)
				System.out.println();
		}
		System.out.println();
	}
	
	public static int index=25;
	
	public static int[]tab=new int[index];
	
	public static Random rng;
	
	public static int ind=5;
	
	public static void main(String[] args) {
		cin = new Scanner(System.in);
		rng = new Random();
		load_0();
		load_r(10,0);
		out_2();
		System.out.println("oto suma: "+suma());
		
		
	
	}
	
}