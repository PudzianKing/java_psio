package funkcje;

import java.util.Scanner;

public class zad2 {
	
	public static int load(String text){	//wypisanie textu i wczytanie inta 
		System.out.println(text);
		return cin.nextInt();
	}
	
	public static void div(int a){	//dzielniki liczby a
		System.out.println("dzialniki : "+a);
		for(int i=1;i<=a/2;i++){
			if(a%i==0){
				System.out.println(i);
			}
		}
	}
	
	public static void minmax(int a,int b,int c){	//segregownie trzech liczb
		int max=0,min=0,sr=0;
		if(a<b)
		{
			max=b;
			min=a;
		}	
		else
		{
			max=a;
			min=b;
		}	
		if(c>max)
		{
			sr=max;
			max=c;
		}
		else
			if(c<min)
			{
				sr=min;
				min=c;
			}
			else
				sr=c;
		System.out.println("max: "+max);
		System.out.println("sr: "+sr);
		System.out.println("min: "+min);	
	}
	
	
	
	public static Scanner cin;
	
	public static void main(String[] args) {
		cin = new Scanner(System.in);
		int d1,d2,d3;
		d1=load("pierwsza liczbe");
		System.out.println(d1);
		div(d1);
	
	}
}
