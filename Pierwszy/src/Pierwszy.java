import java.util.Scanner;
public class Pierwszy {

	public static Scanner cin;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double d1,d2	;
	cin = new Scanner(System.in);
		while (true){
			
			d1=cin.nextDouble();
			d2=cin.nextDouble();
			System.out.println("wynik "+"dodawnia: "+(d1+d2));
			System.out.println("wynik "+"odejmowania: "+(d1-d2));
			System.out.println("wynik "+"dzielenia: "+(d1/d2));
			System.out.println("wynik "+"mnozenia: "+(d1*d2));
			}
	}

}
