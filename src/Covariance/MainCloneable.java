package Covariance;

public class MainCloneable {
	
	public static void main(String[] args) {
 
        ClassCloneable classCloneable = new ClassCloneable();
        classCloneable.setObjectName("nouvel Objet Name");
        try{
            AutreClassCloneable newRef = (AutreClassCloneable)classCloneable.clone();
 
        }catch(Exception err){
            err.printStackTrace();
        }
}

}