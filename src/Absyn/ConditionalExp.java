package Absyn;

public class ConditionalExp extends Exp {
    public Exp e1;
    public Exp e2;
    public Exp e3;
    public ConditionalExp(int p1, Exp e1, Exp e2, Exp e3) {
        pos = p1;
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

}
