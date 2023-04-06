package com.codeinfini.projetFacture.classe;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Facture {

	public static void facture()
	{
		
		int numeroFacture;
		LocalDate dateFacture = null;
		List<Reglement> reglement;
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("**********************************************");
			System.out.println("BANY");
			System.out.println("Castor CITE PTT N°6"
					+ "76 510 24 00 - 78 322 02 58");
			System.out.println("**********************************************");
			System.out.println("Donnez le numéro de facture: ");
			try
			{
				numeroFacture = scan.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez un nombre entier SVP: ");
				scan.next();
				continue;
			}
			System.out.println("Donnez la date de facturation: ");
			try
			{
				dateFacture.now();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez une chaine de caratere SVP: ");
				scan.next();
				continue;
			}
			
			
			
			System.out.println("Les informations du client");
			System.out.println("Id du client: " +numeroFacture);
			//System.out.println("date du client: " +dateFacture);
		
			
			
		}	
	}
	
	public static double calculFacture()
	{
		Scanner scan = new Scanner(System.in);
		int quantite;
	    double prixUnitaire;
		double prixTotal;
		double montantTva;
		double prixTotalTtc;
		double reliquat;
		final double TVA = 0.18;
		while(true)
		{
			System.out.println("Donnez la quantite: ");
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
			System.out.println("Donner le prix unitaire: ");
			try
			{
				prixUnitaire = scan.nextDouble();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez un nombre entier SVP: ");
				scan.next();
				continue;
			}
			prixTotal = prixUnitaire * quantite;
			montantTva = prixTotal * TVA;
			prixTotalTtc = prixTotal + montantTva;
			System.out.println("Le prix total HTVA: " + prixTotal);
    		System.out.println("Montant TVA: " + montantTva);
    		System.out.println("Le prixTotal: " + prixTotalTtc);
    		
	 
		   
	}
	}
}
