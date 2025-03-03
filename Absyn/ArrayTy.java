package Absyn;

public class ArrayTy extends Ty {
    public Ty baseType;
    public int size;

    public ArrayTy(int p, Ty bt, int s) {
        pos = p;
        baseType = bt;
        size = s;
    }
}
