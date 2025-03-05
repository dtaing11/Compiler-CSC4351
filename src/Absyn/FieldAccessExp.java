package Absyn;
import Symbol.Symbol;
public class FieldAccessExp extends Exp{
    public  Exp expr;
    public Symbol sym;
    public FieldAccessExp (int p, Exp e, Symbol name ){
        pos = p;
        expr = e;
        sym = name;
    }
}
