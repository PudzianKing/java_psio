package podsatwy;

import java.util.Scanner;

public class zad2 {
	
	public static Scanner cin;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);
		int d1,d2,d3;
		System.out.println("Podaj Liczba pierwsz¹");
		d1=cin.nextInt();
		System.out.println("Podaj Liczba drug¹");
		d2=cin.nextInt();
		System.out.println("Podaj Liczba treci¹");
		d3=cin.nextInt();
		System.out.println("Liczby Podzielne przez : "+d3);
		for (int i=d1;i<=d2;i++)
		{
			if (i%d3==0)
				System.out.println(i);
		}
		
		
		
	}

}
