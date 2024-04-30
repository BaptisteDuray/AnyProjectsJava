package nfa032;
public class firstObjet {

	public static void main(String[] args) throws NombreHabitantException, NomVilleException  {
		// TODO Auto-generated method stub
		Ville v = new Ville("Washington", 12000000, "USA");
		Ville v1 = new Ville("Челябинск", 1100000, "Россия");
		Ville v2 = new Ville("Rio de Janeiro", 6748000, "Brasil");
		
		System.out.println("\n v = "+v.getNomVille()+" ville de "+v.getNbreHabitant()+ " habitants se situant en "+v.getNomPays());
		System.out.println(" v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitant()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitant()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
		
		Ville v3 = null;
		try  {v3 = new Ville("Re", -1500000, "France");} 
		//Gestion de l'exception sur le nombre d'habitants
		catch (NombreHabitantException e) {e.printStackTrace();
		v3 = new Ville();}
		//Gestion de l'exception sur le nom de la ville
		catch(NomVilleException e2){System.out.println(e2.getMessage());
        v = new Ville();}
		System.out.println(" v3 = "+v3.getNomVille()+" ville de "+v3.getNbreHabitant()+ " habitants se situant en "+v3.getNomPays());
		/*Nous allons interchanger les Villes v1 et v2 tout ça par l'intermédiaire d'un autre objet Ville*/
		
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		System.out.println(" v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitant()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitant()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
		/*nous allons maintenant interchanger leurs noms cette fois par le biais de leur accesseurs*/
		
		v1.setNomVille("Hong Kong");
		v2.setNomVille("Mexico");
		System.out.println(" v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitant()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitant()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
		
		System.out.println("\n\n"+v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi()+"\n\n");
		System.out.println(v1.comparer(v2));
		
        Capitale cap = new Capitale("Paris", 654987, "France", "Macron");
        System.out.println("\n"+cap.decrisToi());
        
		}
	}
        
        
        
        
	    


