package Absyn;

public class UnaryExpTyName extends Exp {
    public Ty ty;
    public UnaryExpTyName(int p, Ty x) {
        this.pos = p;
        this.ty = x;
    }
}
