package Genericite;

import java.util.ArrayList;

public class TestGen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Liste de voiture
ArrayList<Voiture> listVoiture = new ArrayList<Voiture>();
listVoiture.add (new Voiture());
listVoiture.add (new Voiture());
ArrayList<VoitureSansPermis> listVoitureSP = new
ArrayList<VoitureSansPermis>();
listVoitureSP.add (new VoitureSansPermis());
listVoitureSP.add (new VoitureSansPermis());
affiche(listVoiture);
affiche(listVoitureSP);
}
/**
* Avec cette méthode, on accepte aussi bien les collections de
Voiture
* que les collection de VoitureSansPermis
* @param list
*/
static void affiche(List<? extends Voiture> list){
for(Voiture v : list)
System.out.print(v.toString());
	}

}
