package podsatwy;

import java.util.Scanner;

public class zad8 {
	
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
	
public static Scanner cin;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);

		int d1,d2,d3;
		System.out.println("Podaj Miesi¹c");
		d1=cin.nextInt();
		System.out.println("Podaj Dzieñ");
		d2=cin.nextInt();
		/*System.out.println("Podaj Bok 3");
		d3=cin.nextInt();
		//System.out.println("Liczby Podzielne przez : "+d3);*/
		switch (d1)
		{
			case 1:
				System.out.println("Zima");
				break;
			case 2:
				System.out.println("Zima");
				break;
			case 3:
				if(d2>22)
					System.out.println("Wiosna");
				else
					System.out.println("Zima");
				break;
			case 4:
				System.out.println("Wiosna");
				break;
			case 5:
				System.out.println("Wiosna");
				break;
			case 6:
				if(d2>23)
					System.out.println("Lato");
				else
					System.out.println("Wiosna");
				break;
			case 7:
				System.out.println("Lato");
				break;
			case 8:
				System.out.println("Lato");
				break;
			case 9:
				if(d2>24)
					System.out.println("Jesieñ");
				else
					System.out.println("Lato");
				break;
			case 10:
				System.out.println("Jesieñ");
				break;
			case 11:
				System.out.println("Jesieñ");
				break;
			case 12:
				if(d2>22)
					System.out.println("Zima");
				else
					System.out.println("Jesieñ");
				break;
			default:
				System.out.println("Hmm coœ Ÿle wpisa³eœ");
				break;
		}
	}

}
