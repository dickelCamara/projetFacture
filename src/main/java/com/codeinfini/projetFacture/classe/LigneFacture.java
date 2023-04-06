package com.codeinfini.projetFacture.classe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LigneFacture
{
	public static void main(String[] args)
	{
		
			}
	public static void ligneFacture()
	{
	    int quantite;
		Produit produit;
		Facture facture;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Donnez le numéro de facture: ");
			try
			{
				quantite = scan.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez un nombre entier SVP: ");
				scan.next();
				continue;
			}
		}
	}
}
