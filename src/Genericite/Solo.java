package Genericite;

public class Solo<T> {

	/**
* Variable d'instance
    */	
private T valeur;

/**
* Constructeur par défaut
*/
public Solo(){
this.valeur = null;
}

/**
* Constructeur avec paramètre
* Inconnu pour l'instant
* @param val
*/
public Solo(T val){
this.valeur = val;
}

/**
* Définit la valeur avec le paramètre
* @param val
*/
public void setValeur(T val){
this.valeur = val;
}

/**
* retourne la valeur déjà "castée" par la signature de la méthode !
* @return
*/
public T getValeur(){
return this.valeur;
}
}

