package tablice2;

import java.util.Scanner;
import java.util.Random;

public class zad4 {
	
	public static Scanner cin;
	
	public static void load_0(int tab[]){	//wype�nienie tablicy zerami
		for(int i=0;i<index;i++){
			tab[i]=0;
		}
	}
	
	public static void load_r(int tab[],int z1,int z2){	//wype�nienie tablicy losowo z przedzia�u z1-z2
		for(int i=0;i<tab.length;i++){
			tab[i]=(rng.nextInt(z1))-z2;
		}
	}
	
	public static void load(int tab[]){	//wype�nienie tablicy przez u�ytkownika
		for(int i=0;i<tab.length;i++){
			System.out.println("Podaj liczbe "+(i+1));
			tab[i]=cin.nextInt();
		}
	}
	
	public static int suma(int tab[]){	//suma ca�ej tablicy
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			suma+=tab[i];
		}
		return suma;
	}
	
	public static int suma_z(int tab[],int z1,int z2){	//suma tablicy z zakrsu indeks�w z1 do z2
		
		int suma=0;
		for(int i=z1;i<z2;i++){
			suma+=tab[i];
		}
		return suma;
	}
	
	public static int suma_p(int tab[]){	//suma parzystych liczb w tablicy
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]%2==0)
			suma+=tab[i];
		}
		return suma;
	}
	
	public static int suma_np(int tab[]){	//suma nieparzystych liczb w tablicy
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]%2!=0)
			suma+=tab[i];
		}
		return suma;
	}
	
	public static int suma_d(int tab[]){ //suma dodatnich liczb w tablicy
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]>0)
			suma+=tab[i];
		}
		return suma;
	}

	public static int suma_u(int tab[]){ //suma ujemnych liczb w tablicy
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]<0)
			suma+=tab[i];
		}
		return suma;
	}
	
	public static int suma_d_i(int tab[]){ //ilosc dodatnich liczb w tablicy
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]>0)
			suma++;
		}
		return suma;
	}

	public static int suma_u_i(int tab[]){ //ilosc ujemnych liczb w tablicy
		
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]<0)
			suma++;
		}
		return suma;
	}
	
	public static int suma_w_2(int tab[],int n){ //suma liczb w wierszu tablicy
		int suma=0;
		for(int i=0;i<ind;i++){
			suma+=tab[i+(n*ind)];	
		}
		return suma;
	}
	
	public static int suma_w_w(int tab[],int t){ //suma liczb w wierszu tablicy podzielnych przez liczbe podana
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]%t==0){
				suma++;
			}
		}
		return suma;
	}
	
	public static int suma_w_n(int tab[],int t){ //suma liczb w wierszu tablicy nie podzielnych przez liczbe podana
		int suma=0;
		for(int i=0;i<tab.length;i++){
			if(tab[i]%t!=0){
				suma++;
			}
		}
		return suma;
	}
	
	public static int suma_k_2(int tab[],int n){ //suma liczb w kolumnie tablicy
		
		int suma=0;
		suma+=tab[n];
		for(int i=1;i<ind;i++){
			suma+=tab[n+ind*i];	
		}
		return suma;
	}
	
	public static void out(){ //wypisanie tablicy w postaci jedon wymiarowej
		for(int i=0;i<tab.length;i++){
			System.out.printf("%4d",tab[i]);
		}
		System.out.println();
	}
	
	public static void out_2(){	//wypisanie tablicy w postaci dwu wymiarowej
		for(int i=0;i<tab2.length;i++){
			System.out.printf("%4d",tab2[i]);
			if((i+1)%5==0)
				System.out.println();
		}
		System.out.println();
	}
	
	public static void sort(int tab[]){	//sortowanie ca�ej tablicy
		
		int p;
		for(int j=0;j<tab.length-1;j++){
			for(int i=0;i<tab.length-1;i++){
				p=tab[i];
				if(tab[i]>tab[i+1]){
					tab[i]=tab[i+1];
					tab[i+1]=p;
				}
				 
				
			}
		}
	}
	
	public static void sort_z(int tab[]){	//zamina pierwszego elementu z ostatnim elementem tablicy
		
		int p;
			for(int i=0;i<(tab.length-1)/2;i++){
				p=tab[i];
				tab[i]=tab[tab.length-1-i];
				tab[tab.length-1-i]=p;
			}
		
	}
	
	public static void sort_z_2(int tab[]){	//zamina pierwszego elementu z ostatnim elementem tablicy
		
		int p;
			for(int i=0;i<tab.length-1;i+=2){
				p=tab[i];
				tab[i]=tab[i+1];
				tab[i+1]=p;
			}
		
	}
	
	public static void sort_w_2(int tab[],int n){	//sortowanie ca�ej tablicy
		
		int p;
		for(int j=0;j<ind-1;j++){
			for(int i=0;i<ind-1;i++){
				p=tab[i+(ind*n)];
				if(tab[i+(ind*n)]>tab[i+1+(ind*n)]){
					tab[i+(ind*n)]=tab[i+1+(ind*n)];
					tab[i+1+(ind*n)]=p;
				}
				 
				
			}
		}
	}

	public static int index=5;//pierwszy wymiar tablicy
	public static int ind=5;//drugi wymiar tablicy
	public static int index2=index*ind;
	public static int[]tab=new int[index];
	public static int[]tab2=new int[index2];
	public static Random rng;
	
	
	public static void main(String[] args) {
		cin = new Scanner(System.in);
		rng = new Random();
		load_0(tab2);
		load_r(tab2,100,0);
		out_2();
		
		for(int i=0;i<ind;i++){
			sort_w_2(tab2,i);
		}
		out_2();
	
	}
	
}
