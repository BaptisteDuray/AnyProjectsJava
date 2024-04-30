package Exception;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 20, i = 0;
        try { System.out.println(j/i);
}
        catch (ArithmeticException e) {
// TODO Auto-generated catch block
System.out.println("Division par zéro !" + e.getMessage());;
}
System.out.println("coucou toi !");
}
}