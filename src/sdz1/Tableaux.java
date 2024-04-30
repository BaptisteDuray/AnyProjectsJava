package sdz1;

import java.util.Scanner;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
			
		char tableauCaractere2[] = {'a','b','c','d','e','f','g'};
		for(int i = 0; i < tableauCaractere2.length; i++)
		{System.out.println("A l'emplacement " + i +" du tableau nous avons = " +tableauCaractere2[i]);}
		
		
		char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		int i = 0, emplacement = 0;
		char reponse = ' ',carac = ' ';
		do {//boucle principale
		do {//on répète cette boucle tant que l'utilisateur n'a pas rentré une lettre figurant dans le tableau
		i = 0;
		System.out.println("Rentrez une lettre en minuscule,SVP ");
		carac = sc.nextLine().charAt(0);
		while(i < tableauCaractere.length && carac !=
		tableauCaractere[i])//boucle de recherche dans le tableau
		i++;
		if (i < tableauCaractere.length)//Si i < 7 c'est que la boucle n'a pas dépassé le nombre de cas du tableau ==> il a trouvé
		System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");
		else//sinon
			System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");
			}while(i >= tableauCaractere.length);//tant que la lettre de l'utilisateur ne correspond pas à une lettre du tableau
			do{
			System.out.println("Voulez-vous essayer de nouveau ?(O/N)");
			reponse = sc.nextLine().charAt(0);
			}while(reponse != 'N' && reponse != 'O');
			}while (reponse == 'O');
			System.out.println("Au revoir !..");
			
			String tab[] = {"toto", "titi", "tutu", "tete", "tata"};
			for(String str : tab)
			System.out.println(str);
			
			int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, k = 0, l = 0;
			while (i < 2)
			{
			l = 0;
			while(l < 5)
			{System.out.print(premiersNombres[k][l]);
			l++;
			}
			System.out.println("");
			k++;
			}
	}

}
