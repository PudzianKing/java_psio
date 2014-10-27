package podsatwy;

import java.util.Scanner;

public class zad1 {
	
	public static Scanner cin;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);
		int d1,d2;
		System.out.println("Podaj Liczba pierwsz¹");
		d1=cin.nextInt();
		System.out.println("Podaj Liczba drug¹");
		d2=cin.nextInt();
		System.out.println("Parzyste");
		for (int i=d1;i<=d2;i++)
		{
			if (i%2==0)
				System.out.println(i);
		}
		System.out.println("Nieparzyste");
		for (int i=d1;i<=d2;i++)
		{
			if (i%2!=0)
				System.out.println(i);
		}
		
		
	}

}
