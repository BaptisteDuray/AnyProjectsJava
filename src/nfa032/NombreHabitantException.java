package nfa032;

class NombreHabitantException extends Exception{

	
	public NombreHabitantException(int nbre){
System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
System.out.println("\t => " + nbre);

	}
}