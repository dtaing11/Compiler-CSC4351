package Absyn;

public class TernaryOpExp extends Exp {
    public Exp exp1, exp2 , exp3;
    public TernaryOpExp (int p , Exp e1, Exp e2, Exp e3){
        pos = p;
        exp1 = e1;
        exp2 = e2;
        exp3 = e3;
    }
}
