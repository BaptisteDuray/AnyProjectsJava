package Genericite;

public class Duo<T, S> {
	
	
/**
* Variable d'instance de type T
*/
private T valeur1;

/**
* Variable d'instance de type S
*/
private S valeur2;

/**
* Constructeur par défaut
*/
public Duo(){
this.valeur1 = null;
this.valeur2 = null;
}

/**
* Constructeur avec paramètres
* @param val1
* @param val2
*/
public Duo(T val1, S val2){
this.valeur1 = val1;
this.valeur2 = val2;
}

/**
* Méthodes d'initialisation des deux valeurs
* @param val1
* @param val2
*/
public void setValeur(T val1, S val2){
this.valeur1 = val1;
this.valeur2 = val2;
}

/**
* Retourne la valeur T
* @return
*/
public T getValeur1() {
return valeur1;
}

/**
* Définit la valeur T
* @param valeur1
*/
public void setValeur1(T valeur1) {
this.valeur1 = valeur1;
}

/**
* retourne la valeur S
* @return
*/
public S getValeur2() {
return valeur2;
}

/**
* définit la valeur S
* @param valeur2
*/
public void setValeur2(S valeur2) {
this.valeur2 = valeur2;
}
}

