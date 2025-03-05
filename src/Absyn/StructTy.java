package Absyn;

public class StructTy extends Ty {
    public VarDec[] fields;

    public StructTy(int p, VarDec[] f) {
        pos = p;
        fields = f;
    }
}
