package sdz1;

import java.util.Scanner;

public class boucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//Une variable vide
		String prenom;
		// On initialise celle-ci à O pour oui !
		char reponse = 'O';
		//Notre objet Scanner, n'oubliez pas l' import de java.util.Scanner
		Scanner sc = new Scanner(System.in);
		//Tant que la réponse donnée est égale à oui
		while (reponse == 'O')
		{
		//On affiche une instruction
		System.out.println("Donnez un prénom: ");
		//On récupère le prénom saisi
		prenom = sc.nextLine();
		// On affiche notre phrase avec le prénom
		System.out.println("Bonjour " +prenom+ " comment vas-tu ?");
		//réinitialisation de la variable réponse.
		//Sans ça, nous n' entrions pas dans la deuxième boucle
		reponse = ' ';
		//tant que la réponse n'est pas O ou N, on repose la question
		while(reponse != 'O' && reponse != 'N')
		{
		//On demande si la personne veut faire un autre essai
		System.out.println("Voulez-vous réessayer ?(O/N)");
		//On récupère la réponse de l'utilisateur
		reponse = sc.nextLine().charAt(0);
		}
		}//Fin de la boucle
		System.out.println("Au revoir...");
		
		int a = 1, b = 15;
		while (a < b)
		{
		System.out.println("coucou " +a+ " fois !!");
		a++;
		}
		
		for(int i = 10; i >= 0; i--)
		{
		if(i > 1)
		System.out.println("Il reste "+i+" lignes à écrire");
		else
		System.out.println("Il reste "+i+" ligne à écrire");
		}
	}

}
