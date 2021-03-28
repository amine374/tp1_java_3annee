package exercice_1;

import java.util.Scanner;

public class mainExo1
{
	
	public static void affichTab(int[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			System.out.println(t[i]);
		}
	}
	
	public static boolean nombreDansTableau(int[] t, int nb)
	{
		for(int i = 0; i < t.length; i++)
		{
			if(t[i]== nb)
				return true;
		}
		return false;
		
	}
	
	public static int nombreEstDansTableau(int[] t, int nb)
	{
		int freq = 0;
		for(int i  = 0; i < t.length; i++ )
		{
			if(t[i] == nb)
				freq++;
		}
		
		return freq;
	}
	
	public static boolean tabSansDoublons(int[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			if(mainExo1.nombreEstDansTableau(t, i) == 2)
				return false;
				
		}
		return true;
	}
	
	public static int cardINTERtabs(int[] t1, int[] t2)
	{
		int card = 0;
		for(int i = 0; i < Math.min(t1.length, t2.length); i++)
		{
			if(mainExo1.nombreDansTableau(t1, i) && mainExo1.nombreDansTableau(t1, i))
			{
				card++;
			}
		}
		return card;
	}
	
	
	public static void tabINTERtab(int[] t1, int[] t2)
	{
		for(int i = 0; i < Math.min(t1.length, t2.length); i++)
		{
			if(mainExo1.nombreDansTableau(t1, i) && mainExo1.nombreDansTableau(t1, i))
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean tabDansIntervalle(int[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			if(t[i] < 1 && t[i] > 49)
				return false;
				
		}
		return true;
	}
	
	public static int[] tabloIntHasard()
	{
		int[] t;
		t = new int[5];
		for(int i = 0; i < 5; i++)
		{
			t[i] = 1 + (int) (Math.random() * 49);
		}
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tabJoueur = new int[5];
		Scanner sc = new Scanner(System.in);
		int[] tabPC = mainExo1.tabloIntHasard();
		
		for(int i = 0; i < 5; i++)
			tabJoueur[i] = sc.nextInt();
		
		System.out.println(mainExo1.cardINTERtabs(tabJoueur, tabPC));
	}

	

}
