package nfa032;

public class Ville {
	
     public static int nbreInstance = 0;
     protected static int nbreInstanceBis = 0;
	 protected String nomVille;
	 protected String nomPays;
	 protected int nbreHabitant;
	 protected char categorie;

/**
* Constructeur par défaut
*/

public Ville() {
	
	System.out.println("Création d'une ville");
	nbreInstance++;
	nbreInstanceBis++;
	nomVille = "Inconnu";
	nomPays = "Inconnu";
	nbreHabitant = 0;
	this.setCategorie();
	}

/**
* Constructeur d'initialisation
* @param pNom
* Nom de la Ville
* @param pNbre
* Nombre d'habitants
* @param pPays
* Nom du pays
*/

public Ville(String pNom, int pNbre, String pPays) throws NombreHabitantException, NomVilleException
{
	if(pNbre < 0)
		throw new NombreHabitantException(pNbre);// on appelle le nouveau constructeur
	if(pNom.length() < 3)
        throw new NomVilleException("le nom de la ville est inférieur à 3 caractères !" + pNom);
	else
	{
nbreInstance++;
nbreInstanceBis++;

nomVille = pNom;
nomPays = pPays;
nbreHabitant = pNbre;
this.setCategorie();
}
}
//*****************************************************************************************
//ACCESSEURS et MUTATEURS
//*****************************************************************************************
public String getNomVille() {
	return nomVille;
}

public void setNomVille(String nomVille) {
	this.nomVille = nomVille;
}

public String getNomPays() {
	return nomPays;
}

public void setNomPays(String nomPays) {
	this.nomPays = nomPays;
}

public int getNbreHabitant() {
	return nbreHabitant;
}

public void setNbreHabitant(int nbreHabitant) {
	this.nbreHabitant = nbreHabitant;
}

public char getCategorie() {
	return categorie;
}

public void setCategorie(char categorie) {
	this.categorie = categorie;
}

//*****************************************************************************************
//METHODES DE CLASSE
//*****************************************************************************************
/**
* Définit la catégorie de la ville
*/
protected void setCategorie() {
int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
int i = 0;
this.categorie = categories[i];
}
/**
* Retourne la description de la ville
* @return description ville
*/
public String decrisToi(){
return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte :"+this.nbreHabitant+" => elle est donc de catégorie : "+this.categorie;
}
/**
* Retourne une chaîne de caractères selon le résultat de la comparaison
* @param v1
* objet Ville
* @return comparaison de deux ville
*/
public String comparer(Ville v1){
String str = new String();
if (v1.getNbreHabitant() > this.nbreHabitant)
str = v1.getNomVille()+" est une ville plus peuplée que "+this.nomVille;
else
str = this.nomVille+" est une ville plus peuplée que "+v1.getNomVille();
return str;


}

}

