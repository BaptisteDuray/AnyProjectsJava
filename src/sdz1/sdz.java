package sdz1;

public class sdz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.print("Hello World!\n");
            System.out.println("My name is");
            System.out.println("\nBaptiste");
            
            System.out.println("coucou mon \"coeur\"!");
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
            
            int x = 10, y = 20;
            int max = (x < y) ? y * 2 : x * 2 ; //Ici max vaut 2 * 20 soit 40$
            System.out.println("La valeur max est " + max);
	}
;
}
