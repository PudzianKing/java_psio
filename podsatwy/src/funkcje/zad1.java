package funkcje;

import java.util.Scanner;

public class zad1 {
	
	public static int load(String text){
		System.out.println(text);
		return cin.nextInt();
	}
	public static void minmax(int a,int b,int c)
	{
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
		System.out.println("Podaj liczbe 1");
		d1=cin.nextInt();
		System.out.println("Podaj liczbe 2");
		d2=cin.nextInt();
		System.out.println("Podaj liczbe 3");
		d3=cin.nextInt();
		minmax(d1,d2,d3);
		
	
	}
}
