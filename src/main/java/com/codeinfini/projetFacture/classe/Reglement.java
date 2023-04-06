package com.codeinfini.projetFacture.classe;

import java.time.LocalDate;
import java.util.Scanner;

public class Reglement {

	public static void main(String[] args) 
	{
		String date;
		double montant;
		double montantRemise;
		ModeReglement modeReglement;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Donnez la date du jour (jj/mm/aaaa): ");
		date = scan.next();
		System.out.println("Montant recu: ");
		montant= scan.nextDouble();
		System.out.println("Montant apres remise: ");
		montantRemise = scan.nextDouble();
		
		if(montant > montantRemise)
		{
			double monnaie = montant - montantRemise;
			System.out.println("Monnaie : " +monnaie);
		}
		else
		{
			System.out.println("Pas de monnaie");
		}
		for(Reglement reglement : mode())
		{
			System.out.println("Reglement : " +modeReglement);
		}
		
		
		
	}
	
	public  enum modeReglement 
	{
		 ESPECE,
		CHEQUE,
		VIREMENT;
		 String mode;
		 if(mode.equals(Espece))
		 {
			 System.out.println("Reglement: " +ESPECE);
		 }
	}

}
