package Genericite;

public class TestGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solo<Integer> val = new Solo<Integer>(12);
         Solo<String> valS = new Solo<String>("TOTOTOTO");
          Solo<Float> valF = new Solo<Float>(12.2f);
           Solo<Double> valD = new Solo<Double>(12.202568);
        int nbre = val.getValeur();
        
Duo<String, Boolean> dual = new Duo<String,Boolean>("toto", true);
System.out.println("Valeur de l'objet dual: val1 = "+ dual.getValeur1() + ", val2 = " + dual.getValeur2());

Duo<Double, Character> dual2 = new Duo<Double,Character>(12.25895, 'C');
System.out.println("Valeur de l'objet dual2: val1 =" + dual2.getValeur1() + ", val2 = " + dual2.getValeur2());


Duo<?, ?> dual3 = new Duo<String, Boolean>("Misha", false);
System.out.println("Valeur de l'objet dual3: val1 = "+ dual.getValeur1() + ", val2 = " + dual3.getValeur2());
dual3 = new Duo<Double, Character>();
dual3 = new Duo<Integer, Float>();
dual3 = new Duo<Solo, Solo>();
	}

}
