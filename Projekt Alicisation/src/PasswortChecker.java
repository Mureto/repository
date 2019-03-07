public class PasswortChecker 
{
	static char[] charArray;

	public static void main(String[] args)
	{
		
		//checker("1bestePasswort2");
		//pwCheck("hallooooooooO");
		//harshad(100);
	}
	
	/*public static void checker(String passwort)
	{
		System.out.println(passwort);
		//System.out.println(charArray[3]);
		System.out.println();
		charArray = passwort.toCharArray();
		for (int i = 0; i < charArray.length; i++)
		{
			if (Character.isUpperCase(charArray[i]))
			{
				System.out.println(charArray[i]+ " ist GROß");
			}
			else if (Character.isDigit(charArray[i]))
			{
				System.out.println(charArray[i] + " ist Zahl");
			}
			else
			{
				System.out.println(charArray[i] + " ist klein");
			}
		}
	}*/
	
	public static boolean pwCheck(String passwort)
	{
		System.out.println(passwort);
		charArray = passwort.toCharArray();
		if(passwort=="Passwort123")
		{
			System.out.println("Ernsthaft?");
			return false;
		}
		if (charArray.length >= 8)
		{
			for (int i=0; i < charArray.length; i++)
			{
				if(Character.isUpperCase(charArray[i]))
				{
					for (int j=0; j < charArray.length; j++)
					{
						if(Character.isLowerCase(charArray[j]))
						{
							for (int k=0; k < charArray.length; k++)
							{
								if(Character.isDigit(charArray[k]))
								{
									for (int l=0; l < charArray.length; l++)
									{
										if(!Character.isLetterOrDigit(charArray[l]))
										{
											System.out.print("Alles okay"); 
											return true;
										}
									} System.out.print("1 Sonderzeichen fehlt!"); return false;
								}
							}System.out.print("1 Zahl fehlt"); return false;
						}
					}System.out.print("1 klein Buchstabe fehlt"); return false;
				}
			}System.out.print("1 groß Buchstabe fehlt"); return false;
		}else
		{
			System.out.println("8 Zeichen sind nötig!");
			return false;
		}
	}

	
	public static int quersumme(int zahl)
	{
		if(zahl<=9) return zahl;
		return zahl%10 + quersumme(zahl/10);
	}


	public static void harshad(int ende)
	{
		for(int i = 1; i<=ende;i++)
		{
			if(i%quersumme(i)==0)
			{
				System.out.println(i);
			}
		}
	}





































}
