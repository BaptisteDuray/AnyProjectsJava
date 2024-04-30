package nfa032;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville v= null;
		try {
			v = new Ville("Re",1500,"France");
		} catch (NombreHabitantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NomVilleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(v.toString());
	}

}
