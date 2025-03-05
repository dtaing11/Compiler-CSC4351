package Absyn;

public class PointerTy extends Ty {
    public Ty baseType;


    public PointerTy(int p, Ty bt, int l) {
        pos = p;
        baseType = bt;

    }
}
