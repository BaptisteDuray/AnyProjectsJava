package Covariance;
 
public class ClassCloneable implements Cloneable {
 
    private String objecName = null;
 
    /**
     * @return Renvoie objecName.
     */
    public String getObjectName() {
        return objecName;
    }
    /**
     * @param objecName objecName à définir.
     */
    public void setObjectName(String objecName) {
        this.objecName = objecName;
    }
 
    /**
     * redéfinition de la méthode clone
     */
     @Override
    public Object clone() throws CloneNotSupportedException {
    ClassCloneable newRef = (ClassCloneable) super.clone();
 
        return newRef;
    }
 
}