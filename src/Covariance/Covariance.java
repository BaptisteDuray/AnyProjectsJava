package Covariance;

public class Covariance
{
    public static abstract class Animal
    {
        public abstract Animal getChild();
    }
     
    // La classe Chien redéfinit la méthode getChild d'Animal
    // sans utiliser la covariance
    public static class Chien extends Animal
    {
        @Override
        public Animal getChild()
        {
            return new Chien();
        }
    }
 
    // La classe ChienCovariant redéfinit la méthode getChild d'Animal
    // en utilisant la covariance, ça ne retourne plus un simple Animal
    // mais un ChienCovariant
    public static class ChienCovariant extends Animal
    {
        @Override
        public ChienCovariant getChild()
        {
            return new ChienCovariant();
        }
    }
     
    public static class Chat extends Animal
    {
        @Override
        public Chat getChild()
        {
            return new Chat();
        }
    }
     
    public static void main(String[] args)
    {
        // Ici on utilise le polymorphisme
        Animal animal1 = new Chien();
        Animal animal2 = new Chat();
        // La bonne méthode est appelée pour chaque classe fille
        // On manipule des objets "Animal", et pourtant
        // les getChild des bonnes classes filles sont appelés
        System.out.println(animal1.getChild().getClass().getSimpleName()); // Ca affiche bien "Chien"
        System.out.println(animal2.getChild().getClass().getSimpleName()); // Ca affiche bien "Chat"
         
        //------------------------------------------------------------
         
        // Ici le chien de base n'utilise pas la covariance
        Chien chien = new Chien();
        // On est obligé de cast le getChild qui retourne un Animal en Chien
        // Sinon -> erreur de compilation
        Chien chiot1 = (Chien) chien.getChild();
         
        // Ici on utilise la covariance
        ChienCovariant chienCovariant = new ChienCovariant();
        // Pas besoin de cast, la redéfinition de la fonction se suffit à elle même
        ChienCovariant chiot2 = chienCovariant.getChild();
    }
}