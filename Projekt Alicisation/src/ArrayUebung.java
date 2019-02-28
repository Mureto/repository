import java.util.ArrayList;
import java.util.List;

public class ArrayUebung {

	static List<String> tage = new ArrayList<String>();
	static List<String> monate = new ArrayList<String>();
	static List<Integer> monatsTage = new ArrayList<Integer>();
	
	public static void main(String[] args) 
	{
		dieWoche();
		dieMonate();
		monatsTage();
		monate2();
	}

	public static void dieWoche()
	{
		tage.add("Montag");
		tage.add("Dienstag");
		tage.add("Mittwoch");
		tage.add("Donnerstag");
		tage.add("Freitag");
		tage.add("Samstag");
		tage.add("Sonntag");
	}
	
	public static void keinFreitag()
	{
		tage.set(4, "NochNichtFreiTag");
	}
	
	public static void dieMonate()
	{
		monate.add("Januar");
		monate.add("Februar");
		monate.add("Maerz");
		monate.add("April");
		monate.add("Mai");
		monate.add("Juni");
		monate.add("Juli");
		monate.add("August");
		monate.add("September");
		monate.add("Oktober");
		monate.add("November");
		monate.add("Dezember");
	}

	public static void monatsTage()
	{
		monatsTage.add(31);
		monatsTage.add(28);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
	}
	
	public static void monatHatTage(int t)
	{
		System.out.print("Der Monat " + monate.get(t) + " hat " + monatsTage.get(t) + " Tage.");
	}
	
	public static void monate2()
	{
		for(int i=0;i<monate.size();i++)
		{
			System.out.println(monatsTage.get(i) + " " + monate.get(i));
		}
	}
}
