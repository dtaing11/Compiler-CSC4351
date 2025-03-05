package Absyn; 


public class StorageClass  {
    public boolean isExtern;
    public boolean isStatic;
    public boolean inLine;
    public StorageClass (boolean isEx, boolean isStat, boolean inL){
        isExtern = isEx;
        isStatic = isStat;
        inLine = inL;
    }
}
