package sdz1;

import java.util.Scanner;

public class cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int x = 10;
		String type = (x % 2 == 0) ? "C' est pair" : "C' est impair" ; //Ici type vaut "C' est pair"
		System.out.println("Le résultat est " + type);
		int y = 9;
		String type2 = (y % 2 == 0) ? "C' est pair" : "C' est impair" ; //Ici type2 vaut "C' est impair"
		
		System.out.println("Le résultat est " + type2);
		
		   double nbre1 = 10, nbre2 = 3, nbre3 = 0;
           int resultat = (int) (nbre1 / nbre2);
           System.out.println("Le resultat est = " + resultat);
           
           int i = 20;
           if (i < 0)
           System.out.println("Ce nombre est négatif !");
           else
           {
           if(i == 0)
           System.out.println("Ce nombre est nul !!");
           else
           System.out.println("Ce nombre est positif!!");
           }
           
           int j = 58;
           if(j < 100 && j > 50)
           System.out.println("Le nombre est bien dans l'intervalle");
           else
           System.out.println("Le nombre n' est pas dans l'intervalle");
           
           int nbre = 5;
           switch (nbre)
           {
           case 1: System.out.println("Ce nombre est tout petit");
           break;
           case 2: System.out.println("Ce nombre est tout petit");
           break;
           case 3: System.out.println("Ce nombre est un peu plus grand");
           break;
           case 4: System.out.println("Ce nombre est un peu plus grand");
           break;
           case 5: System.out.println("Ce nombre est la moyenne");
           break;
           case 6: System.out.println("Ce nombre est tout de même grand");
           break;
           case 7: System.out.println("Ce nombre est grand");
           break;
           default: System.out.println("Ce nombre est très grand puisqu'il est compris entre 8 et 10");
           }
           
           int k = 10, l = 20;
           int max = (k < l) ? l * 2 : k * 2 ; //Ici max vaut 2 * 20 soit 40$
           System.out.println("La valeur max est " + max);
	}
;
	}


