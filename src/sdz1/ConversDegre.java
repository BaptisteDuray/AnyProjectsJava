package sdz1;

import java.util.Scanner;
public class ConversDegre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//initialisation des variables
		double c, f=0;
		int i,j=0;
		char reponse=' ';
		System.out.println(" ------------------------------------------------------------------------");
		System.out.println("| CONVERSION DEGRES CELSIUS ET DEGRES FAHRENHEIT|");
		System.out.println(" ------------------------------------------------------------------------");
		do{//tant que reponse = O//boucle principale
		do{//tant que l'imprimante n'est pas prête//boucle de test pour savoir si l'utilisateur est prêt
		do {// tant que valeur impossible rentrée//saisie des valeurs
		System.out.println("A partir de :");//affichage des directives et récupération des données
		c = sc.nextDouble();
		System.out.println("jusqu' à:");
		i = sc.nextInt();
		System.out.println("Par pas de :");
		j = sc.nextInt();
		if (c > i || j > i || j == 0)
		System.out.println("Traitement impossible");
		}while(c > i || j > i || j == 0);
		do {//tant que la reponse n'est pas O ou N
		System.out.println("Assurez-vous que l'imprimante est prête");
		System.out.println("Si vous êtes prêt, tapez O, sinon tapez N");
		//sc.reset();
		reponse = sc.next().charAt(0);
		}while (reponse != 'O' && reponse != 'N');
		}while (reponse == 'N');
		// Traitement des valeurs
		System.out.println("TABLE DE CONVERSION CELSIUS / FAHRENHEIT");
		System.out.println("---------------------------------------------");
		
		System.out.println(" Celsius | Fahrenheit ");
		System.out.println("---------------------------------------------");
		do{//tant que l'affichage n'est pas fini, on boucle les données et les calculs
		f = ((9.0/5.0) * c) + 32.0;
		if (c < 10)//si le Celsius n'a qu'un chiffre, on affiche un certain nombre d'espaces
		System.out.println(" "+c+" | "+arrondi(f,1));
		else
		{
		if(c < 100)//S'il y a un chiffre en plus, on enlève un espace blanc...
		System.out.println(" "+c+" | "+arrondi(f,1));
		else
		System.out.println(" "+c+" | "+arrondi(f,1));
		}
		c = c + j;//On incrémente le degré Celsius avec le pas
		}while (c <= i);
		do{
		System.out.println("Souhaitez-vous éditer une autre table ? (O/N)");
		reponse = sc.next().charAt(0);
		}while(reponse != 'O' && reponse != 'N');
		}while(reponse == 'O');
		System.out.println("Au revoir !");
		//Fin de programme
		}
		public static double arrondi(double A, int B) {
		return (double) ( (int) (A * Math.pow(10, B) + .5)) /
		Math.pow(10, B);
		}
		

		
		
	}

