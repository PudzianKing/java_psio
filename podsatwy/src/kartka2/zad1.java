package kartka2;

import java.util.Scanner;

public class zad1 {
	
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
		//System.out.println("min: "+min);
		System.out.println("sr: "+sr);			
		System.out.println("max: "+max);
	}
	
public static Scanner cin;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);

		int d1,d2,d3;
		System.out.println("Podaj liczbe 1");
		d1=cin.nextInt();
		System.out.println("Podaj liczbe 2");
		d2=cin.nextInt();
		System.out.println("Podaj liczbe 3");
		d3=cin.nextInt();
		minmax(d1,d2,d3);
		//System.out.println("Liczby Podzielne przez : "+d3);*/
		
	}

}
