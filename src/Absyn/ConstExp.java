package Absyn;

public class ConstExp extends Exp {
    public final Exp exp1;
    public ConstExp(int p, Exp p1) { pos = p; exp1 = p1; }
}
