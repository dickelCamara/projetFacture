package com.codeinfini.projetFacture.affichage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class Menu 
{

	public static void main(String[] args) 
	{	
		switch(getChoix())
		{
		case 1:
			menuProduit();
			break;
		case 2:
			double monnaie =  reglement();
			System.out.println("Monnaie: " +monnaie);
			break;
		case 3:
			facture();
			LocalTime heureActuelle = LocalTime.now();
			System.out.println( heureActuelle);
			break;
		case 4:
			
		default:
			System.out.println("Choix inconnu! Veuillez vérifiez votre choix");
			break;		
	}	
}
	
	public static void menuBany()
	{
		System.out.println("BIENVENUE CHEZ BANY VOICI NOTRE MENU");
		System.out.println("====**** Menu Bany ****====");
        System.out.println("1. Produit ");
        System.out.println("2. Reglement");
        System.out.println("3. Facture");
        System.out.println("4. Quitter");    
	}
	

	
	public static void menuProduit()
	{
		Scanner scan = new Scanner(System.in);
		int choix;
		System.out.println("====**** Menu Produit ****====");
        System.out.println("1. Dolima");
        System.out.println("2. Fromage");
        System.out.println("3. Lait");
        System.out.println("4. Quitter");
        
        System.out.println("Votre choix: ");
		choix = scan.nextInt();
	        
	        if(choix == 1)
			{
	        	System.out.println(" Dolima");
	        	String [] tabCategories = dolima();
				System.out.println(Arrays.toString(tabCategories));
				double prixTotalTtc = calculPrix();
				System.out.println("Le prix total est: " +prixTotalTtc);
			}
			else if(choix ==2)
			{
				System.out.println("Fromage");
				String [] tabCategories = fromage();
				System.out.println(Arrays.toString(tabCategories));
				double prix = calculPrix();
				System.out.println("Le prix total est: " +prix);
			}
			else if(choix ==3)
			{
				System.out.println(" Lait");
				String [] tabCategories = lait();
				System.out.println(Arrays.toString(tabCategories));
				double prix = calculPrix();
				System.out.println("Le prix total est: " +prix);
			}
			else
			{
				System.out.println("Choix inconnue");
			}
	}
	
	
	public static String [] dolima()
	{
		String categorieDolima;
		String[] tabCategorie;
		int nombreCategorie;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Combien de categorie de produit voulez vous saisir");
			try
			{
				nombreCategorie = scan.nextInt();
			}
			catch( InputMismatchException e)
			{
				System.out.println("Entrer une chaine de caractere S.V.P");
				scan.next();
				continue;
			}
			if (nombreCategorie ==0)
			{
				System.out.println("Veullez saisir un nombre ");
			}
			else
			{
				tabCategorie = new String [nombreCategorie];
				for(int i = 0; i<tabCategorie.length; i++)
				{
					while(true)
					{
						System.out.print("Donnez un categorie de prodruit: ");
						try
						{
							categorieDolima = scan.next();
						}
						catch(InputMismatchException e)
						{
							System.out.println("Veuillez saisir une chaine S.V.P");
							scan.next();
							continue;
						}
						if (categorieDolima.equals(""))
						{
							System.out.println("La chaine ne doit pas etre vide");
							continue;
						}
						else
						{
							tabCategorie[i] = categorieDolima;
						}
						break;
					}
				}
				break;			
				}
			}
			return tabCategorie;
			}
	
	
	public static String [] fromage()
	{
		String categorieFromage;
		String[] tabCategorie;
		int nombreCategorie;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Combien de categorie de produit voulez vous saisir");
			try
			{
				nombreCategorie = scan.nextInt();
			}
			catch( InputMismatchException e)
			{
				System.out.println("Entrer une chaine de caractere S.V.P");
				scan.next();
				continue;
			}
			if (nombreCategorie ==0)
			{
				System.out.println("Veullez saisir un nombre ");
			}
			else
			{
				tabCategorie = new String [nombreCategorie];
				for(int i = 0; i<tabCategorie.length; i++)
				{
					while(true)
					{
						System.out.print("Donnez un categorie de prodruit: ");
						try
						{
							categorieFromage = scan.next();
						}
						catch(InputMismatchException e)
						{
							System.out.println("Veuillez saisir une chaine S.V.P");
							scan.next();
							continue;
						}
						if (categorieFromage.equals(""))
						{
							System.out.println("La chaine ne doit pas etre vide");
							continue;
						}
						else
						{
							tabCategorie[i] = categorieFromage;
						}
						break;
					}
				}
				break;			
				}
			}
			return tabCategorie;
	}
	

	public static String [] lait()
	{
		String categorieLait;
		String[] tabCategorie;
		int nombreCategorie;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Combien de categorie de produit voulez vous saisir");
			try
			{
				nombreCategorie = scan.nextInt();
			}
			catch( InputMismatchException e)
			{
				System.out.println("Entrer une chaine de caractere S.V.P");
				scan.next();
				continue;
			}
			if (nombreCategorie ==0)
			{
				System.out.println("Veullez saisir un nombre ");
			}
			else
			{
				tabCategorie = new String [nombreCategorie];
				for(int i = 0; i<tabCategorie.length; i++)
				{
					while(true)
					{
						System.out.print("Donnez un categorie de prodruit: ");
						try
						{
							categorieLait = scan.next();
						}
						catch(InputMismatchException e)
						{
							System.out.println("Veuillez saisir une chaine S.V.P");
							scan.next();
							continue;
						}
						if (categorieLait.equals(""))
						{
							System.out.println("La chaine ne doit pas etre vide");
							continue;
						}
						else
						{
							tabCategorie[i] = categorieLait;
						}
						break;
					}
				}
				break;			
				}
			}
			return tabCategorie;
	}	
	
	public static double calculPrix()
	{
		double prixUnitaire;
		double prixTotal;
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
			
			prixTotal = prixUnitaire * quantite;
			
			return prixTotal;
		}	
	}
	
	
	public static double reglement()
	{
		String mode ;
		double montant;
		double montantRemise;
		double monnaie = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Montant recu: ");
		montant= scan.nextDouble();
		System.out.println("Montant apres remise: ");
		montantRemise = scan.nextDouble();
		
		if(montantRemise > montant)
		{
			 monnaie = montantRemise- montant ;
		}
		else
		{
			System.out.println("Pas de monnaie");
		}
		System.out.println("Mode de reglement: ");
		mode= scan.next();
		System.out.println("Reglement: " +mode);
		return monnaie;		
	}
	

	public static void facture()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("**********************************************");
		System.out.println("BANY");
		System.out.println("Castor CITE PTT N°6"
				+ "76 510 24 00 - 78 322 02 58");
		System.out.println("**********************************************");
		LocalDate date = LocalDate.now();
	    System.out.println("Le: " +date);
	    String ticketNumber = UUID.randomUUID().toString();
        System.out.println("Ticket  : " + ticketNumber);
		
			double monnaie =  reglement();
			System.out.println("Monnaie: " +monnaie);
			double prix = calculPrix();
			System.out.println("Le prix total est: " +prix);		
			System.out.println("----------------------------------------------");
			System.out.println("MERCI DE VOTRE VISITE !");
			
	}
	
	public static int getChoix()
	{
		int choix;
		Scanner scanner = new Scanner(System.in);		
		
		while(true)
		{
			menuBany();
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
	

