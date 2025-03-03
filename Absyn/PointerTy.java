package Absyn;

public class PointerTy extends Ty {
    public Ty baseType;
    public int level; 

    public PointerTy(int p, Ty bt, int l) {
        pos = p;
        baseType = bt;
        level = l;
    }
}
