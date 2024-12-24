import java.util.Scanner;

public class Calcolatrice
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Benvenuto nella Calcolatrice Semplice!" + "\n" + "Scegli un'operazione:+,-,*,/");
		String operazione = sc.nextLine();

		System.out.println("Inserisci il primo numero: ");
		double a = Double.parseDouble(sc.nextLine());

		System.out.println("Inserisci il secondo numero: ");
		double b = Double.parseDouble(sc.nextLine());


		double risultato = 0;

//		switch (operazione)
//		{
//			case "+" -> risultato = somma(a,b);
//			case "-" -> risultato = sottrazione(a,b);
//			case "*" -> risultato = moltiplicazione(a,b);
//			case "/" -> risultato = divisione(a,b);
//			default -> System.out.println("inserire una operazione valida");
//
//		}

		try
		{
			risultato = switch (operazione)
			{
				case "+" -> somma(a, b);
				case "-" -> sottrazione(a, b);
				case "*" -> moltiplicazione(a, b);
				case "/" -> divisione(a, b);


				default -> throw new IllegalArgumentException("Unexpected value: " + operazione);
			};

			System.out.println("Il risultato è: " + risultato);
		}catch(Exception e)
		{
			System.out.println("non va bene quello che hai messo mannaggina");
		}

	}

	private static double divisione(double a, double b)
	{
		return a / b;
	}

	private static double moltiplicazione(double a, double b)
	{
		return a * b;
	}

	private static double sottrazione(double a, double b)
	{
		return a - b;
	}

	public static double somma(double a, double b)
	{

		return a + b;

	}



}
