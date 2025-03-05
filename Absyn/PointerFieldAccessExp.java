package Absyn;
import Symbol.Symbol;
public class PointerFieldAccessExp extends Exp {
    public Exp expr;
    public Symbol name;

    public PointerFieldAccessExp (int p , Exp e1, Symbol n ){
        pos =  p;
        expr = e1;
        name = n ;
    }

}
