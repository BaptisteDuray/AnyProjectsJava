package nfa032;

public class polymorphe {

	public static void main(String[] args) throws NombreHabitantException, NomVilleException {
		// TODO Auto-generated method stub
        //Def d'un tableau de ville null
	
Ville[] tableau = new Ville[6];

        //Définition d'un tableau de noms de Villes et d'un tableau de nombres d'habitants

String[] tab = {"Marseille", "lille", "caen", "lyon", "paris","nantes"};
int[] tab2 = {123456, 78456, 654987, 75832165, 1594,213};

/* Les 3 premiers éléments du tableau seront des Villes,et le reste, des capitales
*/
for(int i = 0; i < 6; i++){
if (i <3){
Ville V = new Ville(tab[i], tab2[i], "france");
tableau[i] = V;
}
else{
Capitale C = new Capitale(tab[i], tab2[i], "france","Macron");
tableau[i] = C;
}
}
        //il ne nous reste plus qu'à décrire tout notre tableau !
for(Ville v : tableau){
System.out.println(v.decrisToi()+"\n");
}
}
}



