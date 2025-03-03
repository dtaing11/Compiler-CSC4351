package Absyn; 


public class StorageClass  {
    public boolean isExtern;
    public boolean isStatic;

    public StorageClass (boolean isEx, boolean isStat){
        isExtern = isEx;
        isStatic = isStat;
    }
}
