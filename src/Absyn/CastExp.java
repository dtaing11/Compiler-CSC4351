package Absyn;

public class CastExp extends Exp {
    public Exp exp1;
    public Ty type;

    public CastExp(int p1, Exp p2, Ty type) {
        pos = p1;
        exp1 = p2;
        this.type = type;
    }

}
