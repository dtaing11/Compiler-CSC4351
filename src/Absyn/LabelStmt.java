package Absyn;
import Symbol.Symbol;
public class LabelStmt extends Stmt{
    public Symbol name;

    public LabelStmt (int p, Symbol n ){
        pos = p;
        name = n;
    }


}
