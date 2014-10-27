package podsatwy;

import java.util.Scanner;

public class zad4 {
	
	public static boolean poda(int a)
	{
		int d=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			  d++;	
		}
		if(d<2)
		  return true;
	    else
	      return false;
	}
	
public static Scanner cin;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);
		int d1,d2,d3;
		System.out.println("Podaj Liczbê");
		d1=cin.nextInt();
		System.out.println("Podaj Liczba drug¹");
		d2=cin.nextInt();
		/*System.out.println("Podaj Liczba treci¹");
		d3=cin.nextInt();
		System.out.println("Liczby Podzielne przez : "+d3);*/
		for(int i=d1;i<=d2;i++)
		{
		if (poda(i))
			System.out.println(i);
		else
			;
		}
	}

}
