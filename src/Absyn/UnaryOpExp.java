package Absyn;


public class UnaryOpExp extends Exp {
    public String op;
    public Exp expr ;
    public boolean prefix;

    public UnaryOpExp (int p, String o, Exp e, boolean pre ){
            pos = p;
            op = o;
            expr = e;
            prefix = pre;

    }

}
