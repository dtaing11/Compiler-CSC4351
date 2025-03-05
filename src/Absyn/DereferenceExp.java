package Absyn;

public class DereferenceExp extends Exp {
    public Exp pointer;
    public int level;  

    public DereferenceExp(int p, Exp ptr, int l) {
        pos = p;
        pointer = ptr;
        level = l;
    }
}
