package Absyn;

public class MultiArrayTy extends Ty {
    public Ty ty;
    public int size1;
    public int size2;

    public MultiArrayTy (int p, Ty t, int s1,int s2){
        pos =p;
        ty = t;
        size1 = s1;
        size2 = s2;
    }
}
