package podsatwy;

import java.util.Scanner;

public class zad9 {
	
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
	
	public static boolean czykat(int a,int b,int c)
	{
		if((a+b>c) && (a+c>b) && (b+c>a))
			return true;
	    else
	    	return false;
	}
	
	public static boolean czykatp(int a,int b,int c)
	{
		if((a*a+b*b-c*c)*(a*a+c*c-b*b)*(b*b+c*c-a*a)==0)
			return true;
	    else
	    	return false;
	}
	
	public static void czyp(int a)
	{
		int l=0,d=2;
		while(a>1)
		{
	
			if((a%d)==0)
			{
				a=a/d;
				l++;
			}
			else
			{
				System.out.println(d+":"+l);
				l=0;
				d++;
			}
		}
		System.out.println(d+":"+l);
	}
	
public static Scanner cin;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);

		int d1,d2,d3;
		System.out.println("Podaj liczbe");
		d1=cin.nextInt();
		czyp(d1);
		/*System.out.println("Podaj Dzieñ");
		d2=cin.nextInt();
		System.out.println("Podaj Bok 3");
		d3=cin.nextInt();
		//System.out.println("Liczby Podzielne przez : "+d3);*/
		
	}

}
