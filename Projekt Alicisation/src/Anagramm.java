import java.util.Arrays;

public class Anagramm {
	static char[] charArray;
	//static String wort1 = "nie";
	//static String wort2 = "ein";

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		//hi();
		anagramm("Cowbelly","bellcoywe");
	}

	
	
	
	
	public static void hi()
	{
		System.out.print("1");
		System.out.println("2");
		System.out.print("3");
		System.out.println("4");
	}
	
	
	/*public static void anagramm()
	{
		System.out.print(wort1);
		charArray = wort1.toCharArray();
		System.out.println(charArray.length);
	}
	
	public static void anagramm2()
	{
		System.out.print(wort2);
		charArray = wort2.toCharArray();
		System.out.println(charArray.length);
		
	}*/
	
	
	
	public static void anagramm(String wort1, String wort2)
	{
		String kWort1 = wort1.toLowerCase();
		String kWort2 = wort2.toLowerCase();
		String kA = kWort1.replaceAll(" ","");
		String kB = kWort2.replaceAll(" ","");
		char[] kAArray = kA.toCharArray();
		char[] kBArray = kB.toCharArray();
		Arrays.sort(kAArray);
		Arrays.sort(kBArray);
		if(kAArray.length==kBArray.length)
		{
		for(int i = 0;i>=kAArray.length;i++)
		{
			if(kAArray[i]==kBArray[i])
			{
				System.out.print(kAArray[i]);
				System.out.println(kBArray[i]);
			}
			else
			{
				System.out.print("Kein Anagramm");
			}
		}
		System.out.print("Sind Anagramme");
		}else {System.out.print("Kein Anagramm");}
	}
}
