package funkcje;

import java.util.Scanner;

public class zad4 {
	
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
		System.out.println(a);
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
	
	public static char znak(int a){	//test dodatniości
		if(a==0){
			return '0';
		}
		else{
			if(a>0){
				return '+';
			}
			else{
				return '-';
			}
		}
	}
	
	public static int NWD(int a1, int a2){	//NWD
        if (a2 == 0) {
            return a1;  
        }
        else {   
            return NWD(a2, a1%a2);  
        }
    }
	
	public static int NWW(int a1,int a2){	//NWW
		return(a1*a2) / NWD(a1, a2);
	}
			
	public static Scanner cin;
	
	public int mian;
	
	public int licz;
	
	public void load_u(){	//wypisanie textu i wczytanie inta ułamek
		licz=load("licznik");
		mian=load("mianownik");
	}
	
	public void out_u(){	//wypisanie ulamka
		System.out.println(licz+"/"+mian);
	}
	
	public void u_sum(zad4 u1,zad4 u2){	//test ulamków
		if(u1.mian==u2.mian){
			sum(u1,u2);
		}
		else{
			u_pd(u1,u2);
		}
		sum(u1,u2);

	}
	public void u_sk(zad4 u1){	//mnozenie ulamkow
		if (u1.licz==u1.mian){
			System.out.println("1/1");
			u1.licz=1;
			u1.mian=1;
		}
		else{
			int a=NWD(u1.licz,u1.mian);
			System.out.println(a);
			u1.licz=u1.licz/a;
			u1.mian=u1.mian/a;
			System.out.println("Nie da siê skróciæ!");
		}
	}
	public void u_pd(zad4 u1,zad4 u2){	//monrzenie ulamkow
		int a=u1.mian*u2.mian;
		u1.licz=u1.licz*(a/u1.mian);
		u2.licz=u2.licz*(a/u2.mian);
		u1.mian=a;
		u2.mian=a;
		
		
	}
	
	public void sum(zad4 u1,zad4 u2){	//dodawanie ulamków
		if(u1.mian==u2.mian){
			licz=u1.licz+u2.licz;
			mian=u1.mian;
		}
		else{
			System.out.println("nidy rydy póki co");
		}
	}
	
	public static void main(String[] args) {	//main
		cin = new Scanner(System.in);
		zad4 ul1=new zad4();
		zad4 ul2=new zad4();
		zad4 ul3=new zad4();
		ul1.load_u();
		ul1.out_u();
		ul2.load_u();
		ul2.out_u();
		ul3.u_sum(ul1, ul2);
		ul3.u_sk(ul3);
		ul3.out_u();
	}
}
