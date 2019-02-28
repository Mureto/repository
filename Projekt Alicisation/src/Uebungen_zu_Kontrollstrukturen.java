
public class Uebungen_zu_Kontrollstrukturen
{
	static String belibigerString = "Hi!";
	static int eineZahl ;
	static int nochEineZahl ;
	static int ergebnis ;
	static float eineZahlMitKommas ;
	static int fiboEins ;
	static int fiboZwei ;
	static int erstesElement ;
	static int zweitesElement ;
	static int unvorhandenesElement ;
	
	public static void main(String[] args) 
	{
		// TODO Auto_generated method stub
		//ungerade(100);
		fibonacci();
		//Ueberpruefung();
	}
	
	public static void rechenspiele()
	{
		ergebnis = eineZahl * nochEineZahl;
	}
	
	public static void Ueberpruefung()
	{
		if (eineZahlMitKommas < ergebnis)
		{
		System.out.println(ergebnis - eineZahlMitKommas);
		}
		else
		{
		System.out.println(belibigerString);
		}
	}
	
	public static void ungerade(int ende)
	{
		eineZahl = 1;
			while (eineZahl < ende)
			{
				eineZahl = eineZahl + 2;
				System.out.println(eineZahl);
			}
	}
	
	public static void fibonacci()
	{
		erstesElement = 0;
		zweitesElement = 1;
		
		while(zweitesElement-erstesElement < 500)
		{
			unvorhandenesElement = zweitesElement;
			zweitesElement = erstesElement + zweitesElement;
			erstesElement = unvorhandenesElement;
			System.out.print(zweitesElement);
		}
	}
}
