package sdz1;

import java.util.Scanner;

public class ModulesdeClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String chaine = new String("COUCOU TOUT LE MONDE !"), chaine2 = new
				String();
				chaine2 = chaine.toLowerCase();//donne "coucou tout le monde !"
				
				String str1 = new String("Coucou "), str2 = new String("toi !"),
						str3 = new String();
						str3 = str1.concat(str2);//donne "Coucou toi !"	
						
						
		String str4 = new String("coucou"), str5 = new String("toutou");
		if (str4.equals(str5))//Si les deux chaînes sont identiques
	    System.out.println("Les deux chaines sont identiques !");
		else
		System.out.println("Les deux chaînes sont différentes !");	
		
		
		String str6 = new String("coucou"), str7 = new String("toutou");
		if (!str6.equals(str7))//Si les deux chaînes sont différentes
		System.out.println("Les deux chaines sont différentes !");
		else
		System.out.println("Les deux chaînes sont identiques !");
		
		String str8 = new String("coucou"), str9 = new String("toutou");
		boolean Bok = str8.equals(str9);//ici Bok prendra la valeur false
		System.out.println("FALSE");
		
		String nbre = new String("1234567");
		char carac = ' ';
		carac = nbre.charAt(4);//renverra ici le caractère 5
		System.out.println(carac);
		
		String chaine3 = new String("la paix niche"), chaine4 = new String();
		chaine4 = chaine3.substring(3,13);//permet d'extraire "paix niche"
		System.out.println(chaine4);
		
		String mot = new String("anticonstitutionnellement");
		int n = 0;
		n = mot.indexOf('t'); // n vaut 2
		n = mot.lastIndexOf('t'); // n vaut 24
		n = mot.indexOf("ti"); // n vaut 2
		n = mot.lastIndexOf("ti"); // n vaut 12
		n = mot.indexOf('x'); // n vaut -1

		
		double X = 0.0;
		X = Math.random();//donne un nombre comme 0.0001385746329371058
		double sin = Math.sin(120);
		double cos = Math.cos(120);
		double tan = Math.tan(120);
		double abs = Math.abs(-120.25);
		double d = 2;
		double exp = Math.pow(d , 2);
		//Ici on initialise la variable exp avec la valeur de d élevée au carré
		//La méthode pow() prend donc une valeur en premier paramètre
		//et un exposant en second
		
		
	
	}
	}
