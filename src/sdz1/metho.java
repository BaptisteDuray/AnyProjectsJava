package sdz1;

public class metho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] tab = {"toto", "tata", "titi", "tete"};
		parcourirTableau(tab);
	}

	static void parcourirTableau(String[] tabBis)
	{
	for(String str : tabBis)
	System.out.println(str);
	}
	
	static String toString(String[] tab)
	{
	System.out.println("Méthode toString() ! ! !\n---------------------------");
	String retour = "";
	for(String str : tab)
	retour += str + "\n";
	return retour;
	}
}
