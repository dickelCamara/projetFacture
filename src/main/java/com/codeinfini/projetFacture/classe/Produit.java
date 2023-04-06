package com.codeinfini.projetFacture.classe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Produit
{
	public static void main(String[] args) 
	{
		switch(getChoix())
		{
		case 1:
			calculDolima();
		
		}
	}
	
	public static void menuProduit()
	{
		System.out.println("====**** Menu Produit ****====");
        System.out.println("1. Dolima");
        System.out.println("2. Fromage");
        System.out.println("3. Lait");
        System.out.println("4. Quitter");
	}
	
	public static void calculDolima()
	{
		double prixUnitaire;
		final float TVA = 0.18f;
		int quantite;
		Scanner scan = new Scanner(System.in);
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
			
		}
		
	}
	
	
	public static int getChoix()
	{
		int choix;
		Scanner scanner = new Scanner(System.in);		
		
		while(true)
		{
			menuProduit();
			System.out.println("================================");
			System.out.print("Votre choix: ");
			try 
			{
				choix = scanner.nextInt();
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Veuillez saisir un nombre S.V.P ");
				scanner.next();
				continue;
			}
			
		return choix;
	}
	}
	}
