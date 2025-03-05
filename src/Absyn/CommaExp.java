package Absyn;

public class CommaExp extends Exp{
    public Exp e1, e2;

    public CommaExp (int p, Exp expr1, Exp expr2){
        pos = p;
        e1 = expr1;
        e2 = expr2;
    }
}
