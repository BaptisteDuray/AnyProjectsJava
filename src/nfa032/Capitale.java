package nfa032;

public class Capitale extends Ville {
private String president;
/**
*Constructeur par défaut
*/
public Capitale(){
//Ce mot clé appelle le constructeur de la classe mère.
super();
president = "aucun";
}
/**
* Constructeur d'initialisation de capitale
*/
public Capitale(String nom, int hab, String pays, String president) throws NombreHabitantException, NomVilleException{
super(nom, hab, pays);
this.president = president;
}
/**
 Description d'une capitale
*/
public String decrisToi(){
String str = super.decrisToi() + "\n \t ==>>" +
this.president + " est son président";
return str;
}
/**
* @return le nom du président
*/
public String getPresident() {
return president;
}
/**
* Définit le nom du président
* @param president
*/
public void setPresident(String president) {
this.president = president;
}
}