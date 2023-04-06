package com.codeinfini.projetFacture.classe;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Categorie
{
	public static void main(String[] args) 
	{
		categorieMenu();	
		
	}
	
	public static void categorieMenu()
	{
		System.out.println("====**** Menu Categorie ****====");
        System.out.println("1. Type de Dolima");
        System.out.println("2. Type de Fromage");
        System.out.println("3. Type de Lait");
        System.out.println("5. Quitter");
	}
	

	public static void typeDolima()
	{
		String nomProduit;
		String description;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Donnez le nom du produit: ");
			try
			{
				nomProduit = scan.next();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez un nombre entier SVP: ");
				scan.next();
				continue;
			}
			
			System.out.println("Donnez description de la categorie: ");
			try
			{
				description = scan.next();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez une chaine de caratere SVP: ");
				scan.next();
				continue;
			}
			System.out.println("Le nom du produit est:" +nomProduit);
			System.out.println("La description du produit est:" +description);
			
		}
	}
	

	public static void typeFromage()
	{
		String nomProduit;
		String description;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Donnez le nom du produit: ");
			try
			{
				nomProduit = scan.next();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez un nombre entier SVP: ");
				scan.next();
				continue;
			}
			System.out.println("Donnez description de la categorie: ");
			try
			{
				description = scan.next();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez une chaine de caratere SVP: ");
				scan.next();
				continue;
			}
			System.out.println("Le nom du produit est:" +nomProduit);
			System.out.println("La description du produit est:" +description);
			
		}
	}
	
	

	public static void typeLait()
	{
		String nomProduit;
		String description;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Donnez le nom du produit: ");
			try
			{
				nomProduit = scan.next();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez un nombre entier SVP: ");
				scan.next();
				continue;
			}
			System.out.println("Donnez description de la categorie: ");
			try
			{
				description = scan.next();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Donnez une chaine de caratere SVP: ");
				scan.next();
				continue;
			}
			System.out.println("Le nom du produit est:" +nomProduit);
			System.out.println("La description du produit est:" +description);
			
		}
	}					
}

