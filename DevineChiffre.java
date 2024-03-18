package exo;
import java.util.Scanner;
public class CC {

	public static void main(String[] args) {
		//input.nextInt();
		/*
		Scanner input = new Scanner(System.in);
		String Phrase, Extract;
		int nb;
		
		Phrase = Saisie.lire_String("Veuillez saisir une phrase se terminant par un point");
		nb = Phrase.length();
		Extract = Phrase.substring(nb-1,nb);
		while (Extract.contentEquals(".")==false) {
			Phrase = Saisie.lire_String(" erreur de saisie, on recommence ! Veuillez saisir une phrase se terminant par un point ");
			nb = Phrase.length();
			Extract = Phrase.substring(nb-1, nb);
			
		}
		System.out.println("Votre phrase contient " + nb + " caractères");
	*/
		/*
		String phrase, extract;
		int nb,occurence;
		occurence = 0;
		phrase = Saisie.lire_String("Veuillez donner une phrase");
		nb = phrase.length();
		for(int cpt = 0; cpt <= nb-1; cpt++) {
			extract = phrase.substring(cpt,cpt+1);
			if((extract.equals("A")== true) || (extract.equals("a")== true));
				occurence++;
		}
		System.out.println("Votre phrase contient "+ occurence + " fois la lettre A ou a");
	 */
		
		// Décodage du numéro de Sécurité Sociale
		
		int Taille, Sexe;
		int Choix;
		String NSS, Extract;
		
		
		NSS = Saisie.lire_String("Veuillez saisir votre numéro de SS sur 13 chiffres");
		Taille = NSS.length();
		while(Taille != 13) {
			System.out.println("Numéro incorrect, recommencez");
			NSS = Saisie.lire_String("Veuillez saisir votre numéro de SS sur 13 chiffres");
			Taille = NSS.length();
		}
		
		Extract = NSS.substring(0, 1);
		if (Extract.equals("1") == true) {
			System.out.println("Vous êtes un homme");
		}else if (Extract.equals("2") == true) {
			System.out.println("Vous êtes une femme");
		}else System.out.println("erreur de saisie");
		
		// Autre méthode
		Sexe = Integer.parseInt(Extract);
		if(Sexe==1) System.out.println("Vous êtes un homme");
		else if(Sexe ==2) System.out.println("Vous êtes une femme");
			else System.out.println("Erreur de saisie ! ");
		
		
		Extract = NSS.substring(1, 3);
		int Annaiss = Integer.parseInt(Extract);
		if((Annaiss >= 00) && (Annaiss<=07)) System.out.println("Vous êtes né-e en 200" + Annaiss);
		else System.out.println("Vous êtes né-e en 19" + Annaiss);
		
		
		
		
		Extract = NSS.substring(3, 5);
		int Mois = Integer.parseInt(Extract);
		
		switch(Mois) {
		case 1 : {
			System.out.println("Vous êtes né-e en Janvier");
			break;
			}
		case 2 : {
			System.out.println("Vous êtes né-e en Février");
			break;
			}
		case 3 :{
			System.out.println("Vous êtes né-e en Mars");
			break;
			}
		case 4 :{
			System.out.println("Vous êtes né-e en Avril");
			break;
			}
		case 5 :{
			System.out.println("Vous êtes né-e en Mai");
			}
		case 6 :{
			System.out.println("Vous êtes né-e en Juin");
		}
		case 7 :{
			System.out.println("Vous êtes né-e en Juillet");
		}
		case 8 :{
			System.out.println("Vous êtes né-e en Août");
		}
		case 9 :{
			System.out.println("Vous êtes né-e en Septembre");
		}
		case 10 :{
			System.out.println("Vous êtes né-e en Octobre");
		}
		case 11 :{
			System.out.println("Vous êtes né-e en Novembre");
		}
		case 12 :{
			System.out.println("Vous êtes né-e en Décembre");
		}
		default : System.out.println("Erreur de saisie");
	}
		
		Extract = NSS.substring(5, 7);
		System.out.println("Vous êtes né-e dans le département" + Extract);
		Extract = NSS.substring(7, 10);
		System.out.println("Vous êtes né-e dans la commune qui porte le numéro" + Extract);
		Extract = NSS.substring(10, Taille);
		System.out.println("Notre ordre d'arrivée est" + Extract);
		
	
	}

}
