package Absyn;

public class BinOpExp extends Exp {
    public Exp exp1 , exp2;
    String sym;
    public BinOpExp(int p1, Exp e1 , Exp e2, String s) {
        pos = p1;
        exp1 = e1;
        exp2 = e2;
        sym = s;
    }
}
