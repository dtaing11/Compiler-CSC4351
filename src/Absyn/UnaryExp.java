package Absyn;

public class UnaryExp extends Exp {
    public Exp exp1;
    public String op;
    public UnaryExp(int p1, Exp p2, String op) {
        pos = p1;
        exp1 = p2;
        this.op = op;
    }
}
