package sdz1;

public class metho2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tab = {"toto", "tata", "titi", "tete"};
		parcourirTableau(tab);
	}
	static void parcourirTableau(String[] tab)
	{
	for(String str : tab)
	System.out.println(str);
	}
	static void parcourirTableau(int[] tab)
	{
	for(int str : tab)
	System.out.println(str);
	}
}
